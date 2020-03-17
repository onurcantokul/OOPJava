
import java.util.Scanner;

//The program asks user to enter of array size and give random elements, the method removes the element of the array at the given index and returns.

public class lab1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want in your array? ");
        double arr[] = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * 100;
            System.out.println((i + 1) + ". number in array is " + arr[i] + ".");
        }
        System.out.println();
        System.out.print("Please enter between 1-" + arr.length + " number which number of array do you want to delete? ");
        double arr1[] = Deletenum(arr, sc.nextInt());
        for (int i = 0; i < arr1.length; i++){
            System.out.println((i + 1) + ". number in array is " + arr1[i] + ".");
        }
    }

    public static double[] Deletenum(double[] arr, int del){
        double arr1[] = new double[arr.length - 1];
        for (int i = 0; i < del - 1; i++){
            arr1[i] = arr[i];
        }
        for (int i = del - 1; i < arr1.length; i++){
            arr1[i] = arr[i + 1];
        }
        return arr1;
    }
}