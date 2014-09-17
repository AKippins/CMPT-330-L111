import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Sharing extends JFrame {

	private JPanel contentPane;
	private final JLabel lblValue = new JLabel("Value 1");
	private final JLabel lblValue_1 = new JLabel("Value 2");
	private final JLabel lblValue_2 = new JLabel("Value 3");
	private final JTextField sharingField1 = new JTextField();
	private final JTextField sharingField2 = new JTextField();
	private final JTextField sharingField3 = new JTextField();
	private final JButton btnAdd = new JButton("Add");
	private final JButton btnUpdate = new JButton("Update");
	Item Item = new Item(String myFirstVal, String mySecondVal, String myThirdVal);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sharing frame = new Sharing();
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
	public Sharing() {
		sharingField3.setText("");
		sharingField3.setBounds(182, 123, 86, 20);
		sharingField3.setColumns(10);
		sharingField2.setText("");
		sharingField2.setBounds(182, 97, 86, 20);
		sharingField2.setColumns(10);
		sharingField1.setText("");
		sharingField1.setBounds(182, 72, 86, 20);
		sharingField1.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Sharing Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblValue.setBounds(109, 75, 46, 14);
		
		contentPane.add(lblValue);
		lblValue_1.setBounds(109, 100, 46, 14);
		
		contentPane.add(lblValue_1);
		lblValue_2.setBounds(109, 126, 46, 14);
		
		contentPane.add(lblValue_2);
		
		contentPane.add(sharingField1);
		
		contentPane.add(sharingField2);
		
		contentPane.add(sharingField3);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnAdd_actionPerformed(arg0);
			}
		});
		btnAdd.setBounds(109, 166, 89, 23);
		
		contentPane.add(btnAdd);
		btnUpdate.setBounds(208, 166, 89, 23);
		
		contentPane.add(btnUpdate);
	}

	protected void do_btnAdd_actionPerformed(ActionEvent arg0) {
		AddData blah = new AddData(sharingField1.getText(), sharingField2.getText(), sharingField3.getText());
		blah.setVisible(true);
	}
}
