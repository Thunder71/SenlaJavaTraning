package com.Senla.model;

import com.Senla.enumeration.Feasibility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date appliDate;
    private Date dateCompl;
    private Date datePlannned;
    private List<Repairer> repairers;
    private Place place;
    private Feasibility feasibility;
    private int cost;

    public Order(int id, Date appliDate, Date dateCompl, Date datePlannned,
                 Place place, Feasibility feasibility, int cost){
        this.id = id;
        this.appliDate = appliDate;
        this.dateCompl = dateCompl;
        this.datePlannned = datePlannned;
        repairers = new ArrayList<>();
        this.place = place;
        this.feasibility = feasibility;
        this.cost = cost;
    }

    public Order(){
        repairers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAppliDate() {
        return appliDate;
    }

    public void setAppliDate(Date appliDate) {
        this.appliDate = appliDate;
    }

    public Date getDateCompl() {
        return dateCompl;
    }

    public void setDateCompl(Date dateCompl) {
        this.dateCompl = dateCompl;
    }

    public Date getDatePlannned() {
        return datePlannned;
    }

    public void setDatePlannned(Date datePlannned) {
        this.datePlannned = datePlannned;
    }

    public List<Repairer> getRepairers() {
        return repairers;
    }

    public void setRepairers(List<Repairer> repairers) {
        this.repairers = repairers;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Feasibility getFeasibility() {
        return feasibility;
    }

    public void setFeasibility(Feasibility feasibility) {
        this.feasibility = feasibility;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void addRepairer(Repairer newRepairer){
        repairers.add(newRepairer);
        newRepairer.setOrder(this);
    }
}
