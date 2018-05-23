package com.Senla.model;

import com.Senla.enumeration.Employment;

public class Place {
    private int id;
    private  Garage garage;
    private Employment status;


    public Place(int id, Employment status){
        this.id = id;
        this.status = status;
    }

    public Place(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Employment getStatus() {
        return status;
    }

    public void setStatus(Employment status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                '}';
    }
}
