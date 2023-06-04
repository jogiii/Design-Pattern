package com.jogi.pattern;

import com.jogi.pattern.observable.IphoneObservableImpl;
import com.jogi.pattern.observable.StocksObservable;
import com.jogi.pattern.observer.EmailAlertObserverImpl;
import com.jogi.pattern.observer.MobileAlertObserverImpl;
import com.jogi.pattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);

    }
}
