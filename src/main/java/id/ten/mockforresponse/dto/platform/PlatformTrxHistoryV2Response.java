package id.ten.mockforresponse.dto.platform;

import com.fasterxml.jackson.annotation.JsonInclude;
import id.ten.mockforresponse.controller.SubOrder;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlatformTrxHistoryV2Response {
    private String type;
    private String requestId;
    private String transactionReferenceId;
    private int transactionTime;
    private String currency;
    private Long amount;
    private String status;
    private String externalPlatformId;
    private String repaymentChannel;
    private String repaymentMethod;
    private SubOrder subOrders;
}
