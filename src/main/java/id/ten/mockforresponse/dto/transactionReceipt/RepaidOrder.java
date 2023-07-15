package id.ten.mockforresponse.dto.transactionReceipt;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RepaidOrder {

    private String title;
    private int currentInstallment;
    private int totalInstallments;
    private String transactedAt;
    private int amount;
    private float interestRate;

}
