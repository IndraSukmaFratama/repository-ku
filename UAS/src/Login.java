import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends  JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtpassword;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new LineBorder(new Color(100, 149, 237), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(180, 159, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(new Color(230, 230, 250));
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 170, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(180, 212, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtpassword = new JPasswordField();
		txtpassword.setBackground(new Color(230, 230, 250));
		txtpassword.setBorder(null);
		txtpassword.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpassword.setText("Password");
		txtpassword.setBounds(10, 11, 170, 20);
		panel_1.add(txtpassword);
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION )==0) {
					Login.this.dispose();
				}
			}
		});
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(570, 11, 20, 20);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ADMIN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(230, 230, 250));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(168, 75, 262, 67);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("keluar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(321, 263, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username= txtUsername.getText().toString();
				String password= txtpassword.getText().toString();
				if(username.equals("admin") && password.equals("admin123"))
				{


				}
				else
				{
					JOptionPane.showMessageDialog(null, "User dan Password anda salah");
				}
			}
		});
		btnNewButton_1.setBounds(190, 263, 89, 23);
		contentPane.add(btnNewButton_1);
		setLocationRelativeTo(null);
	}
}
