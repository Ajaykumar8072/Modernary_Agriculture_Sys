import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose frame = new Choose();
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
	public Choose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 134, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Consumer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumer_full jf2 = new consumer_full();
				jf2.show();
				
				dispose();
			}
		});
		btnNewButton.setBounds(393, 182, 251, 74);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(btnNewButton);
		
		JButton btnSeller = new JButton("Seller");
		btnSeller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SellerFrame jf2 = new SellerFrame();
				jf2.show();
			}
		});
		btnSeller.setBounds(393, 296, 251, 74);
		btnSeller.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(btnSeller);
		
		JButton btnNewButton_1 = new JButton("Feedback");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(642, 464, 122, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				this.toBack();
				Loginpage newframe = new Loginpage();
				newframe.setVisible(true);
				
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_2.setBounds(659, 42, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("\"Agriculure is our wisest pursuit;\r\n");
		lblNewLabel_1.setForeground(new Color(245, 255, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(0, 350, 307, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("because it will in the end contribute most");
		lblNewLabel_1_1.setForeground(new Color(245, 255, 250));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(0, 407, 350, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("to real wealth, good morals, and happiness\"");
		lblNewLabel_1_2.setForeground(new Color(245, 255, 250));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(0, 464, 350, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("             -Thomas Jefferson");
		lblNewLabel_1_3.setForeground(new Color(245, 255, 250));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_3.setBounds(121, 504, 229, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Java Project\\Images\\photo-1592079927431-3f8ced0dacc6.jpg"));
		lblNewLabel.setBounds(0, 0, 350, 561);
		contentPane.add(lblNewLabel);
	}
}
