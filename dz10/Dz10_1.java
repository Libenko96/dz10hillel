package com.hillel.dz10;
/*
Написать метод.

Входящий параметр:

Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.

Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие

Например:

Test test tESt => Test Test Test
 */
public class Dz10_1 {
    public static void main(String[] args) {
        String s = "Строка раЗделенная проБелами";
        System.out.println(str(s));
    }


    public static String str(String string) {
        String s2 = "";
        s2 = s2 + string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i - 1, i))) {
                s2 = s2 + string.substring(i, i + 1).toUpperCase();
            } else {
                s2 = s2 + string.substring(i, i + 1).toLowerCase();
            }

        }
        return s2;
    }
}