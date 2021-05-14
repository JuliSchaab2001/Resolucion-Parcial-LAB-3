package com.company.Files;

import com.company.Persons.Person;
import com.company.Properties.Property;

public class Rental {
    private Person tenant;
    private Double monthPrice;
    private Integer monthCount;
    private Property property;

    public Rental(Person tenant, Double monthPrice, Integer monthCount, Property property) {
        this.tenant = tenant;
        this.monthPrice = monthPrice;
        this.monthCount = monthCount;
        this.property = property;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public Double getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(Double monthPrice) {
        this.monthPrice = monthPrice;
    }

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
