package br.edu.ifg.dto;

import lombok.Data;

@Data
public class SignInDTO {
    private String usernameOrEmail;
    private String password;
}
