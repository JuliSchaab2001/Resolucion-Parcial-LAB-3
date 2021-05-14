package com.company.Properties;

import com.company.Persons.Person;

public class Department  extends Property{
    private Integer floor;
    private char letter;

    public Department() {
        super();
    }

    public Department(Person owner, Double m2, Integer floor, char letter) {
        super(owner, m2);
        this.floor = floor;
        this.letter = letter;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return super.toString()+"Department{" +
                "floor=" + floor +
                ", letter=" + letter +
                '}';
    }
}
