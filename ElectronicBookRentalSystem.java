import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class ElectronicBookRentalSystem extends JFrame implements ActionListener {

	 private ArrayList<Book> books;
	    
	    private JLabel labelBook;
	    private JTextField fieldBook;
	    private JButton buttonCheck;
	    private JLabel labelCopies;
	    private JTextField fieldCopies;
	    private JLabel labelRent;
	    private JRadioButton radioButtonYes;
	    private JRadioButton radioButtonNo;
	    private ButtonGroup buttonGroup;
	    private JLabel labelAmount;
	    private JTextField fieldAmount;
	    private JButton buttonRent;
	    private JPanel contentPane;
	    private JLabel lblNewLabel;
	    private JLabel lblAndroidApplication;
	    private JLabel lblProgrammingConcepts;
	    private JLabel lblNewLabel_1;
   
    

    
    public ElectronicBookRentalSystem() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setResizable(false);
        setLocationRelativeTo(null);
        
        books = new ArrayList<Book>();
        books.add(new Book("System Analysis and Design", "Gary B. Shelly", 20));
        books.add(new Book("Android Application", "Corinne Hoisington", 20));
        books.add(new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 20));
        
        // initialize components
        labelBook = new JLabel("Check The Book:");
        labelBook.setBounds(20, 156, 187, 30);
        fieldBook = new JTextField(10);
        fieldBook.setBounds(131, 156, 171, 30);
        buttonCheck = new JButton("Check");
        buttonCheck.setBounds(312, 156, 187, 30);
        labelCopies = new JLabel();
        labelCopies.setText("Amount of Copies");
        labelCopies.setFont(new Font("Tahoma", Font.PLAIN, 12));
        labelCopies.setBounds(20, 119, 426, 30);
        fieldCopies = new JTextField(10);
        labelRent = new JLabel("Do you want to rent?");
        labelRent.setBounds(20, 193, 187, 30);
        radioButtonYes = new JRadioButton("Yes");
        radioButtonYes.setBounds(182, 193, 102, 30);
        radioButtonNo = new JRadioButton("No");
        radioButtonNo.setBounds(286, 193, 187, 30);
        buttonGroup = new ButtonGroup();
        labelAmount = new JLabel("Amount of book?");
        labelAmount.setBounds(20, 234, 187, 30);
        fieldAmount = new JTextField(10);
        fieldAmount.setBounds(131, 234, 171, 30);
        buttonRent = new JButton("Rent");
        buttonRent.setBounds(312, 234, 187, 30);
        
        // add radio buttons to button group
        buttonGroup.add(radioButtonYes);
        buttonGroup.add(radioButtonNo);
        contentPane.setLayout(null);
        
        // add components to frame
        getContentPane().add(labelBook);
        getContentPane().add(fieldBook);
        getContentPane().add(buttonCheck);
        getContentPane().add(labelCopies);
        getContentPane().add(labelRent);
        getContentPane().add(radioButtonYes);
        getContentPane().add(radioButtonNo);
        getContentPane().add(labelAmount);
        getContentPane().add(fieldAmount);
        getContentPane().add(buttonRent);
        
        lblNewLabel = new JLabel("[0] System Analysis and Design, Gary B. Shelly");
        lblNewLabel.setBounds(20, 41, 361, 30);
        contentPane.add(lblNewLabel);
        
        lblAndroidApplication = new JLabel("[1] Android Application, Corinne Hoisington");
        lblAndroidApplication.setBounds(20, 65, 344, 30);
        contentPane.add(lblAndroidApplication);
        
        lblProgrammingConcepts = new JLabel("[2] Programming Concepts and Logic Formulation, Rosauro E. Manuel");
        lblProgrammingConcepts.setBounds(20, 91, 372, 30);
        contentPane.add(lblProgrammingConcepts);
        
        lblNewLabel_1 = new JLabel("Choose a book:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(20, 11, 187, 30);
        contentPane.add(lblNewLabel_1);
        
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(115, 294, 187, 30);
        contentPane.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {        
        int option = JOptionPane.showOptionDialog(null, "Are you sure you want to go back to the main menu?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
      
        if (option == JOptionPane.YES_OPTION) {
         // Create and show the other frame
         LOGIN main = new LOGIN();
         main.setVisible(true);
         // Close the current frame
         dispose();
            }
        }
    });
        
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(312, 294, 187, 30);
        contentPane.add(btnExit);
        btnExit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
        
        buttonCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(fieldBook.getText());
                Book book = books.get(index);
                labelCopies.setText(book.getName() + ", " + book.getAuthor() + " - " + book.getCopies() + " COPIES");
            }
        });
        
        buttonRent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(fieldBook.getText());
                Book book = books.get(index);
                if (radioButtonYes.isSelected()) {
                    int amount = Integer.parseInt(fieldAmount.getText());
                    if (book.getCopies() >= amount) {
                        book.setCopies(book.getCopies() - amount);
                        JOptionPane.showMessageDialog(null, "Thank you for renting " + amount + " copies of " + book.getName() + ", " + book.getAuthor() + "!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough copies available!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Thank you and keep safe");
                }
            }
        });
            
        buttonCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(fieldBook.getText());
                    Book book = books.get(index);
                    labelCopies.setText(book.getName() + ", " + book.getAuthor() + " - " + book.getCopies() + " COPIES");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid key entered. Please enter a valid key.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Book not found. Please enter a valid key.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonRent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(fieldBook.getText());
                    Book book = books.get(index);
                    labelCopies.setText(book.getName() + ", " + book.getAuthor() + " - " + book.getCopies() + " COPIES");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid key entered. Please enter a valid key.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Book not found. Please enter a valid key.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(544, 370);
                setVisible(true);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(544, 370);
        setVisible(true);
    } 
   
}		
	