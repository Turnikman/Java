package lab1.pkg2_2;

import java.util.Scanner;

public class Lab12_2 {

    public static void main(String[] args) {
        int number = 1;
        String surname = "Shtanko";
        byte age = 25;
        float weight = 70.6f;
        boolean smoke = false;
        
        Show(number, surname, age, weight, smoke);
        Input(number, surname, age, weight, smoke);
        Show(number, surname, age, weight, smoke);
    }

    public static void Input(int number, String surname, byte age, float weight, boolean smoke) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        number = scan.nextInt();
        System.out.println("Surname: ");
        surname = scan.next();
        System.out.println("Age: ");
        age = scan.nextByte();
        System.out.println("Weight: ");
        weight = scan.nextFloat();
        System.out.println("Smoke: ");
        smoke = scan.nextBoolean();

    }

    public static void Show(int number, String surname, byte age, float weight, boolean smoke) {
        System.out.println(
                "Number: " + number + "\n"
                + "Surname: " + surname + "\n"
                + "Age: " + age + "\n"
                + "Weidht: " + weight + "\n"
                + "Smoke(true/false): " + smoke
        );
    }
}
