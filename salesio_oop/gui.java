import javax.swing.*;
public class gui {
    JFrame f;  
    gui(){  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
}  
    public static void main(String args[]) {
        new gui();
    }
}
