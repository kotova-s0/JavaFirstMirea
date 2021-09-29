package ru.mirea.task1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadaniya {
    public static void main(String[] args) {

        // задание 1
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a= new int[10];
        int i = 0;
        System.out.println("Введите 10 элементов массива");
        while (i < 10) {
            a[i] = s.nextInt();
            sum = sum+a[i];
            i++;
        }
        System.out.println("Сумма = "+sum);
        sum = 0;
        for (int j : a) {
            sum += j;
        }
        System.out.println("Сумма = "+sum);
        sum = 0;
        int d = 0;
        do {
            sum = sum+a[d];
            d++;
        }while (d < 10);
        System.out.println("Сумма = "+sum);


        // задание 2
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (i = 0; i< name.length(); i++)
            System.out.print(name.charAt(i));
        System.out.print("\n");

        //задание 3
        double num;
        for(i = 1; i <= 10; i++){
            num = 1.0/i;
            System.out.println(num);
        }


        //задание 4
        long seed = 2;
        Random random = new Random(seed);
        int[] arr = new int[10];
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("Массив рандомных чисел:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));


        //задание 5
        Scanner str = new Scanner(System.in);
        int numm = s.nextInt();
        int res = 1;
        for (i = 1; i <=numm; i ++){
            res = res*i;
        }
        System.out.println(res);
    }
}