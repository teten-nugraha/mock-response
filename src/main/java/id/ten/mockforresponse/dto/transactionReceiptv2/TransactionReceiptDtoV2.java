package id.ten.mockforresponse.dto.transactionReceiptv2;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TransactionReceiptDtoV2 {
    public boolean success;
    public DataV2 data;
}
