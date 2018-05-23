package com.Senla.store.stores;

import com.Senla.model.Order;
import com.Senla.store.istores.IStoreOrder;

import java.util.ArrayList;
import java.util.List;

public class StoreOrder implements IStoreOrder {
    private List<Order> orders;

    public StoreOrder(){
        orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void addOrder(Order newOrder) {
        orders.add(newOrder);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
