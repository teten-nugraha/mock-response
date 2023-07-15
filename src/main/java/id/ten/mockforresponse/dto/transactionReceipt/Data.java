package id.ten.mockforresponse.dto.transactionReceipt;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.List;

@lombok.Data
@ToString
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    private String gopayTransactionId;
    private String transactedAt;
    private String currency;
    private int amount;
    private int outstanding_amount;
    private int repaid_amount;
    private int interest_fee;
    private int service_fee;
    private String status;
    private String agreement_url;
    private int serviceId;
    private String serviceIconUrl;
    private String title;
    private String transactionAgreementUrl;
    private String repaymentStatus;
    private List<Installment> installments;
    private List<RepaidOrder> repaidOrders;
    private List<RefundDetail> refundDetails;
    private List<OverpaidDetail> overpaidDetails;
}
