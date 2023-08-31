import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        int age;
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age (only integers accepted):");
        age = ageScanner.nextInt();
        System.out.flush();
        int shouldRead = 100 - age;
        System.out.println("Someone who is " + age + " years old should read at least " + shouldRead + " pages before giving up on a book.");



    }
}
