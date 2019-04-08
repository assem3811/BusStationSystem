import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginMenu {

	private JFrame frmBusSystem;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu window = new LoginMenu();
					window.frmBusSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Drivers Frames....................
	
	DriverProfile1 DP1 = new DriverProfile1();
	DriverProfile2 DP2 = new DriverProfile2();
	DriverProfile3 DP3 = new DriverProfile3();
	
	PassengersFrame PFrame = new PassengersFrame();
	
	ManagerFrame MFrame = new ManagerFrame();
	
	private void initialize() {
		frmBusSystem = new JFrame();
		frmBusSystem.setTitle("Bus System");
		frmBusSystem.setBounds(100, 100, 450, 300);
		frmBusSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBusSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Authentication");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 41, 225, 26);
		frmBusSystem.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Manager");
		comboBox.addItem("Passenger");
		comboBox.addItem("Driver");
		comboBox.setToolTipText("");
		comboBox.setBounds(224, 45, 120, 22);
		frmBusSystem.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(60, 103, 106, 22);
		frmBusSystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(60, 150, 106, 16);
		frmBusSystem.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(224, 104, 120, 22);
		frmBusSystem.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 148, 120, 22);
		frmBusSystem.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox.getSelectedItem().toString() == "Driver") {
					 String DUName = textField.getText();
					 String DPsd = passwordField.getText();
					 
					if(DUName.equals("Ali")&&DPsd.equals("1234") ) {
						DP1.setVisible(true);
					}
					else if(DUName.equals("Ahmed")&&DPsd.equals("5678")) {
						DP2.setVisible(true);
					}
					else if(DUName.equals("Menna")&&DPsd.equals("5432")) {
						DP3.setVisible(true);
					}
					
					JOptionPane.showMessageDialog(btnNewButton, "Logged in Successfully!");
					
				}
				else if(comboBox.getSelectedItem().toString() == "Passenger") {
					
					String PUId = textField.getText();
					String PPsd = passwordField.getText();
					if(PUId.equals("Psn5669") && PPsd.equals("1122")) {
						JOptionPane.showMessageDialog(btnNewButton, "Logged in Successfully!");
						PFrame.setVisible(true);
					}
					
				}
				else if(comboBox.getSelectedItem().toString() == "Manager") {
					MFrame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(153, 215, 97, 25);
		frmBusSystem.getContentPane().add(btnNewButton);
		
		
	}
}
