package com.brainmentors.ims.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.brainmentors.ims.common.MailSender;
import com.brainmentors.ims.common.OTPGenerator;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEnquiry extends JFrame {

	private JPanel contentPane;
	NewEnquiry that;
	private JTextField textField;

	private void sendMail() {
		try {
			int otp = OTPGenerator.generateOTP();
			System.out.println("OTP is "+otp);
			boolean result =MailSender.sendMail(otp, textField.getText());
			System.out.println("After mail send "+result);
			if(result) {
				JOptionPane.showMessageDialog(this, "mail send it");
			}
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the frame.
	 */
	public NewEnquiry() {
		that = this;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			 public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(that,"Do u want to leave this window","brain mentors",JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION) {
					that.setVisible(false);
					 that.dispose();
				}
				 
			 }
		});
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(75, 69, 222, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOtp = new JButton("OTP");
		btnOtp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sendMail();
			}
		});
		btnOtp.setBounds(50, 107, 117, 29);
		contentPane.add(btnOtp);
	}
}
