
import java.util.Scanner;

class NewScanner
{
    public static void main(String[] args) {
        int a;float b;String s;

        Scanner in=new Scanner(System.in);
        System.out.println("enter a string:");
        s=in.nextLine();

        System.out.println("enter a number:");
        a=in.nextInt();

        System.out.println("enter a decimal:");
        b=in.nextFloat();
    }
}