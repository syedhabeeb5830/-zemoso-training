package com.company.solid_code.notificationService;

public interface Notifications {


    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
