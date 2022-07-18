import java.util.*;
import javax.swing.*;
class addition {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame();
        int num1=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter first number")); 
        //System.out.println("Enter first Number: ");
        Scanner input = new Scanner(System.in);
        //int num1 = input.nextInt();
        //System.out.println("Enter second Number: ");
        int num2=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter second number"));
        //int num2 = input.nextInt();
        int sum = num1 + num2;
        sum = (JOptionPane.showMessageDialog(frame, "Sum of " + num1 + " and " + num2 + " is " + sum));

        //System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        input.close();
    }

    private static int IntegerparseInt(String showInputDialog) {
        return 0;
    }
}
