package id.ten.mockforresponse.dto.transactionReceipt;

import java.util.*;
import lombok.*;
import lombok.Data;

@Data
@ToString
@Builder
public class OverpaidWithdrawal {
    public String overpaidOrderId;
    public String settleTime;
    public String currency;
    public int amount;
    public String status;
    public String refundDestination;
}
