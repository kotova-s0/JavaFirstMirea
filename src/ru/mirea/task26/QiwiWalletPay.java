package ru.mirea.task26;

import java.util.HashMap;

public class QiwiWalletPay implements PayStrategy {
    private String email;
    private String password;

    @Override
    public void pay(int sum) {
        System.out.println("Oplata: " + sum);
    }
}