//Chatting Application :
import java.net.*;
import java.io.*;
class Client{
	public static void main(String args[])throws Exception{
		Socket s=new Socket("127.0.0.1",4000);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str2.equals("bye")){
			str1=br.readLine();
			out.writeUTF(str1);
			out.flush();
			str2=in.readUTF();
			System.out.println("Server Says : "+str2);
			
		}
		out.close();
		s.close();
	}
}