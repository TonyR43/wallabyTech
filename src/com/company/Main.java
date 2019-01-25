

package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        printHeader();
        System.out.println("Please enter your first name.");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name.");
        String lastName =input.nextLine();
        printName(firstName, lastName);


        System.out.println("Please enter your year of birth.");
        int birthYear = input.nextInt();
        printAge(birthYear);

        System.out.println("Please pick a number from one through ten and enter that number.");
        int employeeNumber = input.nextInt();
        printEvenOrOdd(employeeNumber);


        printGeneratedSecretPassword(employeeNumber);


    }

    private static void printHeader()
    {
        System.out.println(" Welcome to the WallabyTech Employee Application");
        System.out.println("=================================================");
    }

    private static void printName(String firstName, String lastName)
    {
        System.out.println("You entered: " + firstName + " " + lastName);
        System.out.println("------------------------------------------------");
    }

    private static void printAge(int birthYear)
    {
        int thisYear = 2019;
        int age = thisYear - birthYear;
        System.out.println("Employee's age is: " + age);
        System.out.println("------------------------------------------------");
    }

    private static void printEvenOrOdd(int employeeNumber)
    {
        int odd = employeeNumber % 2;
        int even = employeeNumber % 2;

        if (odd == 1)
        {
            System.out.println("The number you entered: " + employeeNumber + " is odd.");
        }
        else if (even == 0)
        {
            System.out.println("The number you entered: " + employeeNumber + " is even.");
        }
        System.out.println("------------------------------------------------");
    }

    //ToDo The method below works half way, I need to go back and rewrite it.
    private static void printGeneratedSecretPassword(int employeeNumber)
    {
        int max = 10;
        int min = 1;
        boolean range;
        int secretNumber;
        do
        {
            java.util.Random random = new java.util.Random();
            int randomRange = random.nextInt(max);

            secretNumber = ((employeeNumber + randomRange) * 5);
            range =(secretNumber <= max && secretNumber >= min);
        }while (range);


        System.out.println("Your secret password is: " + secretNumber + "!!!");
        System.out.println("=================================================");

    }


}