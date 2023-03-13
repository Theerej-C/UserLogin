package com.login.userlogin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;


@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginDetails {

    private String message;
    private String status;
    private int status_no;
    private boolean access;
    private Long session_id;
}
