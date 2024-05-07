package Soal2;

import java.util.Scanner;

public class AnagramApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan string pertama: ");
            String string1 = scanner.nextLine();
            System.out.print("Masukkan string kedua: ");
            String string2 = scanner.nextLine();
            scanner.close();

            Anagram anagramChecker = new Anagram(string1, string2);
            if (anagramChecker.isAnagram()) {
                System.out.println("Ya, kedua string adalah anagram.");
            } else {
                System.out.println("Tidak, kedua string bukan anagram.");
            }
        }

}
