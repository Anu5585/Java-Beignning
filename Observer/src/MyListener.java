import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Buttom Clixcked");
        JButton btn = (JButton) e.getSource();
        System.out.println(btn.getText());
    }
}
