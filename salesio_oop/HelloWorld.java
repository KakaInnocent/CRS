import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        String user = input.nextLine(); 
        System.out.println("Hello " + user);

        input.close();
    }  
}
