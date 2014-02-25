import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

//Be Able to explain progress bar and toggle button
public class Groups extends JFrame {

	private JPanel contentPane;
	private final JRadioButton rdbtnOne = new JRadioButton("One");
	private final JRadioButton rdbtnTwo = new JRadioButton("Two");
	private final JRadioButton rdbtnThree = new JRadioButton("Three");
	private final JRadioButton rdbtnFour = new JRadioButton("Four");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JCheckBox chckbxFirst = new JCheckBox("First");
	private final JCheckBox chckbxSecond = new JCheckBox("Second");
	private final JCheckBox chckbxThird = new JCheckBox("Third");
	private final JLabel lblRadioChoice = new JLabel("Radio Choice:");
	private final JLabel lblCheckboxChoices = new JLabel("Checkbox Choice(s):");
	private final JSlider slider = new JSlider();
	private final JLabel lblSliderValue = new JLabel("0");
	private final JSpinner spinner = new JSpinner();
	private final JLabel lblSpinnerValue = new JLabel("Spinner Value: 0");
	private final JTextField goToSlider = new JTextField();
	private final JButton btnGo = new JButton("Go!");
	private final JToggleButton tglbtnHmm = new JToggleButton("Hmm");
	private final JProgressBar progressBar = new JProgressBar();
	private final JLabel lblTest = new JLabel("test");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Groups frame = new Groups();
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
	public Groups() {
		goToSlider.setBounds(46, 138, 86, 20);
		goToSlider.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Aaron Kippins");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.add(rdbtnOne);
		rdbtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnOne_actionPerformed(e);
			}
		});
		rdbtnOne.setBounds(36, 32, 109, 23);
		
		contentPane.add(rdbtnOne);
		buttonGroup.add(rdbtnTwo);
		rdbtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnTwo_actionPerformed(e);
			}
		});
		rdbtnTwo.setBounds(36, 58, 109, 23);
		
		contentPane.add(rdbtnTwo);
		buttonGroup.add(rdbtnThree);
		rdbtnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnThree_actionPerformed(e);
			}
		});
		rdbtnThree.setBounds(36, 84, 109, 23);
		
		contentPane.add(rdbtnThree);
		buttonGroup.add(rdbtnFour);
		rdbtnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnFour_actionPerformed(e);
			}
		});
		rdbtnFour.setBounds(36, 108, 109, 23);
		
		contentPane.add(rdbtnFour);
		chckbxFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbxFirst_actionPerformed(e);
			}
		});
		chckbxFirst.setBounds(181, 32, 97, 23);
		
		contentPane.add(chckbxFirst);
		chckbxSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbxSecond_actionPerformed(e);
			}
		});
		chckbxSecond.setBounds(181, 58, 97, 23);
		
		contentPane.add(chckbxSecond);
		chckbxThird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbxThird_actionPerformed(e);
			}
		});
		chckbxThird.setBounds(181, 84, 97, 23);
		
		contentPane.add(chckbxThird);
		lblRadioChoice.setBounds(36, 11, 135, 14);
		
		contentPane.add(lblRadioChoice);
		lblCheckboxChoices.setBounds(181, 11, 243, 14);
		
		contentPane.add(lblCheckboxChoices);
		slider.setValue(0);
		slider.setMaximum(150);
		slider.setMinimum(-150);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				do_slider_stateChanged(arg0);
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(15);
		slider.setMajorTickSpacing(30);
		slider.setBounds(10, 169, 228, 53);
		
		contentPane.add(slider);
		lblSliderValue.setBounds(248, 181, 46, 14);
		
		contentPane.add(lblSliderValue);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_spinner_stateChanged(e);
			}
		});
		spinner.setBounds(263, 150, 46, 20);
		
		contentPane.add(spinner);
		lblSpinnerValue.setBounds(319, 153, 105, 14);
		
		contentPane.add(lblSpinnerValue);
		
		contentPane.add(goToSlider);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnGo_actionPerformed(arg0);
			}
		});
		btnGo.setBounds(142, 137, 89, 23);
		
		contentPane.add(btnGo);
		tglbtnHmm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_tglbtnHmm_actionPerformed(arg0);
			}
		});
		tglbtnHmm.setBounds(286, 36, 121, 23);
		
		contentPane.add(tglbtnHmm);
		progressBar.setMinimum(slider.getMinimum());
		progressBar.setMaximum(slider.getMaximum());
		progressBar.setStringPainted(true);
		progressBar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				do_progressBar_stateChanged(arg0);
			}
		});
		progressBar.setValue(slider.getValue());
		progressBar.setBounds(36, 233, 371, 14);
		
		contentPane.add(progressBar);
		lblTest.setBounds(297, 208, 46, 14);
		
		contentPane.add(lblTest);
	}
	
	protected void do_chckbxFirst_actionPerformed(ActionEvent e) {
		checkbox_update();
	}
	protected void do_chckbxSecond_actionPerformed(ActionEvent e) {
		checkbox_update();
	}
	protected void do_chckbxThird_actionPerformed(ActionEvent e) {
		checkbox_update();
	}
	protected void do_rdbtnOne_actionPerformed(ActionEvent e) {
		lblRadioChoice.setText("Radio Choice: One");
		slider.setValue(slider.getMinimum() + (radio_range()/4));
	}
	protected void do_rdbtnTwo_actionPerformed(ActionEvent e) {
		lblRadioChoice.setText("Radio Choice: Two");
		slider.setValue(slider.getMinimum() + (radio_range()/2));
	}
	protected void do_rdbtnThree_actionPerformed(ActionEvent e) {
		lblRadioChoice.setText("Radio Choice: Three");
		slider.setValue(slider.getMinimum() + (radio_range()/4 * 3));
	}
	protected void do_rdbtnFour_actionPerformed(ActionEvent e) {
		lblRadioChoice.setText("Radio Choice: Four");
		slider.setValue(slider.getMinimum() + radio_range());
	}
	
	private void checkbox_update() {
		String output= "";
		if (chckbxFirst.isSelected()){
			output = "First ";
		}
		if (chckbxSecond.isSelected()){
			output += "Second ";
		}
		if (chckbxThird.isSelected()){
			output += "Third ";
		}
		lblCheckboxChoices.setText("Checkbox Choice(s): " + output);
	}
	protected void do_slider_stateChanged(ChangeEvent arg0) {
		lblSliderValue.setText(Integer.toString(slider.getValue()));
		progressBar.setValue(slider.getValue());
	}
	protected void do_spinner_stateChanged(ChangeEvent e) {
		lblSpinnerValue.setText("Spinner Value: " + spinner.getValue());
	}
	protected void do_btnGo_actionPerformed(ActionEvent arg0) {
		slider.setValue(Integer.parseInt(goToSlider.getText()));
	}
	private int radio_range() {
		int max = slider.getMaximum();
		int min = slider.getMinimum();
		int range = max - min;
		return range;
	}
	protected void do_progressBar_stateChanged(ChangeEvent arg0) {
		lblTest.setText(Integer.toString(progress_value()));
	}
	protected void do_tglbtnHmm_actionPerformed(ActionEvent arg0) {
		if (tglbtnHmm.isSelected()){
			contentPane.setBackground(new Color(0,255,255));
		} else {
			contentPane.setBackground(new Color(240,240,240));
		}
	}
	private int progress_value() {
		int numerator = slider.getValue() - slider.getMinimum();
		int percent = numerator / radio_range() * 100;
		return percent;
	}
}

