import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JButtonExample {
public static void main(String[] args) {
// Create a new JFrame (window)
JFrame frame = new JFrame("JButton Example");
frame.setSize(300, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
// Create a JButton
JButton button = new JButton("Click Me");
button.setBounds(100, 50, 100, 40);
frame.add(button);
// Create a JLabel to display a message when the button is clicked
JLabel label = new JLabel();
label.setBounds(100, 100, 200, 40);
frame.add(label);
// Add an ActionListener to the button
button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
// Set the text of the label when the button is clicked
label.setText("Button Clicked!");
}
});
// Set the frame visibility to true
frame.setVisible(true);
}
}
