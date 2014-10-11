package headfirst.networkandthreads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	
	String[] adviceList = {"Take smaller bites",
		"Go for the tight jeans. No they do NOT make you look fat.",
		"One word: innappropriate",
		"Just for today, be honest. Tell your boss what you *really* think",
		"You might want to rethink that haircut."};
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public void go() {
		try {
			ServerSocket serverSock = 
				new ServerSocket(2721);
			while(true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
