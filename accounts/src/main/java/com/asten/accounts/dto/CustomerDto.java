package com.asten.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Schema(description = "Customer Details", name = "CustomerDto")
public class CustomerDto {
    @NotEmpty(message="Name cannot be empty")
    @Size(min=5, max=30, message="Name should have at least 5 characters")
    @Schema(description = "Name of the customer")
    private String name;

    @Schema(description = "the email of the customer")
    @NotEmpty(message="Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(description = "the mobileNumber of the customer")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "the accountsDto of the customer")
    private AccountsDto accountsDto;

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", accountsDto=" + accountsDto +
                '}';
    }
}
