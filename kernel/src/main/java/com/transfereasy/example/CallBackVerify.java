package main.java.com.transfereasy.example;

import main.java.com.transfereasy.api.TransfereasySignature;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


/**
 * 验签方法：
 *
 * 1. 将收到的回调内容(request.body)按照参数名ASCII码从小到大排序（字典序）生成json字符串，得到query_string。
 * 2. 将query_string以及header中的Signature值使用SHA-256验签。公钥请联系TransferEasy获取。
 * 3. header中的Timestamp值为时间戳, 如有需要, 可以验证本次请求是否超时。
 */
public class CallBackVerify {
    public static void main(String[] args) throws Exception {
        String signature = "Hn05mLFggEd0B9SJP7rcSNdolhURUG/CW4wu5sIWXmrb17P7fqTVhKC2R7W80qTLpHoHs0xsgE/tEo9/e87FdkArtf2TqnqyxdW23WUXx8La5JbvMiAFvHlfZeTY2CzUmTyyEqn5oPEiUo1riXVAIcPbuSrrQXO3ObbfPIAozyn4V4vFUUmMDXJB9JeG8VnVKU0Ja5ov3H3m5TUkzeksSosfLRzA2Z9/C+z2HiHOymkSohJUkfIC3pc7UTI1K0QhMQhZHFM0or+GSGMvKL4ypLg1ZFBJ12QYfdGs4X9a6KiHkjQAGcTxCliQUs/yHcWUDJvbXNB3wVDcJUPYUx86/g==";
        // 已排序的json字符串
        String paramStr = "{\"entity\": {\"created\": \"2018-10-09 14:48:42\", \"escrow_account\": {\"bank\": {\"address\": \"21/F, Bank of America Tower,12 Harcourt Road, Central, Hong Kong\", \"branch\": \"Hong Kong Branch\", \"bsb_code\": \"\", \"name\": \"China Merchants Bank\", \"routing_number\": \"\", \"sort_code\": \"\", \"swift_code\": \"CMBCHKHH\"}, \"bank_account_name\": \"SINO ALLIED (HK) LIMITED\", \"bank_account_number\": \"20561677\", \"beneficiary_address\": \"RM 1842, 18/F, RADIO CITY, 505-511 HENNESSY ROAD, CAUSEWAY BAY, HONGKONG\", \"country\": \"HKG\", \"currency\": \"USD\", \"iban\": null, \"telephone\": \"00 852 9346 7950\"}, \"fee_amount\": 0.0, \"fee_currency\": \"USD\", \"invoice_amount\": 100.0, \"invoice_currency\": \"USD\", \"is_canceled\": false, \"is_credit\": true, \"memo\": \"\", \"no\": \"2018100914484238843\", \"out_trade_id\": null, \"products\": [], \"received_amount\": 100.0, \"received_currency\": \"USD\", \"recipient\": {\"address\": {\"city\": \"\\u6d4b\\u8bd5\\u57ce\\u5e02\", \"country\": \"CHN\", \"line1\": \"\\u6d4b\\u8bd5\\u5730\\u5740\", \"postal_code\": \"123143\", \"state\": \"\\u6d4b\\u8bd5\\u5dde\"}, \"bank_account_number\": \"\", \"bank_name\": \"\", \"dob\": \"2018-10-09\", \"document_number\": \"123543636\", \"document_type\": \"CHN/ID\", \"email\": \"123@test.com\", \"entity_type\": \"INDIVIDUAL\", \"first_name\": \"\\u6d4b\", \"last_name\": \"\\u8bd5\", \"mobile\": \"18878787878\"}, \"reference\": \"420156\"}, \"notify_code\": \"INVOICE_DONE\"}";
        /*
        * 排序Tips:
        * 使用 main.java.com.transfereasy.entity下的类来接收callback数据生成对应entity的对象
        * 建立TreeMap 类成员变量名为key, 值为value, TreeMap会自动将其按字母表排序
        * */
        Boolean result = TransfereasySignature.verify(paramStr, signature);
        System.out.println(result);
    }

}
