package com.Senla.store.istores;

import com.Senla.model.Garage;

public interface IStoreGarage {
    void addGarage(Garage newGarage);

    void removeGarage(Garage garage);
}
