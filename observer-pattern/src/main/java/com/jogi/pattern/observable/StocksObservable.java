package com.jogi.pattern.observable;

import com.jogi.pattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
