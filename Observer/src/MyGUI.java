import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {
    JButton btn1;
    MyGUI(){
btn1= new JButton("Hello");
btn1.addActionListener(new HiLostener());
add(btn1);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,200);
    }



    public static void main(String[] args) {
        new MyGUI();
    }
}