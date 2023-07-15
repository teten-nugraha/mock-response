package id.ten.mockforresponse.service;

import static id.ten.mockforresponse.dto.transactionHistory.Entity.MAB;

import id.ten.mockforresponse.dto.transactionHistory.Transaction;
import id.ten.mockforresponse.dto.transactionHistory.TransactionStatus;
import id.ten.mockforresponse.dto.transactionHistory.TransactionType;
import id.ten.mockforresponse.dto.transactionHistory.TransactionV2;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class TransactionHistoryService {

    public Transaction getTrxData() {
        final List<TransactionV2> transactionsList = generateData();

        Transaction transactions = Transaction.builder()
                .transactions(transactionsList)
                .build();

        return transactions;
    }

    private List<TransactionV2> generateData() {
        List<TransactionV2> temp = new ArrayList<>();

        TransactionV2 obj1 = TransactionV2.builder()
                .type("ORDER")
                .transactionId("order_48670273")
                .transactionTime("2023-05-31T00:02:07.291+07:00")
                .currency("IDR")
                .amount(2400L)
                .status("SUCCESS")
                .entity("MAB")
                .serviceId(1)
                .title("Family Mart")
                .gopayTransactionId(UUID.randomUUID().toString())
                .merchantName("Tokopedia")
                .orderDescription("Beli jam tangan")
                .build();

        TransactionV2 obj2 = TransactionV2.builder()
                .type("REPAYMENT")
                .transactionId("repay_llitgrnpg8")
                .transactionTime("2023-05-30T00:02:07.291+07:00")
                .currency("IDR")
                .amount(1400L)
                .status("SUCCESS")
                .entity("MAB")
                .title("Starbuck")
                .gopayTransactionId(UUID.randomUUID().toString())
                .merchantName("Tiket.com")
                .orderDescription("Beli kopi")
                .build();

        TransactionV2 obj3 = TransactionV2.builder()
                .type("ORDER")
                .transactionId("order_llitgrnpg8")
                .transactionTime("2023-05-29T00:02:07.291+07:00")
                .currency("IDR")
                .amount(14020L)
                .status("SUCCESS")
                .entity("MAB")
                .serviceId(3)
                .title("GoFood")
                .gopayTransactionId(UUID.randomUUID().toString())
                .merchantName("Alfamart")
                .orderDescription("Belanja Minyak sayur")
                .build();

        temp.add(obj1);
        temp.add(obj2);
        temp.add(obj3);

        return temp;
    }
}
