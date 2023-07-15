package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Installment {
    private String orderId;
    private long amount;
    private int periodType;
    private int currentPeriod;
    private String billStatus;
    private String repaymentStatus;
    private String refundStatus;
    private String dueDate;
}