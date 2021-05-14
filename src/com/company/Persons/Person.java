package com.company.Persons;

public  class Person {
    private String name;
    private String lastName;
    private Integer dni;

    public Person(String name, String lastName, Integer dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni=" + dni +
                '}';
    }
}
