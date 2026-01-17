import java.util.Scanner;


public class gpa_calc {
    public static void main(String[] args){

        Scanner user_input =  new Scanner(System.in);
        // We Wanne use Double as it's more precise. Although it takes tolls on the memory
        Integer gpa = user_input.nextInt();
        String letter = "";
        // Long Long, Int, Double, Long (Integers)

        // Use Grading Scale of CPSC 217


        if(gpa <= 100 && gpa >= 97  ){
            letter = "A+";
        }
        else if (gpa < 97 && gpa >= 94){
            letter = "A";
        }
        else if (gpa < 94 && gpa >= 90){
            letter = "A-";
        }
        else if (gpa < 90 && gpa >= 87) {
            letter = "B+";
        }
        else if (gpa < 87 && gpa >= 84){
            letter = "B";

        }
        else if (gpa < 84  && gpa >= 80) {
            letter = "B-";
        }
        else if (gpa < 80  && gpa >= 77) {
            letter = "C+";
        }
        else if (gpa < 77  && gpa >= 74) {
            letter = "C";
        }
        else if (gpa < 74 && gpa >= 70) {
             letter = "C-";
        }
        else if (gpa < 70  && gpa >= 67) {
             letter = "D+";
        }
        else if (gpa < 67  && gpa >= 60) {
             letter = "D";
        }
        else{
             letter = "F";
        }

        System.out.println("Your grade is: \n" + gpa + "Therefore, You've earned the Letter grade: " + letter);


        user_input.close();
    }
}
