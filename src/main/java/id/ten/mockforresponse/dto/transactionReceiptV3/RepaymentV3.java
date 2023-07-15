package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class RepaymentV3 {
    private String repaymentId;
    private String repaymentTime;
    private String currency;
    private Long amount;
    private String billMonth;
    private String status;
    private String repaymentMethod;
    private Long lateFee;
    private int serviceId;
    private String title;
    private String gopayTransactionId;
    private List<LateFeeRebalance> lateFeeRebalancedList;
    private List<InstallmentV3> installments;
}
