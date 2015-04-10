/**
 * Created by Ishan on 3/31/2015.
 */

import java.util.Scanner;
public class polynomialEquation {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter your degree: "); //Degree of polynomial
        polynomialEquationRules test = new polynomialEquationRules(sc.nextInt()); //User declares degree
        test.coefficient(); //Run program to declare coefficients
        System.out.println("Do you want to input an X value, or do you want to use the presets (-10 to 10)?");
        System.out.println("1. input an X value");
        System.out.println("2. Use a preset (-10 to 10)");
        if(sc.nextInt() == 1){
            System.out.print("Input an X value: ");
            test.plugInX(sc.nextDouble());
            //test.display();
            System.out.print(test.answer());
        }
        else if(sc.nextInt() == 2){
            for(int i = 10; i >= -10; i--){
                test.plugInX(i);
                System.out.println(test.answer());
            }
        }

        test.display();
        System.out.print(test.answer());
    }
}
