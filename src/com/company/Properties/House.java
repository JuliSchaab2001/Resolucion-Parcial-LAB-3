package com.company.Properties;

import com.company.Persons.Person;

public class House extends Property{
    private Integer Floors;

    public House(Person owner, Double m2, Integer floors) {
        super(owner, m2);
        Floors = floors;
    }

    public House() {
        super();
    }

    public Integer getFloors() {
        return Floors;
    }

    public void setFloors(Integer floors) {
        Floors = floors;
    }

    @Override
    public String toString() {
        return super.toString()+"House{" +
                "Floors=" + Floors +
                '}';
    }
}
