import java.io.*;
import java.net.*;
import java.util.*;

public class SocketTest{
	public static void main(String[] args) throws IOException
	{
		Socket s  = new Socket("time-a.nist.gov",13); //创建一个Socket类并将域名和端口号发过去
		
		try{

			InputStream in  = s.getInputStream();
			Scanner input = new Scanner(in,"UTF-8");
			s.setSoTimeout(10000);
			while(input.hasNextLine())
			{
				System.out.println("zzzz");
				String line = input.nextLine();
				System.out.println(line);
			}
		}
		catch(InterruptedIOException exception)
		{
			System.out.println("连接超时");

		}
	}
}