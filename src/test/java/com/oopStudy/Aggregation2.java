package com.oopStudy;

import okhttp3.Address;

public class Aggregation2 {

    String Name;
    int id;
    String position;
    Aggregation1 address;

    public static void main(String args[]) {


        Aggregation1 address = new Aggregation1();
        address.Address("Chennai", "TamilNadu", "India");

        Aggregation2 empdetails = new Aggregation2();
        empdetails.empDetails(10, "Manager", "Sethu", address);


        empdetails.display();
    }

    public void empDetails(int id, String position, String Name, Aggregation1 address) {

        this.id = id;
        this.Name = Name;
        this.position = position;
        this.address = address;

    }

    void display() {
        System.out.println(Name + " " + id + " " + position);
        System.out.println(address.city + " " + address.state + " " + address.country);

    }


}
