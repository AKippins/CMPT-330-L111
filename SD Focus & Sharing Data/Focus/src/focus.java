import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;


public class focus extends JFrame {

	private JPanel contentPane;
	private final JTextField posField = new JTextField();
	private final JTextField negField = new JTextField();
	private final JLabel lblEnterAPositive = new JLabel("Enter a positive number:");
	private final JLabel lblEnterANegative = new JLabel("Enter a negative number:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					focus frame = new focus();
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
	public focus() {
		negField.setToolTipText("Enter a negative number");
		negField.setHorizontalAlignment(SwingConstants.RIGHT);
		negField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_negField_focusLost(e);
			}
		});
		negField.setBounds(227, 85, 86, 20);
		negField.setColumns(10);
		posField.setToolTipText("Enter a positive number");
		posField.setHorizontalAlignment(SwingConstants.RIGHT);
		posField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_posField_focusLost(e);
			}
		});
		posField.setBounds(227, 54, 86, 20);
		posField.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Focus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(posField);
		
		contentPane.add(negField);
		lblEnterAPositive.setBounds(68, 57, 149, 14);
		
		contentPane.add(lblEnterAPositive);
		lblEnterANegative.setBounds(68, 88, 149, 14);
		
		contentPane.add(lblEnterANegative);
	}
	protected void do_posField_focusLost(FocusEvent e) {
		int x = Integer.parseInt(posField.getText().trim());
		if (!posField.getText().isEmpty()){
			if (x <= 0) {
				JOptionPane.showMessageDialog(this,
					    "Please enter a positive integer.",
					    "Inane error",
					    JOptionPane.ERROR_MESSAGE);
				posField.grabFocus();
			}
		}
	}
	protected void do_negField_focusLost(FocusEvent e) {
		int x = Integer.parseInt(negField.getText().trim());
		if (!posField.getText().isEmpty()){
			if (x >= 0) {
				JOptionPane.showMessageDialog(this,
					    "Please enter a negative integer.",
					    "Inane error",
					    JOptionPane.ERROR_MESSAGE);
				negField.grabFocus();
			}
		}
	}
}
