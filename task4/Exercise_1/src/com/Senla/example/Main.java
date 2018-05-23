package com.Senla.example;

import com.Senla.enumeration.Employment;
import com.Senla.model.Garage;
import com.Senla.model.Order;
import com.Senla.model.Place;
import com.Senla.model.Repairer;

public class Main {
    public static void main(String[] args) {
        Garage g1 = new Garage(1);
        Garage g2 = new Garage(2);
        Garage g3 = new Garage(3);
        Place p1 = new Place(1, Employment.FREE);
        Place p2 = new Place(2, Employment.FREE);
        Place p3 = new Place(3, Employment.FREE);
        Place p4 = new Place(4, Employment.FREE);
        Place p5 = new Place(5, Employment.FREE);
        Place p6 = new Place(6, Employment.FREE);
        Repairer r1 = new Repairer();
        Repairer r2 = new Repairer();
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();

        g1.addPlace(p1);
        g1.addPlace(p2);
        System.out.println(g1);
    }
}
