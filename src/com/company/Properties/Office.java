package com.company.Properties;

import com.company.Persons.Person;

public class Office  extends Property{
    private Integer boxes;

    public Office(Person owner, Double m2, Integer boxes) {
        super(owner, m2);
        this.boxes = boxes;
    }

    public Office(){
        super();
    }

    public Integer getBoxes() {
        return boxes;
    }

    public void setBoxes(Integer boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return super.toString()+"Office{" +
                "boxes=" + boxes +
                '}';
    }
}
