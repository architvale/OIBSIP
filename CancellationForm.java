import javax.swing.*;
import java.awt.event.*;

public class CancellationForm extends JFrame {
    private JTextField pnrField;
    private JButton cancelButton;

    public CancellationForm() {
        setTitle("Cancellation Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel pnrLabel = new JLabel("PNR Number:");
        pnrLabel.setBounds(10, 10, 100, 25);
        add(pnrLabel);

        pnrField = new JTextField(20);
        pnrField.setBounds(120, 10, 150, 25);
        add(pnrField);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(100, 50, 80, 25);
        add(cancelButton);

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pnr = pnrField.getText();
                Reservation reservation = ReservationDatabase.getReservation(pnr);
                if (reservation != null) {
                    int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to cancel the reservation for PNR: " + pnr + "?", "Confirm Cancellation", JOptionPane.YES_NO_OPTION);
                    if (confirmation == JOptionPane.YES_OPTION) {
                        ReservationDatabase.removeReservation(pnr);
                        JOptionPane.showMessageDialog(null, "Reservation Cancelled");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No reservation found with PNR: " + pnr);
                }
            }
        });

        setVisible(true);
    }
}
