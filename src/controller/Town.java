package controller;

import java.util.ArrayList;

import model.House;
import model.Person;

public class Town {
    ArrayList<House> houses = new ArrayList<>();

    public Town() {
    }

    public void setHouse(House house) {
        houses.add(house);
    }

    public ArrayList<House> getHouses() {
        return this.houses;
    }

    @Override
    public String toString() {
        return "{" +
            " houses='" + getHouses() + "'" +
            "}";
    }

    public void displayHouseHaveOldMan() {
        int count=0;
        for (House house : houses) {
            boolean check = false;
            for (Person person : house.getPersons()) {
                if(person.getYearOfBirth()>80) check =true;
            }
            if(check){
                count+=1;
                System.out.println(house.getPersons());
            }
        }
        System.out.println("there are "+count+" house which have person has age more than 80");
    }
    
}
