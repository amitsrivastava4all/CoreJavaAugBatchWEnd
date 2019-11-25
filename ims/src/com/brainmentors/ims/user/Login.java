package com.brainmentors.ims.user;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.brainmentors.ims.user.dao.UserDAO;
import com.brainmentors.ims.user.dto.UserDTO;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField useridTextField;
	private JPasswordField passwordField;

	private void doLogin() {
		String userid  = useridTextField.getText();
		System.out.println(passwordField.getPassword());
		String password = new String(passwordField.getPassword());
		// Check userid or password in DB, Change password screen
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		System.out.println("Userid "+userid +" Password "+password);
		UserDAO userDAO = new UserDAO();
		try {
			userDTO= userDAO.login(userDTO);
			if(userDTO.isLoginSuccess()) {
				
				JOptionPane.showMessageDialog(this, "Login SuccessFully");
				this.setVisible(false);
				this.dispose();
				ChangePassword cp = new ChangePassword(userDTO);
				cp.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid Userid or Password");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "DB Problem");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "DB Problem");
		}
	}
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblLogin.setBounds(178, 38, 61, 26);
		contentPane.add(lblLogin);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblUserid.setBounds(37, 96, 61, 16);
		contentPane.add(lblUserid);
		
		useridTextField = new JTextField();
		useridTextField.setBounds(109, 92, 201, 26);
		contentPane.add(useridTextField);
		useridTextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPassword.setBounds(26, 152, 91, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 148, 201, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLogin();
			}
		});
		btnLogin.setBounds(21, 204, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(150, 204, 117, 29);
		contentPane.add(btnReset);
	}
}
