package id.ten.mockforresponse.dto.platform;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PlatformTrxHistoryV2Payload {
    private String externalReferenceUid;
    private String transactionType;
    private Integer limitTime;
    private String direction;
    private String pageSize;
}
