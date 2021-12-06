package ru.mirea.task24;

import java.util.regex.Pattern;

public class Main {
    static String cut(String str){
        int first_pos = 0, second_pos = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == '(')
                first_pos = i;
            else if(str.charAt(i) == ')') {
                second_pos = i;
                break;
            }
        return str.substring(first_pos, second_pos+1);
    }
    public static void main(String[] args){
        String regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String[] ip_addresses = {
                "127.0.0.1",
                "255.255.255.0",
                "128.127.234.9",
                "1300.6.7.8",
                "abc.def.gha.bcd",
                "999.999.999.999"};
        for (String ip_address : ip_addresses)
            System.out.print(Pattern.matches(regex, ip_address) ? ip_address + '\n': "");
    }
}
