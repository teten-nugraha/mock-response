package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class OverpaidWithdrawal {
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
