package com.present.GifticBe.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserLoginRequest {

    private String email;
    private String token;
}