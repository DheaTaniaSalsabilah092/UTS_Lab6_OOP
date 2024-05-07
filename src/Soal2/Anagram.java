package Soal2;

import java.util.Arrays;


public class Anagram {
    private String str1;
    private String str2;

    // Constructor
    public Anagram(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    //    replace(" ", "") untuk menghapus semua spasi dari string inputStr
//    toLowerCase() untuk mengubah semua huruf dalam string tersebut menjadi huruf kecil.
    private String removeSpacesAndToLower(String inputStr) {
        return inputStr.replace(" ", "").toLowerCase();
    }

    public boolean isAnagram() {
        String str1Cleaned = removeSpacesAndToLower(this.str1);
        String str2Cleaned = removeSpacesAndToLower(this.str2);

        if (str1Cleaned.length() != str2Cleaned.length()) {
            return false;
        }

        char[] str1Array = str1Cleaned.toCharArray();
        char[] str2Array = str2Cleaned.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }

}


