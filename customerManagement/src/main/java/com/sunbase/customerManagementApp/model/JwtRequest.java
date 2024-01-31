package com.sunbase.customerManagementApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest {       //These are to store input credentials when user logs in
    private String userEmail;
    private String userPassword;
}