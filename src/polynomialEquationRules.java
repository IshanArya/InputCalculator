/**
 * Created by Ishan on 3/31/2015.
 */
import java.util.Scanner;
public class polynomialEquationRules {

    Scanner sc = new Scanner(System.in);
    int degree;
    double answer;
    double x;
    double[] coefficients = new double[degree + 1];
    public polynomialEquationRules(){
        //Default Constructor
    }

    public polynomialEquationRules(int exponent){
        degree = exponent;
    }

    public void coefficient(){
        //Declare coefficients
        for(int i = degree; i >= 0; i--){
            System.out.print("Enter your coefficient for X^" + i + ": ");
            coefficients[i] = sc.nextDouble();
        }
    }

    public void plugInX(double input){
        x = input;
    }

    public void display(){
        //Display equation
        for(int i = degree; i >= 0; ){
            if(i > 0){
                System.out.print(coefficients[i] + " + ");
            }
            else{
                System.out.print(coefficients[i]);
            }
        }

    }

    public double answer(){
        //Return answer
        for(int i = degree; i >= 0; i--){
            answer += coefficients[i] * (Math.pow(x, i));
        }
        return answer;
    }

}
