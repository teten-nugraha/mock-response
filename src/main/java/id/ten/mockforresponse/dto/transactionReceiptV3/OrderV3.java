package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class OrderV3 {
    private String orderId;
    private String createTime;
    private String currency;
    private int periodType;
    private long amount;
    private long outstandingAmount;
    private long repaidAmount;
    private long principalAmount;
    private long refundAmount;
    private long interestAmount;
    private long serviceFeeAmount;
    private String status;
    private String agreementUrl;
    private int serviceId;
    private String title;
    private String serviceIconUrl;
    private String gopayTransactionId;
    private List<InstallmentV3> installments;
}
