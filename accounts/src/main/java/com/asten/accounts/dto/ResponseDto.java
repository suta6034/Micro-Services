package com.asten.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Response Dto" , name = "ResponseDto")
public class ResponseDto {
    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    @Schema(description = "the statusCode of the ResponseDto")
    private String statusCode;

    @Schema(description = "the statusMsg of the ResponseDto")
    private String statusMsg;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }
}
