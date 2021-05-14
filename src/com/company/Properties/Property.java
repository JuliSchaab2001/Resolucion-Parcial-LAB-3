package com.company.Properties;

import com.company.Persons.Person;

public abstract class Property {
    private Person owner;
    private Double m2;

    public Property(Person owner, Double m2) {
        this.owner = owner;
        this.m2 = m2;
    }

    public Property() {

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Property{" +
                "owner=" + owner +
                ", m2=" + m2 +
                '}';
    }
}
