package main.java.com.transfereasy.api;


import main.java.com.transfereasy.entity.token.Response;
import main.java.com.transfereasy.tool.Tool;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.StringEntity;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Request {
    private CloseableHttpClient httpclient = HttpClients.createDefault();
    private HttpResponse response;

    //common
    private void printRequest(String url, String params) {
        System.out.println("========接口url==============");
        System.out.println(url);
        System.out.println("========request参数==========");
        System.out.println(params);
    }

    private String exchangeResult(HttpResponse response)
            throws IOException {
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }

    private String requestToken()
            throws IOException {
        HttpResponse response;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("account_no", Tool.getAccountNo()));
        params.add(new BasicNameValuePair("secret", Tool.getSecret()));

        HttpPost httpPost = new HttpPost(Tool.getHost() + "/oauth/token");
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, Consts.UTF_8);
        httpPost.setEntity(entity);
        response = httpclient.execute(httpPost);
        String msg = exchangeResult(response);

        Gson gson = new GsonBuilder().create();
        Response tokenResponse = gson.fromJson(msg, Response.class);
        String token = tokenResponse.getData().getToken();
        System.out.println("======token=================");
        System.out.println(token);
        System.out.println("============================");
        return token;
    }

    //Get, Delete
    private String getFullUrl(String url, List<NameValuePair> params) {
        StringBuilder getUrl = new StringBuilder();
        getUrl.append(url);

        if(params.size() > 0) {
            getUrl.append("?");
            getUrl.append(params.get(0).toString());
            for (int i = 1 ; i < params.size(); i++) {
                getUrl.append("&");
                getUrl.append(params.get(i).toString());
            }
        }
        System.out.println(getUrl.toString());
        return getUrl.toString();

    }

    public String requestGet(String url, List<NameValuePair> params)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpGet httpGet = new HttpGet(getFullUrl(url, params));
        httpGet.setHeader("Authorization", "Bearer " + token);
        response = httpclient.execute(httpGet);

        return exchangeResult(response);
    }

    public String requestGet(String url, List<NameValuePair> params, String path)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpGet httpGet = new HttpGet(getFullUrl(url, params));
        httpGet.setHeader("Authorization", "Bearer " + token);
        response = httpclient.execute(httpGet);

        FileWriter wt = new FileWriter(path);
        BufferedWriter wf = new BufferedWriter(wt);
        BufferedReader rd =  new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line = "";

        while ((line = rd.readLine()) != null) {
            result.append(line);
            result.append("\n");
            wf.write(line + "\n");
        }
        wf.close();
        return result.toString();
    }

    public String requestDelete(String url, List<NameValuePair> params)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpDelete httpDelete = new HttpDelete(getFullUrl(url, params));
        httpDelete.setHeader("Authorization", "Bearer " + token);
        response = httpclient.execute(httpDelete);

        return exchangeResult(response);
    }

    /*
        POST
        JSON  参数为JSON请求
        List  参数为普通form参数请求
        MultipartEntityBuilder  参数带文件流的请求
     */

    public String requestPostWithoutToken(String url, List<NameValuePair> params)
        throws IOException {
        printRequest(url, params.toString());
        HttpPost httpPost = new HttpPost(url);
        UrlEncodedFormEntity postEntity = new UrlEncodedFormEntity(params, Consts.UTF_8);
        httpPost.setEntity(postEntity);
        response = httpclient.execute(httpPost);

        return exchangeResult(response);
    }

    //Post Json
    private HttpResponse postJson(String url, String params)
            throws IOException{
        printRequest(url, params);
        String token = requestToken();

        HttpPost httpPost = new HttpPost(url);

        httpPost.setHeader("Authorization", "Bearer " + token);
        httpPost.addHeader("Content-Type", "application/json; charset=utf-8");

        StringEntity entity = new StringEntity(params, "UTF-8");
        httpPost.setEntity(entity);
        response = httpclient.execute(httpPost);
        return response;

    }

    //json object
    public String requestPost(String url, JSONObject params)
            throws IOException {

        HttpResponse response = postJson(url, params.toString());
        return exchangeResult(response);
    }

    //json array
    public String requestPost(String url, JSONArray params)
            throws IOException {
        HttpResponse response = postJson(url, params.toString());
        return exchangeResult(response);
    }

    public String requestPost(String url, List<NameValuePair> params)
        throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Authorization", "Bearer " + token);
        UrlEncodedFormEntity postEntity = new UrlEncodedFormEntity(params, Consts.UTF_8);
        httpPost.setEntity(postEntity);
        response = httpclient.execute(httpPost);

        return exchangeResult(response);
    }

    public String requestPost(String url, MultipartEntityBuilder params)
        throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Authorization", "Bearer " + token);
        HttpEntity postEntity = params.build();
        httpPost.setEntity(postEntity);
        response = httpclient.execute(httpPost);

        return exchangeResult(response);
    }
    /*
        PUT
        JSON  参数为JSON请求
        List  参数为普通form参数请求
        MultipartEntityBuilder  参数带文件流的请求
     */
    public String requestPut(String url, JSONObject params)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpPut httpPut = new HttpPut(url);
        httpPut.setHeader("Authorization", "Bearer " + token);
        httpPut.addHeader("Content-Type", "application/json; charset=utf-8");
        StringEntity putEntity = new StringEntity(params.toString(), "UTF-8");
        httpPut.setEntity(putEntity);
        response = httpclient.execute(httpPut);

        return exchangeResult(response);
    }

    public String requestPut(String url, List<NameValuePair> params)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpPut httpPut = new HttpPut(url);
        httpPut.setHeader("Authorization", "Bearer " + token);
        UrlEncodedFormEntity putEntity = new UrlEncodedFormEntity(params, Consts.UTF_8);
        httpPut.setEntity(putEntity);
        response = httpclient.execute(httpPut);

        return exchangeResult(response);
    }

    public String requestPut(String url, MultipartEntityBuilder params)
            throws IOException {
        printRequest(url, params.toString());
        String token = requestToken();

        HttpPut httpPut = new HttpPut(url);
        httpPut.setHeader("Authorization", "Bearer " + token);
        HttpEntity putEntity = params.build();
        httpPut.setEntity(putEntity);
        response = httpclient.execute(httpPut);

        return exchangeResult(response);
    }


}
