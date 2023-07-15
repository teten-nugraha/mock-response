package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class InstallmentV3 {
    private String orderId;
    private Long amount;
    private int periodType;
    private int currentPeriod;
    private String billStatus;
    private String repaymentStatus;
    private String refundStatus;
    private String dueDate;
    private String entity;
}
