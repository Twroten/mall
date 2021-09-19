package com.wroten.common;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class MallCommonApplicationTests {

    @Test
    void contextLoads() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //密钥salt
        textEncryptor.setPassword("MTEyNQ==");
        //要加密的数据(数据库的用户名或密码)
        String passwordCipher = textEncryptor.encrypt("root");
        System.out.println("passwordCipher = " + passwordCipher);
    }

}
