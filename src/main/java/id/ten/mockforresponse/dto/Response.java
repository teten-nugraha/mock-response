package id.ten.mockforresponse.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response {
    private Object data;
    private Boolean success;
}
