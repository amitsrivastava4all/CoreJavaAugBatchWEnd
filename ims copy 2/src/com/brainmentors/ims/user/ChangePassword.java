package com.brainmentors.ims.user;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.brainmentors.ims.common.Encrypt;
import com.brainmentors.ims.user.dao.UserDAO;
import com.brainmentors.ims.user.dto.UserDTO;

public class ChangePassword extends JFrame {
	JLabel msglbl = new JLabel("");
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private String msg;
	private UserDTO userDTO;
	
	public ChangePassword(UserDTO userDTO) {
		this();
		this.userDTO = userDTO;
		msg = "Welcome "+userDTO.getUserid();
		msglbl.setText(msg);
	}


	
	private void changePassword() {
		
		String first = new String(passwordField.getPassword());
		String second = new String(passwordField_1.getPassword());
		System.out.println(first);
		System.out.println(second);
	
		if(!first.equals(second)) {
				JOptionPane.showMessageDialog(this, "Password are Not Same");
				passwordField.requestFocus();
		}
		else {
			 try {
					String tempPassword = Encrypt.generatePassword(first);
					// DB Update
					
					
					 UserDAO userDAO = new UserDAO();
					 int updateCount = userDAO.changePassword(tempPassword, userDTO.getUserid());
					 if(updateCount>0) {
						 JOptionPane.showMessageDialog(this, "Password Change SuccessFully");
					 }
			 } catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch(SQLException | ClassNotFoundException e) {
				 System.out.println("SOme DB Level Problem");
				 e.printStackTrace();
				 JOptionPane.showMessageDialog(this, "SOME DB Level Problem");
			 }
			
		}
	}
		
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public ChangePassword() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setBounds(88, 60, 225, 25);
		contentPane.add(lblChangePassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewPassword.setBounds(16, 109, 127, 16);
		contentPane.add(lblNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 105, 175, 26);
		contentPane.add(passwordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblConfirmPassword.setBounds(6, 165, 164, 16);
		contentPane.add(lblConfirmPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(156, 161, 175, 26);
		contentPane.add(passwordField_1);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			changePassword();
			}
		});
		btnChange.setBounds(88, 210, 117, 29);
		contentPane.add(btnChange);
		
		
		msglbl.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		msglbl.setBounds(16, 6, 314, 42);
		contentPane.add(msglbl);
	}
}
