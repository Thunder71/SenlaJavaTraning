package com.Senla.model;

import com.Senla.enumeration.Employment;

public class Repairer {
    private int id;
    private String name;
    private String surname;
    private Employment status;
    private Order order;

    public Repairer(int id, String name, String surname, Employment status, Order order){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.order = order;
    }

    public Repairer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employment getStatus() {
        return status;
    }

    public void setStatus(Employment status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
