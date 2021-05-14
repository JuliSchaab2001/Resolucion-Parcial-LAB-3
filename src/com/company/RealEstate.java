package com.company;

import com.company.Files.Rental;
import com.company.Files.Sale;
import com.company.Persons.Person;
import com.company.Properties.Department;
import com.company.Properties.House;
import com.company.Properties.Office;
import com.company.Properties.Property;

import java.util.ArrayList;
import java.util.List;

public class RealEstate {
    private String name;
    private List<Sale> saleList;
    private List<Rental> rentalList;

    public RealEstate(String name) {
        this.name = name;
        this.saleList = new ArrayList<>();
        this.rentalList = new ArrayList<>();
    }

    public void Rent(Person tenant, Double monthPrice, Integer monthCount, Property property){
        rentalList.add(new Rental(tenant, monthPrice, monthCount, property));
    }

    public void sell(Person newOwner, Property property, Double price){
        property.setOwner(newOwner);
        saleList.add(new Sale(newOwner,property, price));
    }

    public void mostValuedSale(){
        Sale best = new Sale();
        best.setTransactionPrice(0.);
        for(Sale sale :saleList ){
            if(sale.getTransactionPrice() > best.getTransactionPrice()){
                best=sale;
            }
        }

        System.out.println("Dueño: "+ best.getNewOwner().getName() + "  "+best.getNewOwner().getLastName() + " "+ best.getNewOwner().getDni() );

        if(best.getProperty() instanceof Department){
            Department department= (Department)best.getProperty();
            System.out.println("Propiedad "+ department.getFloor() + "/" + department.getLetter() + "/" + department.getM2());
        }

        if(best.getProperty() instanceof House){
            House house= (House)best.getProperty();
            System.out.println("Propiedad "+ house.getFloors() +"/"+ house.getM2());
        }

        if(best.getProperty() instanceof Office){
            Office office= (Office)best.getProperty();
            System.out.println("Propiedad "+ office.getBoxes() +"/"+ office.getM2());
        }
    }

    public void increase(){
        for(Rental rental : rentalList){
            System.out.println("Old price: "+ rental.getMonthPrice());
            rental.setMonthPrice(rental.getMonthPrice()+(rental.getMonthPrice()*0.1));
            System.out.println("New price: "+ rental.getMonthPrice());
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }
}
