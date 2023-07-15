package id.ten.mockforresponse.dto.transactionReceipt;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class TransactionReceiptDto {
    public boolean success;
    public Data data;
}
