package id.ten.mockforresponse.dto.transactionReceipt;

import java.util.*;
import lombok.*;
import lombok.Data;

@Data
@ToString
@Builder
public class Repayment {

    public String repaymentId;
    public String repaymentTime;
    public String currency;
    public int amount;
    public String billMonth;
    public String status;
    public String repaymentMethod;
    public int lateFee;
    public List<Installment> installments;
}
