package view;

import java.util.Scanner;

import model.Person;
import model.House;
import controller.Town;
public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
        Town town = new Town();
        inputTown(scannerInt, scannerLine, town);
        //System.out.println(town.toString());
        town.displayHouseHaveOldMan();

        scannerInt.close();
        scannerLine.close();
    }


    /* Input Each person in each house in town, 
       input N is number of house, M is number of human in 1 house*/
    public static void inputTown(Scanner scannerInt, Scanner scannerLine, Town town) {
        System.out.println("Input number of House");
        int n = scannerInt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Input number of Man in house number " + i+" :");
            int m = scannerInt.nextInt();
            House house = new House();
            for (int j = 0; j < m; j++) {
                Person person = new Person();
                    System.out.println("Input name");
                    person.setName(scannerLine.nextLine());
                    System.out.println("Input YearOfBirth");
                    person.setYearOfBirth(scannerInt.nextInt());
                    System.out.println("Input job");
                    person.setJob(scannerLine.nextLine());
                house.setPerson(person);
            }
            town.setHouse(house);
        }
    }
}
