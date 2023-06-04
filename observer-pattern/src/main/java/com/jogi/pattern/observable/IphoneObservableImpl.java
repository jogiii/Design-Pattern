package com.jogi.pattern.observable;

import com.jogi.pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded) {
        if(stockCount ==0)
            notifySubscriber();

        stockCount = stockCount+ newStockAdded;

    }

    public int getStockCount() {
        return stockCount;
    }
}
