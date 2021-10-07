package model;

import java.util.ArrayList;

public class House {
    int numberOfHouse;
    ArrayList<Person> persons = new ArrayList<>();


    public House() {
    }

    public House(int numberOfHouse, ArrayList<Person> persons) {
        this.numberOfHouse = numberOfHouse;
        this.persons = persons;
    }

    public int getNumberOfHouse() {
        return this.numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public Person getPerson(int index) {
            return persons.get(index);
    }

    public void setPerson(Person person) {
        persons.add(person);
    }


    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public House numberOfHouse(int numberOfHouse) {
        setNumberOfHouse(numberOfHouse);
        return this;
    }

    public House persons(ArrayList<Person> persons) {
        setPersons(persons);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " numberOfHouse='" + getNumberOfHouse() + "'" +
            ", persons='" + getPersons() + "'" +
            "}";
    }
    

}
