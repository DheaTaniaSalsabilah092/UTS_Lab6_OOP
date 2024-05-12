package Soal4;

import java.util.Scanner;

public class MassDensityVolumeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  objek
        MassDensityVolumeCalculator calculator = new MassDensityVolumeCalculator();


        System.out.println("Pilih jenis perhitungan:");
        System.out.println("1. Menghitung massa jenis");
        System.out.println("2. Menghitung massa benda");
        System.out.println("3. Menghitung volume");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int choice = scanner.nextInt();

        double value1, value2;
        String unit;


        System.out.print("Masukkan satuan input (gram/kg): ");
        unit = scanner.next();

        switch (choice) {
            case 1:

                System.out.print("Masukkan massa benda: ");
                value1 = scanner.nextDouble();
                System.out.print("Masukkan volume benda: ");
                value2 = scanner.nextDouble();


                double densityResult = calculator.calculateDensity(value1, value2, unit);


                calculator.displayResult("density");
                break;

            case 2:

                System.out.print("Masukkan massa jenis benda: ");
                value1 = scanner.nextDouble();
                System.out.print("Masukkan volume benda: ");
                value2 = scanner.nextDouble();


                double massResult = calculator.calculateMass(value1, value2, unit);


                calculator.displayResult("mass");
                break;

            case 3:

                System.out.print("Masukkan massa benda: ");
                value1 = scanner.nextDouble();
                System.out.print("Masukkan massa jenis benda: ");
                value2 = scanner.nextDouble();


                double volumeResult = calculator.calculateVolume(value1, value2, unit);


                calculator.displayResult("volume");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}
