package br.edu.ifg.dto;

import lombok.Data;

@Data
public class SignUpDTO {
    private String name;
    private String username;
    private String email;
    private String password;
}
