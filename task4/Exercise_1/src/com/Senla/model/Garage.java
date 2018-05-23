package com.Senla.model;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int id;
    private List<Place> places;

    public Garage(int id){
        this.id = id;
        places = new ArrayList<>();
    }

    public Garage(){
        places = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public void addPlace(Place newPlace){
        places.add(newPlace);
        newPlace.setGarage(this);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", places=" + places +
                '}';
    }
}
