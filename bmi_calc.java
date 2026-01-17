import java.util.Scanner;

public class bmi_calc {
    public static void main(String[] args) {
        Scanner ask_weight = new Scanner(System.in);
        System.out.print("What is your weight in kg: ");
        Double weight = ask_weight.nextDouble();
        
        Scanner ask_heightScanner = new Scanner(System.in);
        System.out.print("What is your height in meters: ");
        Double height = ask_heightScanner.nextDouble();


        Double calculate_bmi = (weight / (Math.pow(height, 2)));

// Pirate software ahh code
        if (calculate_bmi < 18.5){
            System.out.print("You are Underweight");
        }
        else if (calculate_bmi >= 18.5 && calculate_bmi > 25){
            System.out.print("You are Normal Weight");
        }
        else if (calculate_bmi >= 25 && calculate_bmi > 30){
            System.out.print("You are  Overweight");
        }
        else{
            System.out.print("You are Obese");
        }






        
        ask_weight.close();
        ask_heightScanner.close();

    }
    
}
