package com.company.Files;

import com.company.Persons.Person;
import com.company.Properties.Property;

public class Sale {
    private Person newOwner;
    private Property property;
    private Double transactionPrice;

    public Sale(Person newOwner, Property property, Double transactionPrice) {
        this.newOwner = newOwner;
        this.property = property;
        this.transactionPrice = transactionPrice;
    }

    public Sale() {

    }

    public Person getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(Person newOwner) {
        this.newOwner = newOwner;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Double getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(Double transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "newOwner=" + newOwner +
                ", property=" + property +
                ", transactionPrice=" + transactionPrice +
                '}';
    }
}
