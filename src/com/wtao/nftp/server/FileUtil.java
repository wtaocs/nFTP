package com.wtao.nftp.server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件
 * 
 * @author wtao
 *
 */
public class FileUtil {

	/**
	 * 复制文件
	 * 
	 * @param in
	 *            输入流
	 * @param file
	 *            目标文件
	 * @throws IOException
	 */
	public static void cp(InputStream in, File file) throws IOException {
		FileOutputStream out = new FileOutputStream(file);

		byte[] buf = new byte[1024 * 16];
		int size;
		while (-1 != (size = in.read(buf))) {
			out.write(buf, 0, size);
		}
		out.close();
	}

}
