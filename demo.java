// public class demo {
//    public static void main(String[] args) {
//          int a = 5;
//          int b = 3;
//          int c = 2;

//          int sum = a + b + c ;
//          System.out.println(sum);
//      }
// }
// import java.util.Scanner;

// public class demo {
//    public static void main(String[] args) {
//          Scanner S = new Scanner(System.in);

//          System.out.println("Enter the name");
//          String name = S.nextLine();

//          System.out.println("Name : " + name);

//          S.close();
//      }
// }

//Write a program to calculate the CGPA of the student by using marks of the Three Subjects : (OUT OF 100)


// import java.util.Scanner;

// public class demo {
//    public static void main(String[] args) {
//          Scanner s = new Scanner(System.in);
//          System.out.println("Enter the marks of the first subject : ");
//          int marks1 = s.nextInt();

//         System.out.println("Enter the marks of the second subject");
//         int marks2 = s.nextInt();

//         System.out.println("Enter the marks of the third subject");
//         int marks3 = s.nextInt();

//         double percentage = (marks1 + marks2 + marks3) / 3.0 ;
//         double cgpa = percentage/9.5;

//         System.out.println("The final result is : " + cgpa);
//         s.close();

//      }
// }


// :

// import java.util.Scanner;

// public class demo {
//    public static void main(String[] args) {
    
//     Scanner s = new Scanner(System.in);
    
//     System.err.println("Enter your Name : ");
//     String name = s.nextLine();

//     System.out.println("Hello " + name + " Have a good day !");
     
//     s.close();
//      }
// }


//Write A java program to convert kilometers to miles :

// import java.util.Scanner;

// public class demo {
//    public static void main(String[] args) {
         
//     Scanner s = new Scanner(System.in);

//     System.out.println("Enter the value of Kilometers : ");
//     int kilo = s.nextInt();

//     double miles = kilo * 0.621371 ;

//     System.out.println("The converted value of the kilometers in miles is : " + miles);
//     s.close();
//      }
// }

//Write a java program to detect whether a given number is Integer or Not :

import java.util.Scanner ;

public class demo {
   public static void main(String[] args) {
         
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the Number to check whether the given number is interger or not");

    if (s.hasNextInt())  {
        int num = s.nextInt();
        System.out.println("Number " + num + " is Integer");
    } else {
        System.out.println("Number is not Integer");
    }
    s.close();
     }
}