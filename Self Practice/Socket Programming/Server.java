//Chatting Application:-
import java.net.*;
import java.io.*;
class Server{
	public static void main(String []args)throws Exception{
		ServerSocket ss=new ServerSocket(4000);
		Socket s=ss.accept();
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("bye")){
			str1=in.readUTF();
			System.out.println("Client Says : "+str1);
			str2=br.readLine();
			out.writeUTF(str2);
			out.flush();
		}
		in.close();
		s.close();
		ss.close();
	}
}