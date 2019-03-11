package main.java.com.transfereasy.api;

import main.java.com.transfereasy.tool.Tool;
import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TransfereasySignature {

    private static String map2String4verfiy(Map<String, Object> params) {
        TreeMap<String, Object> sortedParams = new TreeMap<String, Object>(params);
        Set<String> keys = sortedParams.keySet();

        StringBuilder result = new StringBuilder();
        for (String key: keys) {
            result.append(key).append("=").append(sortedParams.get(key).toString()).append("&");
        }
        return result.substring(0, result.length()-1);
    }

    private static String getKey(String filename) throws IOException {
        // Read key from file
        StringBuilder strKeyPEM = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            strKeyPEM.append(line).append("\n");
        }
        br.close();
        return strKeyPEM.toString();
    }

    private static RSAPublicKey getPublicKeyFromString(String key) throws GeneralSecurityException {
        String publicKeyPEM = key;
        publicKeyPEM = publicKeyPEM.replace("-----BEGIN PUBLIC KEY-----\n", "");
        publicKeyPEM = publicKeyPEM.replace("-----END PUBLIC KEY-----", "");
        byte[] encoded = Base64.decodeBase64(publicKeyPEM);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return (RSAPublicKey) kf.generatePublic(new X509EncodedKeySpec(encoded));
    }


    private static RSAPublicKey getPublicKey(String publicKey) throws IOException, GeneralSecurityException {

        String publicKeyPEM = "";
        if (publicKey.startsWith("-----BEGIN")) {
            publicKeyPEM = publicKey;
        } else {
            publicKeyPEM = getKey(publicKey);
        }

        return getPublicKeyFromString(publicKeyPEM);
    }

    public static Boolean verify(String strParams, String sign) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(getPublicKey(Tool.getPublicKey()));
        signature.update(strParams.getBytes("UTF-8"));
        return signature.verify(Base64.decodeBase64(sign));
    }


}
