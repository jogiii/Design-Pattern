package com.jogi.pattern.observer;

import com.jogi.pattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.userName = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(userName,"product is in stock hury up !");

    }

    public void sendMessageOnMobile(String userName, String msg){
        System.out.println("message sent to :"+userName);
    }
}
