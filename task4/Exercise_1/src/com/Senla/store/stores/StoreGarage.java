package com.Senla.store.stores;

import com.Senla.model.Garage;
import com.Senla.store.istores.IStoreGarage;

import java.util.ArrayList;
import java.util.List;

public class StoreGarage implements IStoreGarage {
    private List<Garage> garages;

    public StoreGarage(){
        garages = new ArrayList<>();
    }

    public List<Garage> getGarages() {
        return garages;
    }

    public void setGarages(List<Garage> garages) {
        this.garages = garages;
    }

    @Override
    public void addGarage(Garage newGarage) {
        garages.add(newGarage);
    }

    @Override
    public void removeGarage(Garage garage) {
        garages.remove(garage);
    }
}
