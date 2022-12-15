import java.util.Scanner;
public class NumberGenerator {
    public static void main(String[] args) {
        System.out.println("-------Number Generator-------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        //System.out.println(userNumber);
        if (userNumber%2==0){
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }

        System.out.println("Number divided by two: " + (divideBy2(userNumber)));
        System.out.println("Number multiplied by two: " + (userNumber*2));
        System.out.println("Number squared: " + (userNumber * userNumber));

    }
    static double divideBy2 (double num){
        return num/2;
    }
}
