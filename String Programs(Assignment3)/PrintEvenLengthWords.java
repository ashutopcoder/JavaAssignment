//String Basic Program
public class PrintEvenLengthWords{
	public static void main(String args[]){
		String str="Ramu is a good boy";
		String[] sr = str.split(" ");
		for(int i=0;i<sr.length;i++)
			if(sr[i].length()%2==0)
				System.out.print(sr[i]+" ");
	}
}