package id.ten.mockforresponse.dto.transactionHistory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionV2 {

    private String type;
    private String transactionId;
    private String transactionTime;
    private String currency;
    private Long amount;
    private String status;
    private String entity;
    private Integer serviceId=0;
    private String title="";
    private String gopayTransactionId="";
    private String merchantName="";
    private String orderDescription="";

}
