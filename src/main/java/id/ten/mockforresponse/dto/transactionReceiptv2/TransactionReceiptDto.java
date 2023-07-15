package id.ten.mockforresponse.dto.transactionReceiptv2;

import id.ten.mockforresponse.dto.transactionReceipt.Data;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class TransactionReceiptDto {
    public boolean success;
    public Data data;
}
