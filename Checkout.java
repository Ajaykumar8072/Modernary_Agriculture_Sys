import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Checkout extends JFrame {

	private JPanel contentPane;
	private JTextField sDoor;
	private JTextField sStreet;
	private JTextField sArea;
	private JTextField sCity;
	private JTextField sPin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout frame = new Checkout();
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
	public Checkout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Checkout\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(313, 4, 108, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Door No. :\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(84, 145, 166, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Street name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(84, 202, 166, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Area name:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(84, 259, 166, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("City:\r\n");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 240));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(84, 316, 166, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PIN code:");
		lblNewLabel_1_4.setForeground(new Color(245, 255, 250));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(84, 373, 166, 46);
		contentPane.add(lblNewLabel_1_4);
		
		sDoor = new JTextField();
		sDoor.setBounds(351, 145, 251, 46);
		contentPane.add(sDoor);
		sDoor.setColumns(10);
		
		sStreet = new JTextField();
		sStreet.setColumns(10);
		sStreet.setBounds(351, 202, 251, 46);
		contentPane.add(sStreet);
		
		sArea = new JTextField();
		sArea.setColumns(10);
		sArea.setBounds(351, 259, 251, 46);
		contentPane.add(sArea);
		
		sCity = new JTextField();
		sCity.setColumns(10);
		sCity.setBounds(351, 316, 251, 46);
		contentPane.add(sCity);
		
		sPin = new JTextField();
		sPin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					e.consume();
				}
			
			
			}
		});
		sPin.setColumns(10);
		sPin.setBounds(351, 373, 251, 46);
		contentPane.add(sPin);
		
		JButton btnNewButton = new JButton("Cash on Delivery");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Thank you for Purchasing");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(85, 456, 222, 55);
		contentPane.add(btnNewButton);
		
		JButton btnCard = new JButton("Card");
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Door=sDoor.getText().toString();
				String Street=sStreet.getText().toString();
				String Area=sArea.getText().toString();
				String City=sCity.getText().toString();
				String Pin=sPin.getText().toString();
				if(Door.equals("")) {
					JOptionPane.showMessageDialog(null,"Door No. is mandatory");
				}
				if(Street.equals("")) {
					JOptionPane.showMessageDialog(null,"Street Name is mandatory");
				}
				if(Area.equals("")) {
					JOptionPane.showMessageDialog(null,"Area Name is mandatory");
				}
				if(City.equals("")) {
					JOptionPane.showMessageDialog(null,"City name is mandatory");
				}
				if(Pin.equals("")) {
					JOptionPane.showMessageDialog(null,"PIN No. is mandatory");
				}
			Debitcard jf3 = new Debitcard();
			jf3.show();
			
			dispose();
			
			
			}
		});
		btnCard.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCard.setBounds(439, 456, 222, 55);
		contentPane.add(btnCard);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumer_full jf5 = new consumer_full();
				jf5.show();
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(615, 26, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Agri new\\barley-field-1684052__480.jpg"));
		lblNewLabel_2.setBounds(10, 22, 714, 528);
		contentPane.add(lblNewLabel_2);
	}
}
