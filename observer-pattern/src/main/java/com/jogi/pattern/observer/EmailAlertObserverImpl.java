package com.jogi.pattern.observer;

import com.jogi.pattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements  NotificationAlertObserver{

    String emailId;
    StocksObservable observable;
    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendMail(emailId,"product in stock hurry up !!");
    }

    public void sendMail(String emailId, String msg){
        System.out.println("email sent to: "+emailId);
    }
}
