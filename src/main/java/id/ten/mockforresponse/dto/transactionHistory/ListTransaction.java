package id.ten.mockforresponse.dto.transactionHistory;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ListTransaction {

    private List<TransactionV2> transactions;
}
