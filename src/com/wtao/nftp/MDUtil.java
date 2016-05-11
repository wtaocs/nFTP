package com.wtao.nftp;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 生成文件的数字摘要(MD5、SHA1、CRC)
 * 
 * @author wtao
 *
 */
public class MDUtil {

	/**
	 * 
	 * @param file
	 * @return
	 */
	public static String getMD5(File file) {
		try {
			return get(file, "MD5");
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

	/**
	 * 
	 * @param file
	 * @return
	 */
	public static String getSHA(File file) {
		try {
			return get(file, "SHA-1");
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

	/**
	 * 获得文件的 MD5 值
	 * 
	 * @param file
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static String get(File file, String algorithm) throws NoSuchAlgorithmException {

		// TODO file 转换成 byte[]

		MessageDigest md = MessageDigest.getInstance(algorithm);

		byte[] data = "hello".getBytes();
		byte[] result = md.digest(data);

		// 字节数组转化为十六进制数
		BigInteger b = new BigInteger(1, result);

		String m = b.toString(16);
		System.out.println(m.length());
		System.out.println(m);

		return m;
	}

	public static void main(String[] args) {
		MDUtil.getMD5(null);
	}

}
