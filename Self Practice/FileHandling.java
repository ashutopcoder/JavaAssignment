//File Handling In Java
// Create A File
/*
import java.io.File;
class FileHandling{
	public static void main(String[] args) throws IOException{
		File file = new File("Student.txt");
		if(file.createNewFile())
			System.out.println("File Created Successfully!");
		else
			System.out.println("File Already Exist!");
	}
}
*/
// Write In A File
/*
import java.io.FileWriter;
class FileHandling{
	public static void main(String[] args) throws Exception{
		FileWriter file = new FileWriter("Student.txt");
		file.write("Mera Loda!");
		file.close();
	}
}
*/
//READ A FILE
/*
import java.io.File;
import java.util.Scanner;
class FileHandling{
	public static void main(String[] args) throws Exception{
		File file = new File("Student.txt");
		Scanner read = new Scanner(file);
		while(read.hasNextLine())
			System.out.print(read.nextLine());
	}
}
*/
// DELETE A FILE
import java.io.File;
class FileHandling{
	public static void main(String[] args) throws Exception{
		File file = new File("Student.txt");
		if(file.delete())
			System.out.println("File Deleted!");
		else
			System.out.println("File Not Found!");
	}
}