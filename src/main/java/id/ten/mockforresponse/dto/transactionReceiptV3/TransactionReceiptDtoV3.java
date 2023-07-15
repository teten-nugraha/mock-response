package id.ten.mockforresponse.dto.transactionReceiptV3;

import id.ten.mockforresponse.dto.transactionReceipt.Data;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class TransactionReceiptDtoV3 {
    public boolean success;
    public DataV3 data;
}
