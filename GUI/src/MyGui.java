import javax.swing.*;
import java.awt.*;

public class MyGui extends JFrame {
    JButton btn1;

    MyGui(){
        btn1 = new JButton("Hello");
        btn1.addActionListener(new MyListner());
        add(btn1);
        setLayout(new FlowLayout());
        setSize(200 ,200);
        setVisible(true);
    }
}
