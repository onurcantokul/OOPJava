import java.util.Scanner;

//The program creates an integer that asks user to enter array of size, asks user to enter elements of the array, asks user to enter "how many times will you shift" and shifts elements of the array to the right.

public class lab1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many number do you want to enter? ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Please enter " + (i + 1) + ".num : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("How many times do you want to shifting? ");
        int times = sc.nextInt();
        sc.close();
        for (int i = 0; i < times; i++){
            arr = Switch(arr);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] Switch(int arr[]){
        int arr1[] = new int[arr.length];
        arr1[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++){
            arr1[i] = arr[i - 1];
        }
        return arr1;
    }
}
