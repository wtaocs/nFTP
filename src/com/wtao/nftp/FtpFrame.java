package com.wtao.nftp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class FtpFrame extends JFrame {

	private JPanel contentPane;
	JLabel labelFilename;

	File file;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		FtpFrame frame = new FtpFrame();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public FtpFrame() {

		// 屏幕居中
		setSize(480, 320);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		labelFilename = new JLabel("New label");
		contentPane.add(labelFilename, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("选择上传的文件");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 执行这里：选择文件
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showDialog(FtpFrame.this, "确定");

				// 文件的过滤器
				// fileChooser.setFileFilter(new FileNameExtensionFilter("",
				// "java"));

				// 目录、文件
				// fileChooser.setFileSelectionMode(mode);

				//
				file = fileChooser.getSelectedFile();
				labelFilename.setText(file.getName());
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);

		btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);

	}

}
