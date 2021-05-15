import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends Applet{
    private JTextField messageField;
    private JTextArea displayArea;
    public app(){
        messageField = new JTextField();
        messageField.setEditable(false);
        messageField.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sendData(e.getActionCommand());
                        messageField.setText("");
                    }
                }
        );
        add(messageField, BorderLayout.SOUTH);


        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        displayArea.setEditable(false);

        setSize(350, 650);
        setVisible(true);
    }

    private void sendData(String message) {
        displayArea.append(message+"\n");
    }

}
