package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class Repayment {
    private String repaymentId;
    private String repaymentTime;
    private String currency;
    private long amount;
    private String billMonth;
    private String status;
    private String repaymentMethod;
    private int lateFee;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
    private List<Installment> installments;
}