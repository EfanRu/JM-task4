package jm.task;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Pair<T, R> {

    public static void main(String[] args) {
        try (java.util.Scanner br = new java.util.Scanner(new InputStreamReader(System.in))) {
//            String data = br.nextLine();
            String data = new String("16 14 13 12 9 78 32");
            java.util.ArrayDeque<String> list = new java.util.ArrayDeque<>();
            String[] arr = data.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) {
                    list.addFirst(arr[i]);

//                    arr[i] = "Need_delete";
                }
            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].equals("Need_delete")) {
//                    list.add(arr[i]);
//                    list.remove(list.get(i));
//                    i--;
//                }
//            }
//            list.sort((s1, s2) -> Integer.parseInt(s2) - Integer.parseInt(s1));
            list.stream().map(s -> s + " ").forEach(System.out::print);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
