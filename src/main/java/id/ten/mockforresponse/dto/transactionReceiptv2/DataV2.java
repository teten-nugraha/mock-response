package id.ten.mockforresponse.dto.transactionReceiptv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataV2 {
    private String type;
    private String entity;
    private Order order;
    private Repayment repayment;
    private Refund refund;
    private OverpaidWithdrawal overpaidWithdrawal;

    public DataV2(String entity) {
        this.entity = entity;
    }
}
