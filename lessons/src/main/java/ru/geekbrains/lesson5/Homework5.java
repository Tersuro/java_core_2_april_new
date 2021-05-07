package ru.geekbrains.lesson5;

import java.util.Arrays;

public class Homework5 {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        long start;
        long finish;
        long duration;


        float[] arr1 = new float[SIZE];
        for(int i = 0; i < arr1.length; i++)
            arr1[i] = 1.0f;
        start = System.currentTimeMillis();
        evalExpression(arr1);
        finish = System.currentTimeMillis();
        duration = finish - start;
        System.out.println("Method evalExpression took: " + duration);


        float[] arr2 = new float[SIZE];
        for(int j = 0; j < arr2.length; j++)
            arr2[j] = 1.0f;
        start = System.currentTimeMillis();
        parallelEvalExpression(arr2);
        finish = System.currentTimeMillis();
        duration = finish - start;
        System.out.println("Method parallelEvalExpression took: " + duration);

        System.out.println("Arrays are equals: " + Arrays.equals(arr1, arr2));
    }
    private static void evalExpression(float[] arr) {
        evalExpression(arr, 0);
    }

    private static void evalExpression(float[] arr, int secondHalf) {
        for(int i = 0; i < arr.length; i++) {
            float arri = arr[i];
            arr[i] = expression(i + secondHalf, arri);
        }
    }

    private static void parallelEvalExpression(float[] arr) {
        float[] part1 = Arrays.copyOfRange(arr, 0, H);
        float[] part2 = Arrays.copyOfRange(arr, H, arr.length);

        Thread thread1 = new Thread(() -> evalExpression(part1, 0));
        Thread thread2 = new Thread(() -> evalExpression(part2, H));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        System.arraycopy(part1,0, arr, 0, H);
        System.arraycopy(part2,0, arr, H, H);

    }

    private static float expression(int index, float arri) {
        return (float)(arri * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
    }
}

