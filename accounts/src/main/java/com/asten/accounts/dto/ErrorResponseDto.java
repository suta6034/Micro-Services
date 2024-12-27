package com.asten.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@Schema(description = "Error Response Dto", name = "ErrorResponseDto")
public class ErrorResponseDto {
    public ErrorResponseDto(String apiPart, HttpStatus errorCode, String errorMessage, LocalDateTime errorTime) {
        this.apiPart = apiPart;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    @Schema(description = "the apiPart of the ErrorResponseDto")
    private String apiPart;

    @Schema(description = "the errorCode of the ErrorResponseDto")
    private HttpStatus errorCode;

    @Schema(description = "the errorMessage of the ErrorResponseDto")
    private String errorMessage;

    @Schema(description = "the errorTime of the ErrorResponseDto")
    private LocalDateTime errorTime;

    public String getApiPart() {
        return apiPart;
    }

    public void setApiPart(String apiPart) {
        this.apiPart = apiPart;
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(LocalDateTime errorTime) {
        this.errorTime = errorTime;
    }


}
