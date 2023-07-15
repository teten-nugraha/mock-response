package id.ten.mockforresponse.controller;

import id.ten.mockforresponse.dto.Response;
import id.ten.mockforresponse.dto.transactionHistory.ListTransaction;
import id.ten.mockforresponse.dto.transactionReceipt.Type;
import id.ten.mockforresponse.service.TransactionHistoryService;
import id.ten.mockforresponse.service.TransactionHistoryService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lending/v2/user")
public class TransactionHistoryController {

    @Autowired
    TransactionHistoryService transactionHistoryService;

    @GetMapping("/transaction-history")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Response> getTrxHistoryV2(
            @RequestHeader("GojekUserId") String gojekUserId,
            @RequestHeader("GopayCustomerId") String GopayCustomerId,
            @RequestParam(value = "type", required = false) Type type,
            @RequestHeader("pageSize") int pageSize,
            @RequestHeader("limitTime") String limitTime,
            @RequestHeader("direction") String direction) {

        Response response = new Response();
        response.setSuccess(true);
        response.setData(transactionHistoryService.getTrxData());

        return ResponseEntity.ok(response);
    }
}
