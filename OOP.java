import java.util.Arrays;
import java.util.Scanner;

class OOP {
    public static void main(String[] args) {

       // Emmanuel Levinne Tecson
       // BSIT-2A
       // Lab Activity #1 - Programming Exercises (Review)
       // IT ELEC 1 - Object Oriented Programming


        // programming basic
        //calculatorEasy();
        //tempConverter();
        //loopCalc();

        // selection
        // selectionEasy();
        // selectionMedium();
        // selectionHard();

        // repetition
        // repetitionEasy();
        // repetitionMedium();
        // repetitionHard();


        // Methods
        // methodsEasy();
        // methodsMedium();
        // methodsHard();

        // arrays
        // arraysEasy();
        // arraysMedium();
        //arraysHard();

    }
    public static void arraysHard() {
        int[] numbers = {25, 7, 42, 3, 18};

        int min = numbers[0];
        int max = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }



    public static void arraysMedium() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
    public static void arraysEasy() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Arrays in reverse order:");


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }



    public static void methodsHard() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        if (text.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

    }




    public static void methodsMedium() {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("Enter a sentence: ");
        text = input.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char charac = text.charAt(i);
            if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u')
            {
                count++;
            }
        }
         System.out.println("Number of vowels: " + count);
    }


    public static void methodsEasy() {
        double square;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to square: ");
        double num = input.nextInt();
        square = Math.sqrt(num);
        System.out.println("The square root of " + num + " is: " + square);
    }


    public static void repetitionHard() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
            System.out.print("Divisors of " + num + ": ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void repetitionMedium() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Error, Please No negative hehe");
                return;
            }
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.format("\nFactorial of %d = %d\n", number, factorial);

        } catch (Exception e) {
            System.out.println("Invalid");

        }
    }


    public static void repetitionEasy() {

        System.out.println("Natural numbers");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }



    public static void selectionHard() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade number: ");
        int grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Your grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid Grade");
        }
    }

    public static void selectionMedium() {
        Scanner input = new Scanner(System.in);

        System.out.println("1st Number: ");
        int num1 = input.nextInt();
        System.out.println("2nd Number: ");
        int num2 = input.nextInt();
        System.out.println("3rd Number: ");
        int num3 = input.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }


    public static void selectionEasy() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nCheck if Number is negative, positive, or zero");
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }


    public static void loopCalc() {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("\nBasic Loop Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Pili lang 1-5");

            int choiceNiJacob = input.nextInt();
            double num1 = 0, num2 = 0, result;

            if (choiceNiJacob >= 1 && choiceNiJacob <= 4) {
                System.out.println("Enter value of x: ");
                num1 = input.nextDouble();
                System.out.println("Enter value of y: ");
                num2 = input.nextDouble();
            }

            switch (choiceNiJacob) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Invalid man uy");
                    }
                    break;
                case 5:
                    System.out.println("Babye po! ^^");
                    loop = false;
                    break;
                default:
                    System.out.println("Bawal yan");
            }
        }
    }

    public static void tempConverter() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temp = input.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit or Kelvin (C, F, K): ");
        String unit = input.next().toUpperCase();

        if (unit.equals("C")) {
            double kelvin = temp + 273.15;
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Temperature in Kelvin: " + kelvin);
        } else if (unit.equals("F")) {
            double celsius = (temp - 32) * 5 / 9;
            double kelvin = temp + 273.15;
            System.out.println("Temperature in Celcius: " + celsius);
            System.out.println("Temperature in Kelvin: " + kelvin);
        } else if (unit.equals("K")) {
            double celsius = (temp - 32) * 5 / 9;
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else {
            System.out.println("Invalid unit entered.");
        }
    }

    public static void calculatorEasy() {
        Scanner input = new Scanner(System.in);

        System.out.print("1st number: ");
        double num1 = input.nextDouble();

        System.out.print("Operator (+, -, *, /, ^): ");
        char operator = input.next().charAt(0);

        System.out.print("2nd number: ");
        double num2 = input.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println("The result: " + result);
    }
}



