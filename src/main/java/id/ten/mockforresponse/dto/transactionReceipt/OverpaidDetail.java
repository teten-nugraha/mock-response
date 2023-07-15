package id.ten.mockforresponse.dto.transactionReceipt;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OverpaidDetail {
    private String overpaidId;
    private int amount;
    private String refundTo;
    private String status;
    private String settleTime;
    private String refundDestination;
}
