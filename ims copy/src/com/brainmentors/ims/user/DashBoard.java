package com.brainmentors.ims.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DashBoard extends JFrame {

	private JPanel contentPane;

	
	public DashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		JMenu enquiry = new JMenu("Enquiry");
		JMenuItem newEnquiry = new JMenuItem("New Enquiry");
		newEnquiry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewEnquiry obj = new NewEnquiry();
				obj.setVisible(true);
				
			}
		});
		enquiry.add(newEnquiry);
		bar.add(enquiry);
		setContentPane(contentPane);
	}
	public static void main(String[] args) {
		DashBoard d = new DashBoard();
		d.setVisible(true);
	}

}
