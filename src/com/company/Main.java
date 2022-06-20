package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*String str = "Cat cat caaat caaaaalkjsdfbnsjkldbfnkjt ct CAT cAT";

        Pattern pattern = Pattern.compile("ca*[a-z]*t", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }*/

        /*String str = "58-93-23";

        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.matches());*/

        /*String str = "+7(900)289-12-41";

        Pattern pattern = Pattern.compile("\\+7\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.matches());*/

        String str = "lksdjfhbkljsdbf sdlkfnsld nbhksdfb hhj@ya.ru shjkdfbsnbsdkjf nkjsdnf  kjsdbf ma@mail.ru dklfnglkdf@yahoo.com slkdffngkld@klsdfnkl.ru sadas@zaasd.asfdagf";

        Pattern pattern = Pattern.compile("\\w+@[a-z]+.[a-z]{2,3}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
