package W4_Exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack x = new Stack();
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("1 - push");
            System.out.println("3 - pop");
            System.out.println("4 - print");
            System.out.println("5 - greatest");
            System.out.println("6 - swap");
            System.out.println("7 - doubles");
            System.out.println("0 - exit");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.push(data);
                    System.out.println("---------");
                    x.print();
                    System.out.println("---------");
                    break;
                case 3:
                    System.out.println("pop: " + x.pop());
                    break;
                case 4:
                    x.print();
                    break;
                case 5:
                    System.out.println("greatest: " + x.greatest(x));
                    break;
                case 6:
                    x.swap(x);
                    break;
                case 7: 
                    x.doubles(x);
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}
