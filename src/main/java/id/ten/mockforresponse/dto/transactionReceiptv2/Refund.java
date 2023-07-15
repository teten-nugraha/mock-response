package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Refund {
    private String refundId;
    private String refundTime;
    private String currency;
    private long amount;
    private String status;
    private String refundDestination;
    private String goPayPhoneNumber;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
}
