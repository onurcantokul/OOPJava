import java.util.Scanner;

//The program reads number of students and each students score from the user, computes the best score and assigns letter grades according to the following scale.

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many student do you enter? ");
        int std = sc.nextInt();

        double scores[] = new double[std];

        for (int i = 0; i < scores.length; i++){
            System.out.println("Please enter " + (i+1) + ".student's score : ");
            scores[i] = sc.nextDouble();
        }

        sc.close();

        double max = 0;

        for (int i = 0; i < scores.length; i++){
            if(scores[i] > max) max = scores[i + 1];
        }

        char grades[] = new char[std];

        for (int i = 0; i < grades.length; i++){
            if (scores[i] >= max - 10) grades[i] = 'A';
            else if (scores[i] >= max - 20) grades[i] = 'B';
            else if (scores[i] >= max - 30) grades[i] = 'C';
            else if (scores[i] >= max - 40) grades[i] = 'D';
            else grades[i] = 'F';
        }
        for (int i = 0; i < std; i++){
            System.out.println((i + 1) + ".student's grade is " + grades[i] + ", score is " + scores[i] + ".");
        }
    }

}