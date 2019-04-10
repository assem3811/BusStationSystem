import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SettingTrips extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblDate;
	private JLabel lblTime;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblPrice;
	private JTextField textField_4;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingTrips frame = new SettingTrips();
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
	int tripindex=0;
	private JLabel lblDriver;
	
	Trips service = new Trips();
	int index = service.tripsOnSystem.size()-1;
	private JLabel lblVehicle;
	private JComboBox comboBox_1;
	private JLabel lblOwrw;
	private JComboBox comboBox_2;
	private JLabel lblstops;
	private JComboBox comboBox_3;
	private JTextField textField_5;
	public SettingTrips() {
		setTitle("Set Trip");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSouce = new JLabel("Source:");
		lblSouce.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSouce.setBounds(12, 13, 103, 46);
		contentPane.add(lblSouce);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDestination.setBounds(12, 92, 180, 46);
		contentPane.add(lblDestination);
		
		// Source Text Field
		
		textField = new JTextField();
		textField.setBounds(127, 18, 136, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Destination Text Field
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 97, 136, 46);
		contentPane.add(textField_1);
		
		lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDate.setBounds(12, 171, 103, 46);
		contentPane.add(lblDate);
		
		lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTime.setBounds(222, 171, 75, 46);
		contentPane.add(lblTime);
		
		//Date Text Field
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(74, 176, 136, 46);
		contentPane.add(textField_2);
		
		//Time Text Field
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(295, 176, 84, 46);
		contentPane.add(textField_3);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPrice.setBounds(391, 171, 84, 46);
		contentPane.add(lblPrice);
		
		//Price Text Field
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(472, 176, 67, 46);
		contentPane.add(textField_4);
		
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fileIn = new FileWriter("AvailableTrips.txt",true);
					fileIn.write(Integer.toString(++tripindex)+","+textField.getText()+","+textField_1.getText()+","+textField_2.getText()+","+textField_3.getText()+","+textField_4.getText()+System.lineSeparator());
					fileIn.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				service.addTrip(++index, textField.getText()+","+textField_1.getText()+","+textField_2.getText()+","+textField_3.getText()+","+textField_4.getText());
				
			}
		});
		btnConfirm.setBounds(552, 253, 97, 25);
		contentPane.add(btnConfirm);
		
		lblDriver = new JLabel("Driver:");
		lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDriver.setBounds(275, 13, 84, 46);
		contentPane.add(lblDriver);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(358, 29, 103, 25);
		contentPane.add(comboBox);
		
		lblVehicle = new JLabel("Vehicle:");
		lblVehicle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVehicle.setBounds(311, 92, 103, 46);
		contentPane.add(lblVehicle);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItem("Bus");
		comboBox_1.addItem("MiniBus");
		comboBox_1.addItem("Limosine");
		comboBox_1.setBounds(424, 108, 103, 25);
		contentPane.add(comboBox_1);
		
		lblOwrw = new JLabel("OW/RW:");
		lblOwrw.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOwrw.setBounds(473, 16, 84, 46);
		contentPane.add(lblOwrw);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addItem("One way");
		comboBox_2.addItem("Round way");
		comboBox_2.setBounds(547, 30, 133, 22);
		contentPane.add(comboBox_2);
		
		lblstops = new JLabel("#Stops:");
		lblstops.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblstops.setBounds(540, 95, 84, 46);
		contentPane.add(lblstops);
		
		comboBox_3 = new JComboBox();
		comboBox_3.addItem("0");
		comboBox_3.addItem("1");
		comboBox_3.addItem("Many");
		comboBox_3.setBounds(605, 109, 75, 22);
		contentPane.add(comboBox_3);
		
		JLabel lbltickets = new JLabel("#Tickets:");
		lbltickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltickets.setBounds(551, 171, 84, 46);
		contentPane.add(lbltickets);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(629, 171, 51, 46);
		contentPane.add(textField_5);
	}
}
