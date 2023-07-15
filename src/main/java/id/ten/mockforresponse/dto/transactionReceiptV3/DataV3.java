package id.ten.mockforresponse.dto.transactionReceiptV3;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataV3 {

    private String type;
    private String entity;
    private OrderV3 order;
    private RepaymentV3 repayment;
    private RefundV3 refund;
    private OverpaidWithdrawalV3 overpaidWithdrawal;


}
