import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        int age;
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age (only integers accepted):");
        age = ageScanner.nextInt();
        System.out.flush();
        int shouldDate = (age/2)+7;
        System.out.println("Someone who is " + age + " years old should date someone who is at least " + shouldDate + "years old");
    }
}
