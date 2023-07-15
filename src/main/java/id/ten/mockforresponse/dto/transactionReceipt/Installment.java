package id.ten.mockforresponse.dto.transactionReceipt;

import java.util.*;
import lombok.*;
import lombok.Data;

@Data
@ToString
@Builder
public class Installment {
    private int amount;
    private int periodeType;
    private int currentPeriod;
    private String repaymentStatus;
    private String dueDate;
}
