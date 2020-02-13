package com.hillel.dz10;

import java.io.ByteArrayOutputStream;

/*
3) Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:

Пароль состоит из 8 символов

В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания

Пароль обязательно должен содержать Большие и маленькие буквы и цифры
* */

public class Dz_Generator_password {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        String laters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        StringBuffer passw = new StringBuffer();

        for (int i=0; i<4; i++) {
            passw.append(laters.charAt((int)(Math.random()*26)));
        }
        for (int i=0; i<2; i++) {
            passw.append(digits.charAt((int)(Math.random()*10)));
        }
        for (int i=0; i<2; i++) {
            passw.append(laters.toUpperCase().charAt((int)(Math.random()*26)));
        }

        try {
            output.write(passw.toString().getBytes());
        } catch (Exception e)
        {

        }

        return output;
    }

}