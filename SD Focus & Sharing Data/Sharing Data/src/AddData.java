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


public class AddData extends JFrame {

	private JPanel contentPane;
	private final JLabel lblFirst = new JLabel("First");
	private final JLabel lblSecond = new JLabel("Second");
	private final JLabel lblThird = new JLabel("Third");
	private final JTextField addFieldFirst = new JTextField();
	private final JTextField addFieldSecond = new JTextField();
	private final JTextField addFieldThird = new JTextField();
	private final JButton btnDone = new JButton("Done");

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddData frame = new AddData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public AddData(String value1, String value2, String value3) {
		addFieldThird.setText(value3);
		addFieldThird.setBounds(167, 105, 86, 20);
		addFieldThird.setColumns(10);
		addFieldSecond.setText(value2);
		addFieldSecond.setBounds(167, 80, 86, 20);
		addFieldSecond.setColumns(10);
		addFieldFirst.setText(value1);
		addFieldFirst.setBounds(167, 56, 86, 20);
		addFieldFirst.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Add Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblFirst.setBounds(101, 59, 46, 14);
		
		contentPane.add(lblFirst);
		lblSecond.setBounds(101, 83, 46, 14);
		
		contentPane.add(lblSecond);
		lblThird.setBounds(101, 108, 46, 14);
		
		contentPane.add(lblThird);
		
		contentPane.add(addFieldFirst);
		
		contentPane.add(addFieldSecond);
		
		contentPane.add(addFieldThird);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDone_actionPerformed(e);
			}
		});
		btnDone.setBounds(141, 153, 89, 23);
		
		contentPane.add(btnDone);
	}

	protected void do_btnDone_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
