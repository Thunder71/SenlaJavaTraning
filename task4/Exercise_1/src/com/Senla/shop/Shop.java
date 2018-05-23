package com.Senla.shop;

import com.Senla.store.stores.StoreGarage;
import com.Senla.store.stores.StoreOrder;
import com.Senla.store.stores.StorePlace;
import com.Senla.store.stores.StoreRepairer;

public class Shop implements IShop {
    private StorePlace storePlace;
    private StoreRepairer storeRepairer;
    private StoreOrder storeOrder;
    private StoreGarage storeGarage;

    public Shop(){
        storeGarage = new StoreGarage();
        storeOrder = new StoreOrder();
        storePlace = new StorePlace();
        storeRepairer = new StoreRepairer();
    }

    public StorePlace getStorePlace() {
        return storePlace;
    }

    public void setStorePlace(StorePlace storePlace) {
        this.storePlace = storePlace;
    }

    public StoreRepairer getStoreRepairer() {
        return storeRepairer;
    }

    public void setStoreRepairer(StoreRepairer storeRepairer) {
        this.storeRepairer = storeRepairer;
    }

    public StoreOrder getStoreOrder() {
        return storeOrder;
    }

    public void setStoreOrder(StoreOrder storeOrder) {
        this.storeOrder = storeOrder;
    }

    public StoreGarage getStoreGarage() {
        return storeGarage;
    }

    public void setStoreGarage(StoreGarage storeGarage) {
        this.storeGarage = storeGarage;
    }
}
