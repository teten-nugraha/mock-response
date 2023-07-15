package id.ten.mockforresponse.dto.transactionHistory;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class Transaction {
    private List<TransactionV2> transactions;
}
