package id.ten.mockforresponse.controller;

import id.ten.mockforresponse.dto.transactionReceipt.*;
import id.ten.mockforresponse.dto.transactionReceiptV3.TransactionReceiptDtoV3;
import id.ten.mockforresponse.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lending/v1/accounts")
public class TransactionReceiptController {

    @Autowired
    private TransactionReceiptV3Service transactionReceiptService;

    @GetMapping("/transaction-receipt")
    public ResponseEntity<TransactionReceiptDtoV3> transactionReceiptDto(
            @RequestParam("referenceId") String referenceId,
            @RequestParam("type") Type type,
            @RequestParam("entity") String entity,
            @RequestHeader("GojekUserId") String gojekUserId,
            @RequestHeader("GopayCustomerId") String gopayCustomerId) {

        return ResponseEntity.ok(transactionReceiptService.getOrderTransactionReceipt(type));
    }
}
