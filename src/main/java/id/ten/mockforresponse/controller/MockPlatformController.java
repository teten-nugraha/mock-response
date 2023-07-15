package id.ten.mockforresponse.controller;

import id.ten.mockforresponse.dto.PlatformResponse;
import id.ten.mockforresponse.dto.platform.PlatformTrxHistoryV2Payload;
import id.ten.mockforresponse.service.PlatformService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gtfpaylater")
@RequiredArgsConstructor
public class MockPlatformController {

    private final PlatformService platformService;

    @GetMapping("/transaction-history/v2")
    public ResponseEntity<PlatformResponse> getTrxHistoryV2(@RequestBody PlatformTrxHistoryV2Payload payload) {

        PlatformResponse resp = PlatformResponse
                .builder()
                .code("SUCCESS")
                .message("Success fetch datas")
                .data(platformService.getDatas())
                .build();

        return ResponseEntity.ok(resp);

    }


}
