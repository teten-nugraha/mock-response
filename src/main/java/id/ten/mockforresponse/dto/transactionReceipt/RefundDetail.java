package id.ten.mockforresponse.dto.transactionReceipt;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RefundDetail {
    private String refundId;
    private float refundAmount;
    private String refundTo;
    private String status;
    private String refundTime;
}
