package id.ten.mockforresponse.dto.transactionReceiptV3;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LateFeeRebalance {
    private Long lateFeeRebalancedAmount;
    private String source;
}
