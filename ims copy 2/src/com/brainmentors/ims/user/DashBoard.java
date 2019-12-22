package com.brainmentors.ims.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.brainmentors.ims.common.ExcelReader;
import com.brainmentors.ims.user.dao.BulkUpload;
import com.brainmentors.ims.user.dto.StudentDTO;

public class DashBoard extends JFrame {

	private JPanel contentPane;

	private void upload() {
		JFileChooser open = new JFileChooser();
		open.setFileSelectionMode(JFileChooser.FILES_ONLY);
		open.showOpenDialog(this);
		File uploadFile = open.getSelectedFile();
		try {
			ArrayList<StudentDTO> students = ExcelReader.readXLS(uploadFile);
			
			System.out.println("Students are "+students);
			boolean result = BulkUpload.isUpload(students);
			JOptionPane.showMessageDialog(this, result?"Upload It ":"Not Uploaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	private void download() throws IOException {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String excelPath =rb.getString("xlspath");
		JFileChooser fileChooser  = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.showOpenDialog(this);
		File directory = fileChooser.getSelectedFile();
		String path = directory.getAbsolutePath() +"/sample.xls";
		System.out.println("Download File Path is "+path);
		FileInputStream fs = new FileInputStream(excelPath);
		byte bytes [] = fs.readAllBytes();
		FileOutputStream fo = new FileOutputStream(path);
		fo.write(bytes);
		fs.close();
		fo.close();
		JOptionPane.showMessageDialog(this, "File Downloaded.");
		
	}
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
		JMenuItem downloadXLS = new JMenuItem("Download XLS");
		downloadXLS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					download();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		JMenuItem uploadXLS = new JMenuItem("Upload XLS");
		uploadXLS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				upload();
				
			}
		});
		enquiry.add(downloadXLS);
		enquiry.add(uploadXLS);
		bar.add(enquiry);
		
		setContentPane(contentPane);
	}
	public static void main(String[] args) {
		DashBoard d = new DashBoard();
		d.setVisible(true);
	}

}
