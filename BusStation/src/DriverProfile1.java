import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class DriverProfile1 extends JFrame {

	private JPanel contentPane;
	
	Drivers D1 = new Drivers(5, "Ali", 35, "Male", "Alex");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverProfile1 frame = new DriverProfile1();
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
	public DriverProfile1() {
		setTitle("Driver Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Driver: "+D1.getName());
		lblNewLabel.setFont(new Font("Lucida Fax", Font.PLAIN, 25));
		lblNewLabel.setBounds(12, 0, 329, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender: "+D1.getGender());
		lblNewLabel_1.setBounds(94, 73, 115, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age: "+D1.getAge());
		lblNewLabel_2.setBounds(94, 108, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Trips: "+D1.getNumOfTrips());
		lblNewLabel_3.setBounds(94, 137, 158, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address: "+D1.getAddress());
		lblNewLabel_4.setBounds(94, 166, 158, 16);
		contentPane.add(lblNewLabel_4);
	}

}
