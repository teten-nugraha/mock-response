package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RefundV3 {
    private String refundId;
    private String refundTime;
    private String currency;
    private String amount;
    private String status;
    private String refundDestination;
    private String goPayPhoneNumber;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
}
