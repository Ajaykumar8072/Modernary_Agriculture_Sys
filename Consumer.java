import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consumer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consumer frame = new Consumer();
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
	public Consumer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consumer Table");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(403, 59, 262, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Herbicides");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Products jf2 = new Products();
				jf2.show();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(205, 215, 188, 112);
		contentPane.add(btnNewButton);
		
		JButton btnFungicides = new JButton("Fungicides");
		btnFungicides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fungi jf3 = new Fungi();
				jf3.show();
				
				dispose();
			}
		});
		btnFungicides.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnFungicides.setBounds(463, 268, 188, 112);
		contentPane.add(btnFungicides);
		
		JButton btnInsecicides = new JButton("Insecicides");
		btnInsecicides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insecicides jf4 = new Insecicides();
				jf4.show();
				
				dispose();
			}
		});
		btnInsecicides.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnInsecicides.setBounds(717, 358, 188, 112);
		contentPane.add(btnInsecicides);
		
		JButton btnMicronutrients = new JButton("Micronutrients");
		btnMicronutrients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Micronutrients jf5 = new Micronutrients();
				jf5.show();
				
				dispose();
			}
		});
		btnMicronutrients.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMicronutrients.setBounds(463, 439, 188, 112);
		contentPane.add(btnMicronutrients);
		
		JButton btnMachinary = new JButton("Machinary");
		btnMachinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farmmachinary jf6 = new Farmmachinary();
				jf6.show();
				
				dispose();
			}
		});
		btnMachinary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMachinary.setBounds(205, 498, 188, 112);
		contentPane.add(btnMachinary);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 1053, 159);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Java Project\\Images\\cn-305-banner-1140x640.jpg"));
		lblNewLabel_1.setBounds(0, 126, 1053, 706);
		contentPane.add(lblNewLabel_1);
	}
}
