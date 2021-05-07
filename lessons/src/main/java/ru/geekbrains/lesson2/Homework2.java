package ru.geekbrains.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"2", "5", "8", "12"},
                {"10", "-21", "1", "31"},
                {"om", "3", "js", "76"},
                {"-4", "125", "-100", "5"}
        };

        String[][] arr2 = new String[][]{
                {"3", "2", "22", "62"},
                {"-10", "-21", "305", "-31"},
                {"86", "55", "32", "21", "4"},
                {"42", "85", "-180", "-55"}
        };

        String[][] arr3 = new String[][]{
                {"6", "23", "77", "-32"},
                {"30", "-54", "41", "76"},
                {"-27", "34", "70", "26"},
                {"199", "-315", "101", "3"}
        };

        try {
            ArrSum.SumElements(arr1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ArrSum.SumElements(arr2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            ArrSum.SumElements(arr3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
