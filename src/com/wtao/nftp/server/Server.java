package com.wtao.nftp.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

	public static void main(String[] args) {

		try {
//			Properties properties = new Properties();
//			properties.put(key, value)
			
			
			ServerSocket serverSocket = new ServerSocket(23);
			ExecutorService executor = Executors.newCachedThreadPool();

			while (true) {
				Socket socket = serverSocket.accept();
				executor.execute(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				});
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
