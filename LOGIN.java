import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public LOGIN() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
        setLocationRelativeTo(null);
        
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLibraryManagement = new JLabel("Library Management - Java Point");
		lblLibraryManagement.setFont(new Font("Arial", Font.PLAIN, 18));
		lblLibraryManagement.setBounds(86, 11, 282, 33);
		contentPane.add(lblLibraryManagement);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(59, 62, 88, 33);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(157, 64, 183, 33);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPassword.setBounds(59, 99, 88, 33);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 99, 183, 33);
		contentPane.add(textField_1);

		JRadioButton RadioButton1 = new JRadioButton("Admin");
		RadioButton1.setBounds(157, 139, 109, 23);
		contentPane.add(RadioButton1);

		JRadioButton Radiobutton2 = new JRadioButton("Libririan Login");
		Radiobutton2.setBounds(157, 165, 109, 23);
		contentPane.add(Radiobutton2);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String username = textField.getText().trim();
		        String password = textField_1.getText().trim();

		        if (username.equals("") || password.equals("")) {
		            JOptionPane.showMessageDialog(contentPane, "Please enter both username and password.", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        if (RadioButton1.isSelected()) {
		            if (username.equals("Admin_01") && password.equals("AdminOne") || 
		                username.equals("Admin_02") && password.equals("AdminTwo") || 
		                username.equals("Admin_03") && password.equals("AdminThree")) {
		                JOptionPane.showMessageDialog(contentPane, "Successfully Logged In as Admin.", "Success", JOptionPane.INFORMATION_MESSAGE);
		                WELCOME librarianFrame = new WELCOME(); 
	                    librarianFrame.setVisible(true); 
	                    dispose();
		            } else {
		                JOptionPane.showMessageDialog(contentPane, "Invalid username or password for Admin.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        } else if (Radiobutton2.isSelected()) {
		            if (username.equals("Librarian_01") && password.equals("LibOne") || 
		                    username.equals("Librarian_02") && password.equals("LibTwo") || 
		                    username.equals("Librarian_03") && password.equals("LibThree")) {
		                    JOptionPane.showMessageDialog(contentPane, "Successfully Logged In as Librarian.", "Success", JOptionPane.INFORMATION_MESSAGE);
		                    ElectronicBookRentalSystem librarianFrame = new ElectronicBookRentalSystem(); 
		                    librarianFrame.setVisible(true); 
		                    dispose();
		                
		            } else {
		                JOptionPane.showMessageDialog(contentPane, "Invalid username or password for Librarian.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        } else {
		            JOptionPane.showMessageDialog(contentPane, "Please select user type.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
	
		btnLogin.setBounds(167, 195, 120, 25);
		contentPane.add(btnLogin);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(167, 226, 120, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		        
		    }
		});
	}	
		public static void main(String[] args) {
		LOGIN frame = new LOGIN();
		frame.setVisible(true);				
	}
}
		


