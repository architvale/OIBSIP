import javax.swing.*;
import java.awt.event.*;

public class ReservationForm extends JFrame {
    private JTextField nameField, trainNumberField, dateField, fromField, toField;
    private JComboBox<String> classTypeBox;
    private JButton insertButton;
    private static int pnrCounter = 1000; // PNR counter for generating unique PNR

    public ReservationForm() {
        setTitle("Reservation Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 10, 80, 25);
        add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(100, 10, 160, 25);
        add(nameField);

        JLabel trainNumberLabel = new JLabel("Train Number:");
        trainNumberLabel.setBounds(10, 40, 100, 25);
        add(trainNumberLabel);

        trainNumberField = new JTextField(20);
        trainNumberField.setBounds(100, 40, 160, 25);
        add(trainNumberField);

        JLabel classTypeLabel = new JLabel("Class Type:");
        classTypeLabel.setBounds(10, 70, 80, 25);
        add(classTypeLabel);

        classTypeBox = new JComboBox<>(new String[]{"First Class", "Second Class", "Third Class"});
        classTypeBox.setBounds(100, 70, 160, 25);
        add(classTypeBox);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(10, 100, 80, 25);
        add(dateLabel);

        dateField = new JTextField(20);
        dateField.setBounds(100, 100, 160, 25);
        add(dateField);

        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(10, 130, 80, 25);
        add(fromLabel);

        fromField = new JTextField(20);
        fromField.setBounds(100, 130, 160, 25);
        add(fromField);

        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(10, 160, 80, 25);
        add(toLabel);

        toField = new JTextField(20);
        toField.setBounds(100, 160, 160, 25);
        add(toField);

        insertButton = new JButton("Insert");
        insertButton.setBounds(100, 200, 100, 25);
        add(insertButton);

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String trainNumber = trainNumberField.getText();
                String classType = classTypeBox.getSelectedItem().toString();
                String date = dateField.getText();
                String from = fromField.getText();
                String to = toField.getText();

                // Generate PNR
                String pnr = String.valueOf(pnrCounter++);
                
                // Store reservation details
                ReservationDatabase.addReservation(new Reservation(pnr, name, trainNumber, classType, date, from, to));

                // Display reservation details
                JOptionPane.showMessageDialog(null, "Reservation Successful! PNR: " + pnr + "\nName: " + name + "\nTrain Number: " + trainNumber + "\nClass: " + classType + "\nDate: " + date + "\nFrom: " + from + "\nTo: " + to);
            }
        });

        setVisible(true);
    }
}
