package headfirst.networkandthreads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			Socket serverSocket = serverSock.accept();
			Socket clientSocket = new Socket("190.165.1.103", 4242);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
