
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();


        if (marks <= 40) {
            System.out.println("Your grade is F");
        }
        if (marks <= 50) {
            System.out.println("Your grade is D");
        }
        if (marks <= 55) {
            System.out.println("You scored a C");
        }
        if (marks <= 75) {
            System.out.println(" Excelent ypur grade is B");
        }
        if (marks <= 100) {
            System.out.println(" excelent your grade is A");
        } else if (marks > 100) {
            System.out.println(" max marks is 100");

        }

    }

    }


/*
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String str;
        int upper = 0, lower = 0, num = 0, special = 0;

        Scanner pt = new Scanner(System.in);
        System.out.println("Write Something");
        str = pt.nextLine();
        int i = 0;

        do {
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upper ++;
            } else if (ch>='a' && ch<='z') {
                lower++;

            }
            else if(ch >='0' && ch<='9'){
                num++;
            }
            else {
                special++;
            }
            i++;
        }while(i<str.length());
        System.out.println("lower letters: "+ lower);
        System.out.println("upper letters: " + upper);
        System.out.println("numbers: "+ num);
        System.out.println("special: " + special);

    }
}


/*
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();


        if (marks <= 40){
            System.out.println("Your grade is F");
        }
        if (marks <= 50 ) {
            System.out.println("Your grade is D");
        }
        if (marks <= 55){
            System.out.println("You scored a C");
        }
        if (marks <= 75){
            System.out.println(" Excelent ypur grade is B");
        }
        if (marks <= 100){
            System.out.println(" excelent your grade is A");
        } else if (marks > 100) {
            System.out.println(" max marks is 100");

        }


    }
}





/*
public class Main {
    public static void main (String []args){
        int i;
        int square;
        int cube ;

        System.out.println("NUmber\tSquare\tcube");
        for (i=0; i<=10; i++ ){
            square = i * i;
            cube = i * square ;

            System.out.println(i   +  "\t" +  square  + "\t" +  cube);
        }
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scr.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scr.nextInt();

        if (num1 % num2 == 0)
            System.out.println("Is a multiple of");
        else System.out.println("Is not a multiple ");


    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = x.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else System.out.println(num + " is odd");



    }
}







/*
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter float: ");
        float number = input.nextFloat();
        System.out.println("Float entered is " + number);
    }
}

/*
public class Main{
    public static void main (String[] args ){
        int x = 3;
        int y = 4;

        if (x == y)
            System.out.println("They are equal ");
        if (x != y)
            System.out.println("THey are not equal");
        if (y > x )
            System.out.println("Its greater");

    }
}


/*
public class Main {
    public static void main(String [] args){
        int result = 1 + 3;
        System.out.println("Result = " + result );
        int original_result = result;
        result = result - 1;
        System.out.println("Original result = " +result);


    }
}



/*
public class Main {
    public static void main (String[] args){
        int [] arr;
        arr = new int[2];

        arr [0]= 2;
        arr[1] = 3;
        System.out.println(arr[0]);
    }
}


/*
public class Main {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("Integer " + a);
        long b = a;
        System.out.println("Long " +b);
        float c = b;
        System.out.println("Float " +c);
    }

}


/*
//Logical operators
public class Main{
    public static void main( String[] args) {
        int x = 100;
        int y = 120;
        if (x < 10 && y > 100){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

}



/*
import java.util.Scanner;

public class MaximumFinder {
    public static void determineMaximum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating points " + "values separated by spaces:  ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.print("Max(" + number1 + "," + number2 + "," + number3 + ") = " + result);
    }
    public double maximum (double x, double y, double z) {
        double maximumValue = Math.max(x, Math.max(y, z));
        return maximumValue ;

    }


}

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number1;
        int number2;
        int sum;
        System.out.print("Enter first Number ");
        number1 = input.nextInt();
        System.out.print("Enter Second Number ");
        number2 = input.nextInt();
        sum= number1 + number2;
        System.out.println("Sum is " + sum);
    }
}




/*
import java.util.Scanner;

public class Main {
    public static void main (String[] args ) {
        Scanner scnr = new Scanner (System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if  prime or not \n");
        if (number != 0) {
            number = scnr.nextInt();
            System.out.println(number + " is a prime " );

        }
    }

    private static int isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i=2; i < sqrt; i++) {
            if (number % i == 0) {
                System.out.println("number is perfectly divisible,no prime");
            }
        }
        int i = sqrt;
        return i;
    }
}

/*
public class Main {
    public static void main (String [] args) {
        int arr [];
        arr = new int[3];
        arr [0] = 3;
        arr [1] = 4;
        arr [2] = 6;
        System.out.println(arr);
        System.out.println(arr[2]);
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name ");
        System.out.print("Enter Your name ");

        System.out.println(sc.nextLine() + " Is " + sc.nextDouble()  + " Years Old");
    }
}






/*
//The for each loop,it loops only forward,Can not the end pf array to the beginning and there is no access to index of the items.
public class Main {
    public static void main (String[] args ) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}

/*
//While loops are used when the number of times for executing condition is not known
import java.util.Scanner;

//While Loops
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input ");
            input = scanner.next().toLowerCase();
            System.out.println();
        }
    }
}


/*
//For Loops
public class Main {
    public static void main( String[] args){
        for (int i = 0; i <= 5; i ++)
            System.out.println("Hello World " + i);
    }
}

/*
//FizzBuzz
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}



/*
tenary OPerators
public class Main {
    public static void main (String[] args) {
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
    }
}
/*
public class Main {
    public static void main (String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("The day is hot");
            System.out.println("Drink beer");
        }
        else if (temp > 20)
            System.out.println("Its a beautiful Day");
        else
            System.out.println("Its a Cold day");
    }
}

/*
public class Main {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

    }
}



/*
public class Main {
    public static void main (String[] args) {
        int x = 4;
        int y = 2;
        System.out.println(x == y);


        //Comparison operators which used to compare primitive values.
    }
}


/*
import java.text.NumberFormat;
import java.util.Scanner;

 //Mortgage program

public class Main {
    public static void main (String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

         int principal = 0;
         float monthlyInterest = 0;
         int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);


        while (true){
           System.out.print("Principal: ");
           principal = scanner.nextInt();
           if (principal >= 1000 && principal <= 1_000_000)
                   break;
           System.out.println("Enter a valid number between 1000 and 1000000");
       }


        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
               monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
                 break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true){
            System.out.print("Period (Years): ");
            byte years=scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments=years*MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Enter a value between 1 and 30.")
        }
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age);
    }

}

/*
public class Main {
    public static void main (String[] args) {
        //implicit Casting or automatic conversion
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 3;
        System.out.println(y);
    }
}
/*
Arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] [] numbers = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
    }
}


/*
arrays are used to store a list of numbers,elements etc and they are reference types

import java.util.Arrays;

public class Main {
    public  static void main(String[] args){
        int[] numbers = {2, 3, 4, 1, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

/*
reference types for storing complex objects,reference types are
copied by their references while primitive types are copied by their values
which are completely independent of each other.

import java.util.Date;

public  class Main {
    public static void main (String[] args) {
        byte age = 30;
        Date tomorrow = new Date();
        System.out.println(tomorrow);

    }
}

/*
public class Main {


    public static void main(String[] args) {
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

    }
}

 primitive types for storing data

public class Main {
    public static void main(String[] args) {
        byte age = 20;
        long viewCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

    }
}
*/

