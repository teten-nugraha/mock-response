package id.ten.mockforresponse.dto.transactionReceipt;

import java.util.*;
import lombok.*;
import lombok.Data;

@Data
@ToString
@Builder
public class Refund {

    public String refundId;
    public String refundTime;
    public String currency;
    public int amount;
    public String status;
    public String refundDestination;
    public String goPayPhoneNumber;
}
