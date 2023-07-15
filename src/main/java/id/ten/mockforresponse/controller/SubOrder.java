package id.ten.mockforresponse.controller;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class SubOrder {
    private String subOrderId;
    private String merchantId;
    private String merchantName;
    private String skuId;
    private String skuName;
    private String transactionId;
    private int serviceType;
}
