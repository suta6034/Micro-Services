package com.asten.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(description = "AccountsDto",name="AccountsDto")
public class AccountsDto {
    @Schema(description = "the accountNumber of the Account", example = "1234567890")
    @NotEmpty(message = "accountNumber cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "accountNumber number must be 10 digits")
    private Long accountNumber;

    @Schema(description = "the accountType of the Account" , example="SAVINGS")
    @NotEmpty(message = "accountType cannot be empty")
    private String accountType;

    @Schema(description = "the branchAddress of the Account", example = "Pune")
    @NotEmpty(message = "branchAddress cannot be empty")
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Override
    public String toString() {
        return "AccountsDto{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                '}';
    }
}
