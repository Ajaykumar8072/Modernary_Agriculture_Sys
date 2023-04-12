import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Micronutrients extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Micronutrients frame = new Micronutrients();
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
	public Micronutrients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(124, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Micronutrients");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(435, 26, 238, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs. 115");
		lblNewLabel_2_4.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(463, 174, 176, 48);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs. 95");
		lblNewLabel_2_5.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(463, 233, 176, 48);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs. 220");
		lblNewLabel_2_6.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(463, 292, 176, 48);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs. 125");
		lblNewLabel_2_7.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(463, 351, 176, 48);
		contentPane.add(lblNewLabel_2_7);
		
		JCheckBox chkbox_01 = new JCheckBox("Multiplex Kranti Micronutrient");
		chkbox_01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbox_01.setBounds(96, 175, 274, 48);
		contentPane.add(chkbox_01);
		
		JCheckBox chkbox_02 = new JCheckBox("General Liquid Micronutrient");
		chkbox_02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbox_02.setBounds(96, 234, 274, 48);
		contentPane.add(chkbox_02);
		
		JCheckBox chkbox_03 = new JCheckBox("Multiplex Flower Booster");
		chkbox_03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbox_03.setBounds(96, 293, 274, 48);
		contentPane.add(chkbox_03);
		
		JCheckBox chkbox_04 = new JCheckBox("Multiplex Sulphur Fertilizer");
		chkbox_04.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkbox_04.setBounds(96, 352, 274, 48);
		contentPane.add(chkbox_04);
		
		JButton btnNewButton = new JButton("Enter\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
double total = 0;
				
				
				if (chkbox_01.isSelected()) {
					total = total + 115;
				}if (chkbox_02.isSelected()) {
					total = total + 95;
				}if (chkbox_03.isSelected()) {
					total = total + 220;
				}if (chkbox_04.isSelected()) {
					total = total + 125;
				}
				
				txtTotal.setText(Double.toString(total));
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(449, 500, 158, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(654, 500, 70, 48);
		contentPane.add(lblNewLabel);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(734, 500, 191, 48);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Proceed to checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(573, 586, 170, 48);
		contentPane.add(btnNewButton_1);
	}

}
