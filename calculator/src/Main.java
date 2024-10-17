import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("********* Welcome to Amar's Calculator *************");
            System.out.println("1. Press 1 for addition");
            System.out.println("2. Press 2 for Subtraction");
            System.out.println("3. Press 3 for Multiplication");
            System.out.println("4. Press 4 for division");
            System.out.println("5. Press 5 for Exit.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Please enter 1st number for addition: ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please enter 2nd number for addition: ");
                    double num2 = sc.nextDouble();
                    System.out.println("addtion");
                    double ans =  cal.add(num1, num2);
                    System.out.println("Summation of " + num1+" and "+ num2 +" is : " + ans);
                    break;
                }
                case 2:{
                    System.out.println("Please enter 1st number for subtraction.");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.println("Please enter the 2nd number for subtraction.");
                    double num2 = sc.nextDouble();
                    cal.subtract(num1 , num2);
                    double anse = cal.subtract(num1,num2);
                    System.out.println("Subtractions of  "+ num1 + "and " + num2 +"is: " + anse);
                    System.out.println("substraction");
                    break;
                }
                case 3:
                {
                    System.out.println("Please enter the 1st number for multiplication: ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.println("Enter the 2nd number: ");
                    double num2 = sc.nextDouble();
                    cal.multiple(num1 , num2);
                    double anss = cal.multiple(num1,num2);
                    System.out.println("multiplications of  "+ num1 + "and " + num2 +"is : " + anss);
                    System.out.println("multiplication");
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the first number to divide: ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.println("enter the second number to divide: ");
                    double num2 = sc.nextDouble();
                    double amss = cal.divide(num1 , num2);
                    System.out.println("Divisions of  " + num1 + "and " + num2 + "is : " + amss);
                    System.out.println("division");
                    break;
                }
                case 5:
                {
                    System.out.println("Exit the calculator");
                    return;
                }
                default: {
                    System.out.println("Error: Please Enter Valid Input");
                    break;
                }
            }
        }

//        System.out.println("addition :" + cal.add());
//        System.out.println("multiplication :" + cal.multiple());
//        System.out.println("divide :" + cal.divide());
//        System.out.println("subtract :" + cal.subtract());
    }
}