package com.wtao.nftp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FtpFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel labelFilename;
	private JButton buttonUpload;

	private File file;

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

		labelFilename = new JLabel("文件");
		contentPane.add(labelFilename, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("选择上传的文件");

		contentPane.add(btnNewButton, BorderLayout.NORTH);

		buttonUpload = new JButton("上传");
		contentPane.add(buttonUpload, BorderLayout.SOUTH);

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

				file = fileChooser.getSelectedFile();
				labelFilename.setText(file.getName());
			}
		});

	}

}
