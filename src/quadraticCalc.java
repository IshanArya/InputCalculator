/**
 * Created by Ishan on 3/28/2015.
 */

import java.util.Scanner;

public class quadraticCalc {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("First we will ask whether you want to use our preset terms (-10 to 10) or whether you want to plug in your own term for X, and, if so, what you will be plugging in for X. Then we will ask for the degree of the equation and the coefficients of each monomial.");
        System.out.println("Presets or define your own?");
        System.out.println("1. Presets");
        System.out.println("2. Define your own");
        int pick = sc.nextInt();
        double x;
        if(pick == 2){
            System.out.print("Define X: ");
            x = sc.nextDouble();
            System.out.println(polynomialWithoutPreset(x));
        }
        else{
            System.out.print("Define X: ");
            x = sc.nextDouble();
            System.out.println(polynomialWithoutPreset(x));
        }



        }


    public static double polynomialWithoutPreset(double x){
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
    public static double polynomialWithPreset(double x){
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
