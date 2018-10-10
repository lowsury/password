package com.lowsury.password;

import org.junit.Test;

public class PasswordMainTests {

    @Test
    public void generatePwd() {
        new PasswordMain().generatePwd(null, 12);
        new PasswordMain().generatePwd(new char[]{'3'}, 12);
    }

}
