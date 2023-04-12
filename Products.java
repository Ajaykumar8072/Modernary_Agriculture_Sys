import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Products extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products frame = new Products();
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
	public Products() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Herbicides");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(435, 26, 165, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs. 120");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(507, 223, 176, 48);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs. 225");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(507, 293, 176, 48);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs. 430");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(507, 352, 176, 48);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs. 1080");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(507, 411, 176, 48);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(605, 550, 127, 34);
		contentPane.add(lblNewLabel_3);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(766, 550, 157, 34);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JCheckBox chkbox_Roundup = new JCheckBox("Roundup Herbicide");
		chkbox_Roundup.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chkbox_Roundup.setBounds(134, 231, 260, 40);
		contentPane.add(chkbox_Roundup);
		
		JCheckBox chkbox_Sempra = new JCheckBox("Sempra Herbicide");
		chkbox_Sempra.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chkbox_Sempra.setBounds(134, 293, 260, 40);
		contentPane.add(chkbox_Sempra);
		
		JCheckBox chkbox_Gram = new JCheckBox("Gramoxone Herbicide");
		chkbox_Gram.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chkbox_Gram.setBounds(134, 352, 260, 40);
		contentPane.add(chkbox_Gram);
		
		JCheckBox chkbox_Agil = new JCheckBox("Agil Systemic Herbicide");
		chkbox_Agil.setFont(new Font("Tahoma", Font.PLAIN, 22));
		chkbox_Agil.setBounds(134, 411, 260, 40);
		contentPane.add(chkbox_Agil);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total = 0;
				
				
				if (chkbox_Roundup.isSelected()) {
					total = total + 120;
				}if (chkbox_Sempra.isSelected()) {
					total = total + 225;
				}if (chkbox_Gram.isSelected()) {
					total = total + 430;
				}if (chkbox_Agil.isSelected()) {
					total = total + 1080;
				}
				
				txtTotal.setText(Double.toString(total));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(397, 550, 127, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Proceed to Checkout\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setBounds(524, 611, 208, 39);
		contentPane.add(btnNewButton_1);
	}
}
