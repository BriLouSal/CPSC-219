import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int age = 18;
        System.out.print(age + "\n");

        Scanner ageAsk = new Scanner(System.in);

        System.out.println("How old are you?: ");
        age = ageAsk.nextInt();

        System.out.println("You are: " + age);
        if (age < 18) {
            System.out.println("You cannot Drink! ");
        }
        else {
            System.out.println("You can Drink!");
        }




        ageAsk.close();


    }
    
}
