package com.Senla.store.stores;

import com.Senla.model.Place;
import com.Senla.store.istores.IStorePlace;

import java.util.ArrayList;
import java.util.List;

public class StorePlace implements IStorePlace {
    private List<Place> places;

    public StorePlace(){
        places = new ArrayList<>();
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    @Override
    public void addPlace(Place newPlace) {
        places.add(newPlace);
    }

    @Override
    public void removePlace(Place place) {
        places.remove(place);
    }
}
