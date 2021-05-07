package ru.geekbrains.lesson2;

public class ArrSum {
    public static int SumElements(String[][] arr) {
        if (arr.length != 4) throw new MyArraySizeException("Принимается только 4х4 массив");

        int sum = 0;

        for (int y = 0; y < arr.length; y++) {
            if(arr[y].length != 4) throw new MyArraySizeException("Принимается только 4х4 массив");
            for(int x = 0; x < arr.length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("В ячейке [%d][%d] символ не являющийся числом", x + 1, y + 1));
                }
            }
        }
        System.out.println("Сумма = " + sum);
        return sum;
    }
}
