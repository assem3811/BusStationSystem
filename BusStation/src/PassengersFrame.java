import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengersFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengersFrame frame = new PassengersFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PassengersFrame() {
		setTitle("Passenger Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Passenger ID: Psn5669");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 28));
		lblNewLabel.setBounds(12, 13, 312, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reserve a Trip");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(43, 93, 152, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel a Trip");
		btnNewButton_1.setBounds(43, 130, 152, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show My Trips");
		btnNewButton_2.setBounds(43, 168, 152, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.setBounds(323, 215, 97, 25);
		contentPane.add(btnNewButton_3);
	}
}
