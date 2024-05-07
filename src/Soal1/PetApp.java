package Soal1;

import java.util.Scanner;
public class PetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  objek Anjing
        Anjing dog = new Anjing("Luna", 1, 3.5, "Golden Retriever");

        //  objek Kucing
        Kucing cat = new Kucing("Zion", 1, 2.2, "Calico");


        System.out.println("Your Dog Information:");
        dog.displayInfo();
        System.out.println();

        System.out.println("Your Cat Information:");
        cat.displayInfo();
        System.out.println();

        // Memanggil method Overloading dengan jenis makanan untuk pet
        System.out.print("Enter Your dog favorite food: ");
        String dogFood = scanner.nextLine();
        System.out.print("Enter Your dog's food amount (grams) in a day: ");
        double dogFoodAmount = scanner.nextDouble();
        dog.displayInfo(dogFood, dogFoodAmount);
        dog.eatFood(dogFoodAmount);
        System.out.println("Dog's Weight After Eating: " + dog.getWeight() + " kg");
        System.out.println();

        scanner.nextLine();

        System.out.print("Enter Your cat favorite food: ");
        String catFood = scanner.nextLine();
        System.out.print("Enter cat's food amount (grams) in a day: ");
        double catFoodAmount = scanner.nextDouble();
        cat.displayInfo(catFood, catFoodAmount);
        cat.eatFood(catFoodAmount);
        System.out.println("Cat's Weight After Eating: " + cat.getWeight() + " kg");

        scanner.close();
    }
}
