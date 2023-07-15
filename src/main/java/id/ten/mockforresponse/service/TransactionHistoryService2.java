package id.ten.mockforresponse.service;

import id.ten.mockforresponse.dto.transactionReceipt.Type;
import id.ten.mockforresponse.dto.transactionReceiptv2.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionHistoryService2 {


    public DataV2 getTransactionReceipt(Type type) {
        if(Type.ORDER.equals(type)) {
            DataV2 data = new DataV2("MAB");
            data.setType(type.toString());
            data.setOrder(generateOrder());
            return data;

        }

        if(Type.REPAYMENT.equals(type)) {
            DataV2 data = new DataV2("MAB");
            data.setType(type.toString());
            data.setRepayment(genRepayment());
            return data;

        }

        if(Type.REFUND.equals(type)) {
            DataV2 data = new DataV2("MAB");
            data.setType(type.toString());
            data.setRefund(genRefund());
            return data;

        }

//        else if(Type.OVERPAID_WITHDRAWAL.equals(type)) {
//
//            // TODO
//
//        }

        return null;
    }

    private Refund genRefund() {
        Refund refund = Refund.builder()
                .refundId("refund_9293920230")
                .refundTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(8000)
                .status("FULL_REFUNDED")
                .refundDestination("CICIL_LIMIT")
                .goPayPhoneNumber("082882828828")
                .serviceId(2)
                .title("Family mart Bintaro")
                .gopayTransactionId("2930283023j2j323")
                .build();

        return refund;
    }

    private Order generateOrder() {
        return Order.builder()
                .orderId("1234567890")
                .createTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .periodType(3)
                .amount(24000)
                .outstandingAmount(1600)
                .repaidAmount(8000)
                .principalAmount(500)
                .interestAmount(1000)
                .serviceFeeAmount(1000)
                .refundAmount(0)
                .status("SUCCESS")
                .agreementUrl("agreement url")
                .serviceId(2)
                .title("Family mart Bintaro")
                .gopayTransactionId("2930283023j2j323")
                .installments(genInstallments())
                .build();
    }

    private List<Installment> genInstallments() {
        List<Installment> data = new ArrayList<>();

        Installment installment1 = Installment.builder()
                .orderId("9us0dfjosdjf")
                .amount(9000)
                .periodType(0)
                .currentPeriod(1)
                .billStatus("bill status")
                .repaymentStatus("repayment staus")
                .refundStatus("string")
                .dueDate("2022-11-25T00:00:00.000+07:00")
                .build();

        data.add(installment1);

        return data;
    }

    private Repayment genRepayment() {
        Repayment repayment = Repayment.builder()
                .repaymentId("23029302o")
                .repaymentTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(8000l)
                .billMonth("string")
                .status("SUCCESS")
                .repaymentMethod("string")
                .lateFee(0)
                .serviceId(2)
                .title("Family mart Bintaro")
                .gopayTransactionId("2930283023j2j323")
                .installments(genInstallments())
                .build();

        return repayment;
    }
}
