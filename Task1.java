package Lecture1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);


            int score1, score2, score3, score4, score5, score6, score7;


            do {
                System.out.println("Enter the score for the 1st student: ");
                score1 = input.nextInt();

                if (score1 < 0 || score1 > 100)
                    System.out.println("Error input out of bound. Score can only be between 0 and 100.");
            }
            while
            (score1 < 0 || score1 > 100);


            do {
                System.out.println("Enter the score for the 2nd student: ");
                score2 = input.nextInt();

                if (score2 < 0 || score2 > 100)
                    System.out.println("Error input out of bound. Score can only be between 0 and 100.");

            } while
            (score2 < 0 || score2 > 100);


            do {
                System.out.println("Enter the score for the 3rd student:  ");
                score3 = input.nextInt();

                if (score3 < 0 || score3 > 100)
                    System.out.println("Error input out of bound. Score can only be between 0 and 100.");
            }

            while
            (score3 < 0 || score3 > 100);


            do {
                System.out.println("Enter the score for the 4th student:  ");
                score4 = input.nextInt();


            }
            while
            (score4 < 0 || score4 > 100);


            do {
                System.out.println("Enter the score for the 5th student:  ");
                score5 = input.nextInt();

                if (score5 < 0 || score5 > 100)
                    System.out.println("Error input out of bound. Score can only be between 0 and 100.");

            }
            while
            (score5 < 0 || score5 > 100);


            do {
                System.out.println("Enter the score for the 6th student:  ");
                score6 = input.nextInt();

            }
            while (score6 < 0 || score6 > 100);

            do {
                System.out.println("Enter the score for the 7th student:  ");
                score7 = input.nextInt();

                if (score7 < 0 || score7 > 100)
                    System.out.println("Error input out of bound. Score can only be between 0 and 100.");
            }
            while (score6 < 0 || score6 > 100);
            {


                System.out.println("Thank you for your input, your entered scores are: " + score1, score2, score3, score4, score5, score6, score7);




            }
        }}}