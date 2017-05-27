package Introducao;

import java.util.Scanner;

/**
 * Created by rodrigo on 5/26/17.
 * Programa para adição entre dois numeros recebidos.
 */
public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}
