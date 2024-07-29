import javax.swing.*;
import java.awt.event.*;

public class MainForm extends JFrame {
    private JButton reservationButton;
    private JButton cancellationButton;

    public MainForm() {
        setTitle("Online Reservation System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        reservationButton = new JButton("Make Reservation");
        reservationButton.setBounds(50, 50, 150, 30);
        add(reservationButton);

        cancellationButton = new JButton("Cancel Reservation");
        cancellationButton.setBounds(200, 50, 150, 30);
        add(cancellationButton);

        reservationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReservationForm();
            }
        });

        cancellationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CancellationForm();
            }
        });

        setVisible(true);
    }
}
