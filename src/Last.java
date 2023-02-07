import java.util.Scanner;
public class Last {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the first number");

        int first = in.nextInt();
        System.out.println("You entered the first number " + first);

        System.out.println("Enter the second number");
        int second = in.nextInt();
        System.out.println("You entered the second number " + second);

        int product = first*second ;

        System.out.println("The product of these numbers is " + product);
}
}