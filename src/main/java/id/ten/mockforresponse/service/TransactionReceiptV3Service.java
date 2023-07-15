package id.ten.mockforresponse.service;

import id.ten.mockforresponse.dto.transactionReceipt.Data;
import id.ten.mockforresponse.dto.transactionReceipt.Installment;
import id.ten.mockforresponse.dto.transactionReceipt.TransactionReceiptDto;
import id.ten.mockforresponse.dto.transactionReceipt.Type;
import id.ten.mockforresponse.dto.transactionReceiptV3.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionReceiptV3Service {

    public TransactionReceiptDtoV3 getOrderTransactionReceipt(Type type) {
        DataV3 data = genData();

        if(Type.ORDER.equals(type)) {

            data.setType(type.toString());
            data.setOrder(generateOrder());

        }else if(Type.REPAYMENT.equals(type)) {

            data.setType(type.toString());
            data.setRepayment(genRepaymentV3());

        }else if(Type.REFUND.equals(type)) {

            data.setType(type.toString());
            data.setRefund(genRefund());

        }else if(Type.OVERPAID_WITHDRAWAL.equals(type)) {

            data.setType(type.toString());
            data.setOverpaidWithdrawal(genOverpaid());

        }



        TransactionReceiptDtoV3 dto =
                TransactionReceiptDtoV3.builder().data(data).success(true).build();

        return dto;
    }

    private DataV3 genData() {
        DataV3 data = new DataV3();
        data.setEntity("MAB");
        return data;
    }

    private List<InstallmentV3> generateInstallment() {

        InstallmentV3 data = new InstallmentV3();
        data.setOrderId("orderId");
        data.setAmount(1035800l);
        data.setPeriodType(0);
        data.setCurrentPeriod(3);
        data.setBillStatus("Bill status");
        data.setRepaymentStatus("REPAID");
        data.setRefundStatus("refund status");
        data.setDueDate("2022-11-25T00:00:00.000+07:00");
        data.setEntity("MAB");

        InstallmentV3 data2 = new InstallmentV3();
        data2.setOrderId("orderId");
        data2.setAmount(1035800l);
        data2.setPeriodType(0);
        data2.setCurrentPeriod(3);
        data2.setBillStatus("Bill status");
        data2.setRepaymentStatus("UNPAID");
        data2.setRefundStatus("refund status");
        data2.setDueDate("2022-11-25T00:00:00.000+07:00");
        data2.setEntity("MAB");

        InstallmentV3 data3 = new InstallmentV3();
        data3.setOrderId("orderId");
        data3.setAmount(1035800l);
        data3.setPeriodType(0);
        data3.setCurrentPeriod(3);
        data3.setBillStatus("Bill status");
        data3.setRepaymentStatus("UNPAID");
        data3.setRefundStatus("refund status");
        data3.setDueDate("2022-11-25T00:00:00.000+07:00");
        data3.setEntity("MAB");

        List<InstallmentV3> list = new ArrayList<>();
        list.add(data);
        list.add(data2);
        list.add(data3);

        return list;
    }

    private OrderV3 generateOrder() {
        OrderV3 orderV3 = OrderV3.builder()
                .orderId("1234567890")
                .createTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .periodType(3)
                .amount(3000000L)
                .outstandingAmount(0L)
                .repaidAmount(0L)
                .principalAmount(0l)
                .interestAmount(107400L)
                .serviceFeeAmount(0L)
                .refundAmount(0L)
                .status("SUCCESS")
                .agreementUrl("agreement url")
                .serviceId(3)
                .serviceIconUrl("http://abc.com")
                .title("Starbuck")
                .gopayTransactionId("2930283023j2j323")
                .installments(generateInstallment())
                .build();

        return orderV3;
    }

    private RepaymentV3 genRepaymentV3() {
        RepaymentV3 data = RepaymentV3.builder()
                .repaymentId("23029302o")
                .repaymentTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(8000L)
                .billMonth("bill month")
                .status("SUCCESS")
                .repaymentMethod("repaymentMethod")
                .lateFee(0L)
                .serviceId(2)
                .title("Family Mart")
                .gopayTransactionId("2930283023j2j323")
                .lateFeeRebalancedList(genLateFeeRebalance())
                .installments(generateInstallment())
                .build();

        return data;
    }

    private List<LateFeeRebalance> genLateFeeRebalance() {
        List<LateFeeRebalance> datas = new ArrayList<>();
        LateFeeRebalance data = new LateFeeRebalance();
        data.setLateFeeRebalancedAmount(1000L);
        data.setSource("CLEO_REBALANCE");

        datas.add(data);
        return datas;
    }

    private RefundV3 genRefund() {
        RefundV3 data = new RefundV3();
        data.setRefundId(UUID.randomUUID().toString());
        data.setRefundTime("refund_9293920230");
        data.setRefundTime("2022-11-25T00:00:00.000+07:00");
        data.setCurrency("IDR");
        data.setStatus("FULL_REFUNDED");
        data.setRefundDestination("CICIL_LIMIT");
        data.setGoPayPhoneNumber("082882828828");
        data.setServiceId(2);
        data.setTitle("Family mart Bintaro");
        data.setGopayTransactionId("2930283023j2j323");
        return data;
    }

    private OverpaidWithdrawalV3 genOverpaid() {
        OverpaidWithdrawalV3 data = new OverpaidWithdrawalV3();
        data.setOverpaidOrderId("q344");
        data.setSettleTime("2022-11-25T00:00:00.000+07:00");
        data.setCurrency("IDR");
        data.setAmount(8000);
        data.setStatus("SETTLED");
        data.setRefundDestination("GoPay");
        data.setServiceId(2);
        data.setTitle("Gofood");
        data.setGopayTransactionId("2930283023j2j323");
        return data;
    }
}
