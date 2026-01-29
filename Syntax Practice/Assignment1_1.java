import java.util.Scanner;

public class Assignment1_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner askname = new Scanner(System.in);
//      Expected dataset is a string
        String name = askname.nextLine();
        System.out.println("Hello " + name);



//      Always close askname
        askname.close();

    }
}

// instruction
//2. Read input from the user (which is expected to be their name).
//        3. Output ‘Hello’ followed by the user input.

// Expected Output:
//Hello World
//Nathaly
//Hello Nathaly