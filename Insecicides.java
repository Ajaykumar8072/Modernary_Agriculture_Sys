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

public class Insecicides extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insecicides frame = new Insecicides();
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
	public Insecicides() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Insecicides");
		lblNewLabel_1.setBounds(435, 26, 240, 92);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs. 660");
		lblNewLabel_2_4.setBounds(469, 202, 176, 48);
		lblNewLabel_2_4.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs. 1490");
		lblNewLabel_2_5.setBounds(469, 261, 176, 48);
		lblNewLabel_2_5.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs. 1160");
		lblNewLabel_2_6.setBounds(469, 320, 176, 48);
		lblNewLabel_2_6.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs. 760");
		lblNewLabel_2_7.setBounds(469, 379, 176, 48);
		lblNewLabel_2_7.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2_7);
		
		JCheckBox chkbox_01 = new JCheckBox("Suruga (Pymetrozine 50%WG)");
		chkbox_01.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chkbox_01.setBounds(107, 202, 285, 48);
		contentPane.add(chkbox_01);
		
		JCheckBox chkbox_02 = new JCheckBox("Konatsu (Spinetoram 11.2%SC)");
		chkbox_02.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chkbox_02.setBounds(107, 261, 285, 48);
		contentPane.add(chkbox_02);
		
		JCheckBox chkbox_03 = new JCheckBox("Isogashi (Imidacioprid 17.8%ST)");
		chkbox_03.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chkbox_03.setBounds(107, 320, 285, 48);
		contentPane.add(chkbox_03);
		
		JCheckBox chkbox_04 = new JCheckBox("Egao");
		chkbox_04.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chkbox_04.setBounds(107, 379, 285, 48);
		contentPane.add(chkbox_04);
		
		JButton btnNewButton = new JButton("Enter\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
double total = 0;
				
				
				if (chkbox_01.isSelected()) {
					total = total + 660;
				}if (chkbox_02.isSelected()) {
					total = total + 1490;
				}if (chkbox_03.isSelected()) {
					total = total + 1160;
				}if (chkbox_04.isSelected()) {
					total = total + 760;
				}
				
				txtTotal.setText(Double.toString(total));
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(423, 515, 155, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(631, 515, 71, 48);
		contentPane.add(lblNewLabel);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(726, 515, 196, 48);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Proceed to Checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(553, 586, 182, 48);
		contentPane.add(btnNewButton_1);
	}
}
