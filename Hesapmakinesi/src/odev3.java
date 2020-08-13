import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class odev3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JLabel snc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev3 window = new odev3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public odev3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int sayý1,sayý2,sonuc;
					sayý1 =Integer.parseInt(textField_1.getText());
					sayý2 =Integer.parseInt(textField.getText());
					sonuc = sayý1+sayý2;
					String s = snc.getText();
					snc.setText(Integer.toString(sonuc));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Sayý giriniz!");
				}
				
				
			}
		});
		btnNewButton.setBounds(118, 144, 59, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int sayý1,sayý2,sonuc;
					sayý1 =Integer.parseInt(textField_1.getText());
					sayý2 =Integer.parseInt(textField.getText());
					sonuc = sayý1-sayý2;
					String s = snc.getText();
					snc.setText(Integer.toString(sonuc));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Sayý giriniz!");
				}
				
			}
		});
		button.setBounds(187, 144, 59, 23);
		frame.getContentPane().add(button);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int sayý1,sayý2,sonuc;
					sayý1 =Integer.parseInt(textField_1.getText());
					sayý2 =Integer.parseInt(textField.getText());
					sonuc = sayý1*sayý2;
					String s = snc.getText();
					snc.setText(Integer.toString(sonuc));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Sayý giriniz!");
				}
			}
		});
		btnX.setBounds(256, 144, 59, 23);
		frame.getContentPane().add(btnX);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int sayý1,sayý2,sonuc;
					sayý1 =Integer.parseInt(textField_1.getText());
					sayý2 =Integer.parseInt(textField.getText());
					sonuc = sayý1/sayý2;
					String s = snc.getText();
					snc.setText(Integer.toString(sonuc));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Sayý giriniz!");
				}
			}
		});
		button_2.setBounds(325, 144, 59, 23);
		frame.getContentPane().add(button_2);
		
		textField = new JTextField();
		textField.setBounds(118, 93, 266, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 59, 266, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("1.say\u0131");
		lblNewLabel.setBounds(51, 62, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblsay = new JLabel("2.say\u0131");
		lblsay.setBounds(51, 96, 48, 14);
		frame.getContentPane().add(lblsay);
		
		JLabel lblNewLabel_1 = new JLabel("Hesap Makinesi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(118, 11, 223, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		snc = new JLabel("");
		snc.setHorizontalAlignment(SwingConstants.CENTER);
		snc.setBounds(335, 183, 59, 23);
		frame.getContentPane().add(snc);
	}
}
