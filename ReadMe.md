
![TransferEasy](https://s.transfereasy.com/logo/logo-2-black.png)
<br>
![Travis](https://api.travis-ci.org/nukeop/nuclear.svg?branch=master)
# 汇通天下, 无处不达

* [官方网站](https://www.transfereasy.com)
* [注册体验](https://business.transfereasy.com/Home/register)
* [商务合作](https://www.transfereasy.com/home/merchant)


## 结构

```$xslt
└── src
    └── main
        └── java
            └── com
                └── transfereasy 
                    ├── api       // API 
                    ├── entity    // Response实体类
                    ├── example   // DEMO
                    ├── resources // 配置文件
                    └── tool      // 工具 
```

## 示例
```
/**
 * 配置文件
 * 
 * src
 *  └── main
 *      └── java
 *          └── com
 *              └── transfereasy 
 *                  └── resources
 *                      └── config.properties
 */

SECRET = your_secret         //登录transfereasy后台进入设置页面查看
ACCOUNT_NO = your_account_no //登录transfereasy后台进入设置页面查看
TE_HOST = https://stable-api.transfereasy.com

```

```java
/**
 * Demo: 查询汇率
 */
package main.java.com.transfereasy.example.rate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import API接口类 Rate
//import 实体类 Response
import main.java.com.transfereasy.api.Rate;
import main.java.com.transfereasy.entity.rate.Response;

// import 第三方库
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class GetRate {
    public static void main(String[] args) throws IOException {
        
        //1. 新建对象
        Rate api = new Rate();
        
        //2. 准备参数
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("sell_currency", "USD"));
        params.add(new BasicNameValuePair("buy_currency", "CNY"));

        //3. 执行
        Response response = api.getRate(params);

        //4. 输出结果
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}


```

## 依赖

* [lombook.jar](https://projectlombok.org/downloads/lombok.jar)
* [apache httpclient 4.5.6](http://mirror.bit.edu.cn/apache//httpcomponents/httpclient/binary/httpcomponents-client-4.5.6-bin.tar.gz)
* [java-json.jar](http://www.java2s.com/Code/JarDownload/java-json/java-json.jar.zip)
* [gson.jar 2.8.5](https://search.maven.org/artifact/com.google.code.gson/gson/2.8.5/jar)

