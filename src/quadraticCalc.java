/**
 * Created by Ishan on 3/28/2015.
 */

import java.util.Scanner;

public class quadraticCalc {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("First we will ask for what you will be plugging in for \"x,\" then we will ask for the degree of the equation and the coefficients of each monomial.");
        System.out.print("Define X: ");
        double x = sc.nextDouble();
        System.out.println(polynomial(x));

        }


    public static double polynomial(double x){
        System.out.print("Enter your equation's degree: ");
        int degree = sc.nextInt();
        int number = degree;
        double i = (double)degree;
        double [] mon = new double[degree + 1];
        while(degree >= 0) {
            System.out.print("Enter your coefficient for x^" + degree + ": ");
            double coefficient = sc.nextDouble();
            mon[degree] = coefficient * (Math.pow(x, i));
            degree--;
            i--;
            }

        double answer = 0;
        while(number >= 0){
            answer += mon[number];
            number--;
            }

        return answer;

        }

}
