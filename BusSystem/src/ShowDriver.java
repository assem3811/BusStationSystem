import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class ShowDriver extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowDriver frame = new ShowDriver();
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
	public ShowDriver() {
		setTitle("All Drivers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 401);
		

		DefaultListModel<String> model = new DefaultListModel<>();
		try {
			FileReader fileReader = new FileReader(new File("AvailableDrivers.txt"));
			BufferedReader buff = new BufferedReader(fileReader);
			String temp = buff.readLine();
			while(temp != null) {
				model.addElement(temp);
				temp = buff.readLine();
			}
			
			}catch(Exception e) {
				
			}
	}}



