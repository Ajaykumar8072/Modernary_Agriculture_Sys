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

public class Farmmachinary extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Farmmachinary frame = new Farmmachinary();
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
	public Farmmachinary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Farm Machinary");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(402, 26, 255, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs. 11,990");
		lblNewLabel_2_4.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(424, 146, 176, 48);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs. 2,960");
		lblNewLabel_2_5.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(421, 205, 176, 48);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs. 17,850");
		lblNewLabel_2_6.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(424, 264, 176, 48);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs. 27,000");
		lblNewLabel_2_7.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(424, 323, 176, 48);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("Rs. 1,35,500");
		lblNewLabel_2_7_1.setForeground(new Color(245, 255, 250));
		lblNewLabel_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7_1.setBounds(424, 382, 176, 48);
		contentPane.add(lblNewLabel_2_7_1);
		
		JCheckBox chkbox_01 = new JCheckBox("KisanKraft Petrol Engine water Pump");
		chkbox_01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkbox_01.setBounds(53, 148, 293, 48);
		contentPane.add(chkbox_01);
		
		JCheckBox chkbox_02 = new JCheckBox("Diesel Inter-cultivator");
		chkbox_02.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkbox_02.setBounds(53, 207, 293, 48);
		contentPane.add(chkbox_02);
		
		JCheckBox chkbox_03 = new JCheckBox("Knapscak Battery Sprayer\r\n");
		chkbox_03.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkbox_03.setBounds(53, 266, 293, 48);
		contentPane.add(chkbox_03);
		
		JCheckBox chkbox_04 = new JCheckBox("Thermal Fogger Machine");
		chkbox_04.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkbox_04.setBounds(53, 325, 293, 48);
		contentPane.add(chkbox_04);
		
		JCheckBox chkbox_05 = new JCheckBox("Weeder with Reaper");
		chkbox_05.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkbox_05.setBounds(53, 384, 293, 48);
		contentPane.add(chkbox_05);
		
		JLabel lblNewLabel = new JLabel("Total:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(637, 524, 65, 48);
		contentPane.add(lblNewLabel);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(734, 524, 162, 48);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
double total = 0;
				
				
				if (chkbox_01.isSelected()) {
					total = total + 11990;
				}if (chkbox_02.isSelected()) {
					total = total + 2960;
				}if (chkbox_03.isSelected()) {
					total = total + 17850;
				}if (chkbox_04.isSelected()) {
					total = total + 27000;
				}if (chkbox_05.isSelected()) {
					total = total + 135500;
				}
				
				txtTotal.setText(Double.toString(total));
			
			
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(424, 524, 151, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Proceed to checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(568, 597, 211, 53);
		contentPane.add(btnNewButton_1);
	}
}
