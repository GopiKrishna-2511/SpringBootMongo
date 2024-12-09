package com.springboot.devops.security;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;

public class JwtSecreatKeyTest {
    @Test
    public void generateSecreatKey(){
        SecretKey key= Jwts.SIG.HS512.key().build();
        String encodekey= DatatypeConverter.printHexBinary(key.getEncoded());
        System.out.println("SecreateKey==>"+encodekey);

    }
}
