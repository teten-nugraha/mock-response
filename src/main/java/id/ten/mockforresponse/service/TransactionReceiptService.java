package id.ten.mockforresponse.service;

import id.ten.mockforresponse.dto.transactionReceipt.Data;
import id.ten.mockforresponse.dto.transactionReceipt.Installment;
import id.ten.mockforresponse.dto.transactionReceipt.Order;
import id.ten.mockforresponse.dto.transactionReceipt.OverpaidDetail;
import id.ten.mockforresponse.dto.transactionReceipt.OverpaidWithdrawal;
import id.ten.mockforresponse.dto.transactionReceipt.Refund;
import id.ten.mockforresponse.dto.transactionReceipt.RefundDetail;
import id.ten.mockforresponse.dto.transactionReceipt.RepaidOrder;
import id.ten.mockforresponse.dto.transactionReceipt.Repayment;
import id.ten.mockforresponse.dto.transactionReceipt.TransactionReceiptDto;
import id.ten.mockforresponse.dto.transactionReceipt.Type;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionReceiptService {

    public TransactionReceiptDto getOrderTransactionReceipt(Type type) {

        Data data = generateData();

        if(Type.ORDER.equals(type) || Type.OVERPAID_WITHDRAWAL.equals(type)) {

            data.setInstallments(generateInstallment());

        }else if(Type.REPAYMENT.equals(type)) {

            data.setRepaidOrders(generateRepaidOrder());

        }else if(Type.REFUND.equals(type)) {

            data.setRefundDetails(generateRefundDetail());

        }



        TransactionReceiptDto dto =
                TransactionReceiptDto.builder().data(data).success(true).build();

        return dto;
    }

    public Data generateData() {
        return Data.builder()
                .gopayTransactionId("1234567890")
                .transactedAt("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(24000)
                .outstanding_amount(1600)
                .repaid_amount(8000)
                .interest_fee(500)
                .service_fee(1000)
                .status("SUCCESS")
                .agreement_url("agreement url")
                .serviceId(2)
                .serviceIconUrl("http://abc.com")
                .title("Family mart Bintaro")
                .transactionAgreementUrl("url")
                .repaymentStatus("status")
                .build();
    }

    public Order generateOrder() {

        Order order = Order.builder()
                .orderId("01c20b73acf5c3863976658404244762")
                .createTime("2023-06-13T13:04:18.391+07:00")
                .currency("IDR")
                .periodType(3)
                .amount(111250)
                .outstandingAmount(111250)
                .repaidAmount(0)
                .principalAmount(100000)
                .refundAmount(0)
                .interestAmount(11250)
                .serviceFeeAmount(1500)
                .status("SUCCESS")
                .agreementUrl(
                        "https://storage.googleapis.com/staging-paylater/gtfpaylater/contracts/20230613/5gn4hIwXICrk8rxQGzXmO.pdf?GoogleAccessId=bucket-s-cicil-avalon@ptmab-staging.iam.gserviceaccount.com&Expires=1687241080&Signature=WmZitbwE6VIGovYUZOCLum%2B2tabczHKWNF3nLrmnupVODjOdgPtNkzfhVnAKCD3e4%2F7g7zF4q2f7nqzb8NNsjH%2BoP2XbtQG57Pj2vTm4N81D%2FZTSvP4HNuNmyEQpYgfGAFAa3a0jTdf6ZSWd%2BHasBn8309iT6acm86NPmsTx0GCiJlqQOyBS4hwLh2LRC%2FQe06gFzXFWsc8sUFz%2BkS4TLoKR%2FrtmAEuzfiqsClVk2Sk9t8w1o%2BchGhyD0o%2FWF4A2wYUGD8sAHadpHMeKeCfzvQy67Dehq%2BwoNtCTNTWyEyGimC4ft%2BSEdQALmWnrj0DcnyYdjOhvSTXMH69vv5PSjg%3D%3D")
                .installments(generateInstallment())
                .build();
        return order;
    }

    public List<Installment> generateInstallment() {
        List<Installment> datas = new ArrayList<>();

        Installment data1 = Installment.builder()
                .amount(37083)
                .periodeType(0)
                .currentPeriod(1)
                .repaymentStatus("PARTIAL_REPAID")
                .dueDate("2022-11-25T00:00:00.000+07:00")
                .build();

        datas.add(data1);

        return datas;
    }

    public List<RepaidOrder> generateRepaidOrder() {
        List<RepaidOrder> data = new ArrayList<>();

        RepaidOrder repaidOrder = new RepaidOrder();
        repaidOrder.setTitle("Family mart, Bintaro");
        repaidOrder.setCurrentInstallment(1);
        repaidOrder.setTotalInstallments(1);
        repaidOrder.setTransactedAt("2022-11-25T00:00:00.000+07:00");
        repaidOrder.setAmount(81000);
        repaidOrder.setInterestRate(2.5f);

        data.add(repaidOrder);

        return data;

    }

    public List<RefundDetail> generateRefundDetail() {
        List<RefundDetail> data = new ArrayList<>();

        RefundDetail repaidOrder = new RefundDetail();
        repaidOrder.setRefundId("123123123213");
        repaidOrder.setRefundAmount(12345.5f);
        repaidOrder.setRefundTo("gopaylater1");
        repaidOrder.setStatus("FULL_REFUNDED");
        repaidOrder.setRefundTime("2022-11-25T00:00:00.000+07:00");

        data.add(repaidOrder);

        return data;

    }

    public List<OverpaidDetail> generateOverpaidDetail() {
        List<OverpaidDetail> data = new ArrayList<>();

        OverpaidDetail overpaidDetail = new OverpaidDetail();
        overpaidDetail.setOverpaidId("3423423424fwef");
        overpaidDetail.setRefundTo("gopaylater");
        overpaidDetail.setAmount(1232);
        overpaidDetail.setStatus("FULL_REFUNDED");
        overpaidDetail.setSettleTime("2022-11-25T00:00:00.000+07:00");
        overpaidDetail.setRefundDestination("GoPay");


        data.add(overpaidDetail);

        return data;

    }

    public Refund generateRefund() {
        Refund refund = Refund.builder()
                .refundId(UUID.randomUUID().toString())
                .refundTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(8000)
                .status("FULL_REFUNDED")
                .refundDestination("CICIL_LIMIT")
                .goPayPhoneNumber("628993882992")
                .build();

        return refund;
    }

    public OverpaidWithdrawal generateOverpaidWithdrawal() {
        OverpaidWithdrawal data = OverpaidWithdrawal.builder()
                .overpaidOrderId(UUID.randomUUID().toString())
                .settleTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(8900)
                .status("SETTLED")
                .refundDestination("GoPay")
                .build();
        return data;
    }

    public Repayment generateRepayment() {
        Repayment repayment = Repayment.builder()
                .repaymentId(UUID.randomUUID().toString())
                .repaymentTime("2022-11-25T00:00:00.000+07:00")
                .currency("IDR")
                .amount(72388)
                .billMonth("2222")
                .status("SUCCESS")
                .repaymentMethod("string")
                .lateFee(0)
                .installments(generateInstallment())
                .build();

        return repayment;
    }
}
