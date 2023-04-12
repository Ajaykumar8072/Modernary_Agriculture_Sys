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

public class Fungi extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fungi frame = new Fungi();
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
	public Fungi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fungicides");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(435, 26, 165, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs. 610");
		lblNewLabel_2_4.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(464, 193, 176, 48);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs. 110");
		lblNewLabel_2_5.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(464, 252, 176, 44);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs. 380");
		lblNewLabel_2_6.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(464, 307, 176, 48);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs. 840");
		lblNewLabel_2_7.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(464, 366, 176, 48);
		contentPane.add(lblNewLabel_2_7);
		
		JCheckBox chkbox_01 = new JCheckBox("Sodasu (Cymoaxile 8% + Mancozeb 64%)");
		chkbox_01.setBounds(113, 199, 276, 44);
		contentPane.add(chkbox_01);
		
		JCheckBox chkbox_02 = new JCheckBox("Sosage (Sulphur 80% + WDG)");
		chkbox_02.setBounds(113, 252, 276, 48);
		contentPane.add(chkbox_02);
		
		JCheckBox chkbox_03 = new JCheckBox("Saikin (Tricylazole 75%WP)");
		chkbox_03.setBounds(113, 313, 276, 44);
		contentPane.add(chkbox_03);
		
		JCheckBox chkbox_04 = new JCheckBox("Gozaru (Copper Oxychloride 50% WP)");
		chkbox_04.setBounds(113, 370, 276, 48);
		contentPane.add(chkbox_04);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(603, 494, 96, 56);
		contentPane.add(lblNewLabel);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(756, 494, 199, 56);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
double total = 0;
				
				
				if (chkbox_01.isSelected()) {
					total = total + 610;
				}if (chkbox_02.isSelected()) {
					total = total + 110;
				}if (chkbox_03.isSelected()) {
					total = total + 380;
				}if (chkbox_04.isSelected()) {
					total = total + 840;
				}
				
				txtTotal.setText(Double.toString(total));
			
			}
		});
		btnNewButton.setBounds(429, 494, 124, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Proceed to checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(536, 582, 206, 48);
		contentPane.add(btnNewButton_1);
	}

}
