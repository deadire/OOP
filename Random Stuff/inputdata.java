import java.util.Scanner;
public class inputdata {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("What is your name?");
        name = sc.next();
        System.out.printf("Your name is %s\n", name);
    }
}
