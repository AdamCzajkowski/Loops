import java.util.Scanner;

public class Loops {
    //exercise 1
    static void exercise1() {
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
    }

    //exercise 2
    static void exercise2() {
        for(int i=5; i<=10; i++) {
            System.out.print(i + " ");
        }
    }

    //exercise 3
    static void exercise3() {
        for(int i=10; i>0; i--) {
            System.out.print(i + " ");
        }
    }

    // exercise 4a
    static void exercise4a() {
        for (int i=1; i<=100; i++) {
            if (i%3==0) {
                System.out.print(i + " ");
            }
        }
    }

    // exercise 4b
    static void exercise4b() {
        for (int i=1; i<=100; i++) {
            if (i%5==0) {
                System.out.print(i + " ");
            }
        }
    }

    // exercise 4c
    static void exercise4c() {
        for (int i=1; i<=100; i++) {
            if (i%5==0 && i%3==0) {
                System.out.print(i + " ");
            }
        }
    }

    // exercise 5
    static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit min value: ");
        int min = scanner.nextInt();
        System.out.println("Submit max value: ");
        int max = scanner.nextInt();

        for(int i=min; i<=max; i++) {
            System.out.print(i + " ");
        }
    }

    // exercise 6
    static void exercise6() {
        for (int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print(String.format("%2d",i*j) + " ");
            }
            System.out.println(" ");
        }
    }

    // exercise 7 Fibonacci
    static void exercise7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many figures: ");
        int figure = scanner.nextInt();
        for (int i=0;i <= figure; i++){
            System.out.print(fib(i)+" ");
        }
    }

    static int fib(int n){
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // exercise 8
    static void exercise8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Submit a, b and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + "x^2 + " + b + "x +" + c + "= 0");

        double delta = b^2 - 4*a*c;
        if (delta>0){
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + String.format("%.2f",x1) +", x2 = " + String.format("%.2f",x2));
        } else if(delta == 0){
            double x1 = (-b)/(2*a);
            System.out.println("x1 = " + String.format("%.2f",x1));
        } else {
            System.out.println("error delta < 0");
        }
    }

    public static void main(String[] args) {
        exercise8();
    }
}
