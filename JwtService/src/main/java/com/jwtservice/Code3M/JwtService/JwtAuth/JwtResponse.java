package com.jwtservice.Code3M.JwtService.JwtAuth;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String JwtToken;
    private  String userName;
}
