package com.company;/*
@USER: Java02
@DATE: 06.03.2021
@NAME: Harry
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Harry {
    public static String loadText(String fileLocation) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java02\\Desktop\\Harry2.txt")));
        return content;
    }

    public static String cleanGarbage(String text) {
        text = text.replaceAll("[^A-Za-z ]", "").toLowerCase(Locale.ROOT);
        return text;
    }

    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\Java02\\Desktop\\Harry2.txt";
        String text = loadText(fileLocation);
        text = cleanGarbage(text);
        String[] array = text.split(" ");
        for (int i = 0; i < 20; i++) {
            //System.out.println(array[i]);

        }
        //System.out.println(text.length()); //message shows number of characters in the whole text
        //System.out.println(array.length);
        String distingWords = "";
        for (int i = 0; i < array.length; i++) {
            if (!distingWords.contains(array[i])) {
                distingWords += array[i] + " ";

            }

        }
        array = distingWords.split(" ");
        for (int i = array.length - 10; i < array.length; i++) {
            //System.out.println(array[i]);

        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 10  == 0) System.out.println();

        }
    }
}
