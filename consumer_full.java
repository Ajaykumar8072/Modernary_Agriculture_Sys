import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class consumer_full extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consumer_full frame = new consumer_full();
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
	public consumer_full() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insecicides");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(55, 98, 127, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblFungicides = new JLabel("Fungicides");
		lblFungicides.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFungicides.setBounds(55, 300, 127, 45);
		contentPane.add(lblFungicides);
		
		JLabel lblMicronutrients = new JLabel("Micronutrients");
		lblMicronutrients.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMicronutrients.setBounds(55, 495, 157, 45);
		contentPane.add(lblMicronutrients);
		
		JCheckBox chkbox_01 = new JCheckBox("Suruga (Pymetrozine 50%WG)");
		chkbox_01.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_01.setBounds(169, 150, 246, 23);
		contentPane.add(chkbox_01);
		
		JCheckBox chkbox_02 = new JCheckBox("Konatsu (Spinetoram 11.2%SC)");
		chkbox_02.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_02.setBounds(169, 187, 246, 23);
		contentPane.add(chkbox_02);
		
		JCheckBox chkbox_03 = new JCheckBox("Egao");
		chkbox_03.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_03.setBounds(169, 218, 246, 23);
		contentPane.add(chkbox_03);
		
		JCheckBox chkbox_04 = new JCheckBox("Suruga (Pymetrozine 50%WG)");
		chkbox_04.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_04.setBounds(169, 256, 246, 23);
		contentPane.add(chkbox_04);
		
		JCheckBox chkbox_08 = new JCheckBox("Gozaru (Copper Oxychloride 50% WP)");
		chkbox_08.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_08.setBounds(169, 458, 246, 23);
		contentPane.add(chkbox_08);
		
		JCheckBox chkbox_07 = new JCheckBox("Saikin (Tricylazole 75%WP)");
		chkbox_07.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_07.setBounds(169, 420, 246, 23);
		contentPane.add(chkbox_07);
		
		JCheckBox chkbox_06 = new JCheckBox("Sosage (Sulphur 80% + WDG)");
		chkbox_06.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_06.setBounds(169, 389, 246, 23);
		contentPane.add(chkbox_06);
		
		JCheckBox chkbox_05 = new JCheckBox("Sodasu (Cymoaxile 8% + Mancozeb 64%)");
		chkbox_05.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_05.setBounds(169, 352, 246, 23);
		contentPane.add(chkbox_05);
		
		JCheckBox chkbox_09 = new JCheckBox("Multiplex Kranti Micronutrient");
		chkbox_09.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_09.setBounds(169, 547, 246, 23);
		contentPane.add(chkbox_09);
		
		JCheckBox chkbox_10 = new JCheckBox("General Liquid Micronutrient");
		chkbox_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_10.setBounds(169, 584, 246, 23);
		contentPane.add(chkbox_10);
		
		JCheckBox chkbox_11 = new JCheckBox("Multiplex Flower Booster");
		chkbox_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_11.setBounds(169, 615, 246, 23);
		contentPane.add(chkbox_11);
		
		JCheckBox chkbox_12 = new JCheckBox("Multiplex Sulphur Fertilizer");
		chkbox_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_12.setBounds(169, 653, 246, 23);
		contentPane.add(chkbox_12);
		
		JCheckBox chkbox_16 = new JCheckBox("Thermal Fogger Machine");
		chkbox_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_16.setBounds(770, 256, 246, 23);
		contentPane.add(chkbox_16);
		
		JCheckBox chkbox_15 = new JCheckBox("Knapscak Battery Sprayer\r\n");
		chkbox_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_15.setBounds(770, 218, 246, 23);
		contentPane.add(chkbox_15);
		
		JCheckBox chkbox_14 = new JCheckBox("Diesel Inter-cultivator");
		chkbox_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_14.setBounds(770, 187, 246, 23);
		contentPane.add(chkbox_14);
		
		JCheckBox chkbox_13 = new JCheckBox("KisanKraft Petrol Engine water Pump");
		chkbox_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_13.setBounds(770, 150, 246, 23);
		contentPane.add(chkbox_13);
		
		JLabel lblFarmMachinary = new JLabel("Farm Machinary\r\n");
		lblFarmMachinary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFarmMachinary.setBounds(656, 98, 192, 45);
		contentPane.add(lblFarmMachinary);
		
		JCheckBox chkbox_20 = new JCheckBox("Agil systemic Herbicide");
		chkbox_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_20.setBounds(770, 456, 246, 23);
		contentPane.add(chkbox_20);
		
		JCheckBox chkbox_19 = new JCheckBox("Gramoxone herbicide");
		chkbox_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_19.setBounds(770, 420, 246, 23);
		contentPane.add(chkbox_19);
		
		JCheckBox chkbox_18 = new JCheckBox("Sempra");
		chkbox_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_18.setBounds(770, 389, 246, 23);
		contentPane.add(chkbox_18);
		
		JCheckBox chkbox_17 = new JCheckBox("Roundup Herbicide");
		chkbox_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkbox_17.setBounds(770, 352, 246, 23);
		contentPane.add(chkbox_17);
		
		JLabel lblHerbicides = new JLabel("Herbicides");
		lblHerbicides.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHerbicides.setBounds(656, 300, 127, 45);
		contentPane.add(lblHerbicides);
		
		JLabel lblNewLabel_1 = new JLabel("Rs. 660");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(427, 150, 67, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Rs. 1490");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(427, 188, 67, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Rs. 1160");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(427, 218, 67, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Rs. 760");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(427, 256, 67, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Rs. 610");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(427, 355, 67, 20);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rs. 110");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(427, 393, 67, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Rs. 380");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(427, 423, 67, 20);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Rs. 840");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(427, 461, 67, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Rs. 115");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(427, 550, 67, 20);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Rs. 95");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(427, 588, 67, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Rs. 220");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(427, 618, 67, 20);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Rs. 125");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(427, 656, 67, 20);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_6 = new JLabel("Rs. 11,990");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(1022, 150, 67, 20);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Rs. 2490");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(1022, 188, 67, 20);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Rs. 17850");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_3.setBounds(1022, 218, 67, 20);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Rs. 27000");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_3.setBounds(1022, 256, 67, 20);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_7 = new JLabel("Rs. 120");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(1022, 352, 67, 20);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Rs. 220");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_4.setBounds(1022, 390, 67, 20);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Rs. 430");
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_4.setBounds(1022, 420, 67, 20);
		contentPane.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Rs. 1080");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_4.setBounds(1022, 458, 67, 20);
		contentPane.add(lblNewLabel_1_3_4);
		
		JButton btnNewButton = new JButton("Enter");
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
				}if (chkbox_05.isSelected()) {
					total = total + 610;
				}if (chkbox_06.isSelected()) {
					total = total + 110;
				}if (chkbox_07.isSelected()) {
					total = total + 380;
				}if (chkbox_08.isSelected()) {
					total = total + 840;
				}if (chkbox_09.isSelected()) {
					total = total + 115;
				}if (chkbox_10.isSelected()) {
					total = total + 95;
				}if (chkbox_11.isSelected()) {
					total = total + 220;
				}if (chkbox_12.isSelected()) {
					total = total + 125;
				}if (chkbox_13.isSelected()) {
					total = total + 11990;	
				}if (chkbox_14.isSelected()) {
					total = total + 2490;
				}if (chkbox_15.isSelected()) {
					total = total + 17850;
				}if (chkbox_16.isSelected()) {
					total = total + 27000;
				}if (chkbox_17.isSelected()) {
					total = total + 120;	
				}if (chkbox_18.isSelected()) {
					total = total + 220;
				}if (chkbox_19.isSelected()) {
					total = total + 430;
				}if (chkbox_20.isSelected()) {
					total = total + 1080;
					
				}	
				txtTotal.setText(Double.toString(total));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(839, 532, 208, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Price:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(731, 634, 72, 45);
		contentPane.add(lblNewLabel_2);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(839, 631, 208, 45);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Proceed to Checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkout jf2 = new Checkout();
				jf2.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton_1.setBounds(731, 759, 358, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Choose jf5 = new Choose();
				jf5.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(1000, 21, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Agri new\\wp1886331.jpg"));
		lblNewLabel_3.setBounds(-842, 0, 2026, 908);
		contentPane.add(lblNewLabel_3);
	}
}
