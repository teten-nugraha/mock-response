package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OverpaidWithdrawalV3 {

    private String overpaidOrderId;
    private String settleTime;
    private String currency;
    private long amount;
    private String status;
    private String refundDestination;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
}
