import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SellerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Prod;
	private JTextField Price;
	private JTextField Amt;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellerFrame frame = new SellerFrame();
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
	public SellerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(186, 63, 190, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrice = new JLabel("Price\r\n");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPrice.setBounds(186, 117, 190, 41);
		contentPane.add(lblPrice);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setForeground(new Color(255, 250, 250));
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAmount.setBounds(186, 169, 190, 37);
		contentPane.add(lblAmount);
		
		Prod = new JTextField();
		Prod.setBounds(397, 63, 190, 36);
		contentPane.add(Prod);
		Prod.setColumns(10);
		
		Price = new JTextField();
		Price.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					e.consume();
				}
			}
	});
		Price.setColumns(10);
		Price.setBounds(397, 117, 190, 41);
		contentPane.add(Price);
		
		Amt = new JTextField();
		Amt.setColumns(10);
		Amt.setBounds(397, 169, 190, 37);
		contentPane.add(Amt);
		model=new DefaultTableModel();
		Object[] column = {"Product","Price","Amount"};
		Object[] row = new Object[3];
		model.setColumnIdentifiers(column);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 240, 729, 274);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				row[0]=Prod.getText();
				row[1]=Price.getText();
				row[2]=Amt.getText();
				model.addRow(row);
			}
		});
		btnNewButton_2.setBounds(665, 169, 128, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Sell it");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null,"Your product is up for sale");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(449, 566, 206, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose jf2 = new Choose();
				jf2.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(871, 49, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(832, 169, 128, 37);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Sell anything you want!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(358, 11, 412, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Agri new\\photo-1586771107445-d3ca888129ff.jpg"));
		lblNewLabel_2.setBounds(21, 0, 1024, 661);
		contentPane.add(lblNewLabel_2);
	}
}
