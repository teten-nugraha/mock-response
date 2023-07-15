package id.ten.mockforresponse.service;

import id.ten.mockforresponse.controller.SubOrder;
import id.ten.mockforresponse.dto.platform.PlatformTrxHistoryV2Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PlatformService {

    public List<PlatformTrxHistoryV2Response> getDatas() {
        List<PlatformTrxHistoryV2Response> datas = new ArrayList<>();

        PlatformTrxHistoryV2Response order1 = generateOrder1();
        PlatformTrxHistoryV2Response repayment = generateRepayment();
        PlatformTrxHistoryV2Response order2 = generateOrder2();

        datas.add(order1);
        datas.add(repayment);
        datas.add(order2);

        return datas;
    }

    private PlatformTrxHistoryV2Response generateOrder2() {
        PlatformTrxHistoryV2Response obj = PlatformTrxHistoryV2Response
                .builder()
                .type("PAYMENT")
                .requestId(UUID.randomUUID().toString())
                .transactionReferenceId(UUID.randomUUID().toString())
                .transactionTime(1689331811)
                .currency("IDR")
                .amount(1200000L)
                .status("SUCCESS")
                .externalPlatformId("GOPAY")
                .subOrders(generateSubOrder())
                .build();
        return obj;
    }

    private PlatformTrxHistoryV2Response generateRepayment() {
        PlatformTrxHistoryV2Response obj = PlatformTrxHistoryV2Response
                .builder()
                .type("REPAYMENT")
                .requestId(UUID.randomUUID().toString())
                .transactionReferenceId(UUID.randomUUID().toString())
                .transactionTime(1689333834)
                .currency("IDR")
                .amount(1200000L)
                .status("SUCCESS")
                .externalPlatformId("GOPAY")
                .repaymentChannel("GOJEK")
                .repaymentMethod("BCA-VA")
                .build();
        return obj;
    }

    private PlatformTrxHistoryV2Response generateOrder1() {
        PlatformTrxHistoryV2Response obj = PlatformTrxHistoryV2Response
                .builder()
                .type("PAYMENT")
                .requestId(UUID.randomUUID().toString())
                .transactionReferenceId(UUID.randomUUID().toString())
                .transactionTime(1689333866)
                .currency("IDR")
                .amount(1200000L)
                .status("SUCCESS")
                .externalPlatformId("GOPAY")
                .subOrders(generateSubOrder())
                .build();
        return obj;
    }

    private SubOrder generateSubOrder() {
        SubOrder subOrder = new SubOrder();
        subOrder.setSubOrderId("920922");
        subOrder.setMerchantId("98s0dfsdfjsdfjdsf");
        subOrder.setMerchantName("Kopi BUngsu");
        subOrder.setSkuId("90dkodood");
        subOrder.setSkuName("BUngsu kopi sku");
        subOrder.setTransactionId(UUID.randomUUID().toString());
        subOrder.setServiceType(99);
        return subOrder;
    }

}
