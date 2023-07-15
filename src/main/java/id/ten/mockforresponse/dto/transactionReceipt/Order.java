package id.ten.mockforresponse.dto.transactionReceipt;

import java.util.*;
import lombok.*;
import lombok.Data;

@Data
@ToString
@Builder
public class Order {

    public String orderId;
    public String createTime;
    public String currency;
    public int periodType;
    public int amount;
    public int outstandingAmount;
    public int repaidAmount;
    public int principalAmount;
    public int interestAmount;
    public int serviceFeeAmount;
    public int refundAmount;
    public String status;
    public String agreementUrl;
    public List<Installment> installments;
}
