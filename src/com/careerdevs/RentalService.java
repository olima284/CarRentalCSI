package com.careerdevs;

import java.util.Scanner;

public class RentalService {

    public static void main(String[] args) {



        System.out.println("Welcome to the Car Rental CLI");
        mainMenu();

        //Car testCar = new Car("Ford", "F156");
        //traditional / standard array

        Car[] carStorage = new Car[3];

        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car( "Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Corolla");

        //store obj instances is list/arr

        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

    //print car1 make

    //Problem: how do we list just Rental/Available care?
        car2.setRented(true);

    //solution (std arr): iterate through the array, only display cars where isRented is false
    System.out.println("Available Cars");

    int listNumber = 1;
    for (int i = 0; i < carStorage.length; i++) {
        if (!carStorage[i].isRented()) {
            System.out.println("(" + (i + 1) + ")" + carStorage[i].getName());
            listNumber++;

        }
    }
        System.out.println("All Cars");

        for (int i = 0; i < carStorage.length; i++) {
            String carStatus;
            if(!carStorage[i].isRented()) {
                carStatus="Available";
            }else{
                carStatus="Unavailable";
            }
            System.out.println( "(" + (i+1) + " )"+ carStorage[i].getName() + " (" + carStatus + ")");
        }

    }

    public static void mainMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to ....");
        System.out.println("1)Rent");
        System.out.println("2) Return");
        System.out.println("Exit the program");
        System.out.println("Selection:");

        int mainInput = scan.nextInt();
        switch(mainInput) {
            case 1:
            carsAvailableForRent();
            break;

            case 2:
            returnCarsAvailable();
            break;

            case 3:
            exitProgram();
            break;

            default :
            System.out.println( "return to main menu");
            mainMenu();

        }

    }

    private static void returnCarsAvailable() {
       //show return date
       //make car available
        // run exit program
    }

    public static void carsAvailableForRent() {
        //show available cars
        //give opp to rent car
        //take in car info
        //once car rented need to become unavailable
        //back main menu
    }

    public static void exitProgram() {
        //goodbye note
        //return to main menu
    }

}


