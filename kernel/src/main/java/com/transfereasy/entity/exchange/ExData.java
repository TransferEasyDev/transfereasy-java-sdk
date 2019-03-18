package main.java.com.transfereasy.entity.exchange;

@lombok.Data
class ExData {
    private String buy_amount;
    private String buy_currency;
    private String charge_amount;
    private String charge_currency;
    private String order_time;
    private String cutoff_time;
    private String delivery_time;
    private String fx_rate;
    private String no;
    private String out_trade_id;
    private String purpose;
    private String sell_amount;
    private String sell_currency;
    private String state;
}
