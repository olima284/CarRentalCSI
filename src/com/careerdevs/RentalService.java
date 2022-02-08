package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {

        System.out.println("Welcome to the Car Rental CLI");

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

}


