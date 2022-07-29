package Part_I;
import java.util.Scanner;
public class FindGreatest {
    static int a, b, c;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a != b || b != c){
            System.out.println("The greatest number is : " + greater());
        } else {
            System.out.println("All the three numbers are same !");
        }
    }

    static int greater(){
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }
}
