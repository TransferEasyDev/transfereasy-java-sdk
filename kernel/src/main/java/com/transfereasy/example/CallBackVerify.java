package main.java.com.transfereasy.example;

import main.java.com.transfereasy.api.TransfereasySignature;


/**
 * 验签方法：
 *
 * 1. 取header中的QueryString字段。
 * 2. 将QueryString以及header中的Signature值使用SHA-256验签。公钥请联系TransferEasy获取。
 * 3. header中的Timestamp值为时间戳, 如有需要, 可以验证本次请求是否超时。
 */
public class CallBackVerify {

    public static void main(String[] args) throws Exception {
        String signature = "qddtmReX5kapZfB2YStRYqfmuS485sFKgfaEhmJjHTwpdwF6EUfnBmrDjhK7+OEArWqPtU8hAZDevieMCbOokxzNteKwYWz1o1dL3u2+T2iYfXjbI2vsSiqIjyden5Woj8qtGubfo5CBdgZgrmIuzytPcmiUUCp7hCFaYpm2U7kiiFJrWesYhfUIJPehNn06kvAo2Ara54Cw5W1+lXU6ia1bkn2C7PEFebQAcVfxzJ6R64iN8BWwQ8Vnl7UopxDpp+1cuSS/kBLycSmo7j6uJoL/EJtMby7bLGi//ZQinC5TPj82+FzcjEHRYetUO0lLyie5o+wSQ8hZ6f0HN0Md2Q==";
        // 已排序的json字符串
        String queryString = "{\"entity\": {\"beneficiaries\": [{\"amount\": 160.0, \"bank_account\": {\"bank\": {\"address\": \"\", \"branch\": \"\", \"bsb_code\": \"\", \"name\": \"bankName102\", \"routing_number\": \"\", \"swift_code\": \"\"}, \"bank_account_name\": \"bankAccountName102\", \"bank_account_number\": \"bankAccountNumber102\", \"country\": \"USA\", \"currency\": \"USD\", \"iban\": \"\", \"no\": \"LB4W7GZRMZKISDBSSITZRF\", \"purpose\": \"BENEFICIARY\", \"status\": \"APPROVED\"}, \"currency\": \"USD\"}], \"cutoff_time\": \"2019-03-27 20:15:02\", \"delivery_time\": \"2019-03-28 18:15:02\", \"fee_amount\": 1.6, \"fee_currency\": \"USD\", \"fx_rate\": \"USD/USD 1.0000\", \"memo\": null, \"no\": \"2019032718150269656\", \"order_time\": \"2019-03-27 18:15:02\", \"out_trade_id\": \"60dbda0e2ce140a3b6ae2a3e53de63f3\", \"purpose\": \"\\u5546\\u6237\\u63d0\\u73b0\", \"send_amount\": 160.0, \"send_currency\": \"USD\", \"sender_name\": \"\\u6d0b\\u7801\\u5934\", \"state\": \"CANCELED\"}, \"notify_code\": \"TRANSFER_CANCELED\"}";

        /*
         * 排序Tips:
         * 使用 main.java.com.transfereasy.entity下的类来接收callback数据生成对应entity的对象
         * 建立TreeMap 类成员变量名为key, 值为value, TreeMap会自动将其按字母表排序
         * */
        Boolean result = TransfereasySignature.verify(queryString, signature);
        System.out.println(result);
    }

}
