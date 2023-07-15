package id.ten.mockforresponse.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class PlatformResponse<T> {
    private String code;
    private String message;
    private T data;
}
