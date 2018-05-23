package com.Senla.store.istores;

import com.Senla.model.Order;

public interface IStoreOrder {
    void addOrder(Order newOrder);

    void removeOrder(Order order);
}
