import java.lang.System;
import java.lang.Math;
import java.util.Scanner;
public class Lecture02 {

    public static void main(String[] args) {
        double area;
        // Use conditional statemetns as such
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What would you like to calculate: Circle for 1 or Rectangle for 2");
        int choice = keyboard.nextInt();
        keyboard.close();

        if (choice == 1) {

                Scanner circle = new Scanner(System.in);
                System.out.print("What is your radius");
                Double radius = circle.nextDouble();

                // Pi * r^2
                area = Math.pow(radius, 2) * Math.PI;
                circle.close();


        }
        
        else if (choice == 2) {

                Scanner lengthAsk = new Scanner(System.in);
                System.out.print("What is your length");
                Double length = lengthAsk.nextDouble();
                
                
                Scanner WidthAsk = new Scanner(System.in);
                System.out.print("What is your width");
                Double width = WidthAsk.nextDouble();





                // Pi * r^2
                area = length * width;

                lengthAsk.close();
                WidthAsk.close();


                
        }
        else{
            System.out.println("CHOOSE ANOTHER ONE! ");
            area = 0;
        }
        
        System.out.println(area);
            
            




        
    }

    
}
