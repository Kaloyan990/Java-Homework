
import java.util.Scanner;


public class javaTasks {
    public static void main(String[] args) {

     //   Task 1

        String nameDog;
        String speciesDog;
        String ownerDog;
        byte humanAges;
        short dogsAges;
        char sex;
        String colorDog;
        String specialMarks;
        byte exPartners;
        byte currentPartners;
        short childrenNumber;
        String childrenNames;

        // Задача 2
        infoAboutDogandOwner();



        // Задача 4
        //Решение - с временна промелива
        int a, b, temp;
        a = 5;
        b = 11;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);


        }

    private static void infoAboutDogandOwner() {

        String nameDog = "Гошко";
        String speciesDog = "Дакел";
        String ownerDog = "Гошо Лошият";
        byte humanAges;
        short dogsAges;
        char sex;
        String colorDog = "кафяв";
        String specialMarks;
        byte exPartners;
        byte currentPartners;
        byte childrenNumber = 11;
        String childrenNames;

        System.out.println("Куче: " + nameDog + speciesDog + colorDog);
        System.out.println("Собственост на: " + ownerDog);
        System.out.print("Има " + childrenNumber);
    }
}

