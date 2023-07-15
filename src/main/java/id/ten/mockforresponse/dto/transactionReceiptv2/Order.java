package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class Order {
    private String orderId;
    private String createTime;
    private String currency;
    private int periodType;
    private long amount;
    private long outstandingAmount;
    private long repaidAmount;
    private long principalAmount;
    private long interestAmount;
    private long serviceFeeAmount;
    private long refundAmount;
    private String status;
    private String agreementUrl;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
    private List<Installment> installments;
}