/*//Q5:- Create An ArrayList of 10 String Objects and Reverse All the Strings by using Stack.
import java.util.ArrayList;
import java.util.Stack;
class Demo{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> s2=new ArrayList<>();
		Stack<Character> st=new Stack<>();
			al.add("Raju");
			al.add("Ramu");
			al.add("Mohan");
			al.add("Sohan");
			al.add("Mukesh");
			al.add("Shiva");
			al.add("Rakesh");
			for(String str:al){
				for(int i=0;i<str.length();i++){
						st.push(str.charAt(i));
				}
				String str2="";
				for(int j=0;j<str.length();j++){
					str2=str2+st.pop();
				}
				s2.add(str2);
			}
			System.out.println("Entered Value : "+al);
			System.out.println("After Reversing Value : "+s2);
	}
}
*/

/*

// Q4:- Create An ArrayList of Custom Objects.
import java.util.ArrayList;

class student{
	public String name;
	public int rollno;
	public int mob;
	student(String name,int rollno,int mob){
		this.name=name;
		this.rollno=rollno;
		this.mob=mob;
	}
}
class Demo{
	public static void main(String args[]){
	ArrayList<student> al=new ArrayList<>();
		student s1=new student("Mohan",101,9876543);
		student s2=new student("Sohail",102,8876543);
		al.add(s1);
		al.add(s2);
		for(student st:al){
			System.out.println("Student Name : "+student.name);
			System.out.println("Student Rollno : "+student.rollno);
			System.out.println("Student MobileNo : "+student.mob);
		}
	}
}
*/


//Q3:- Create A Vector of 10 Integer Objects and Find Maximum and minimum value from them.
import java.util.Vector;
import java.util.Collections;
class Demo{
	public static void main(String args[]){
		Vector<Integer> vc=new Vector();
		vc.add(10);
		vc.add(1);
		vc.add(5);
		vc.add(510);
		vc.add(1340);
		vc.add(108);
		int max=Collections.max(vc);
		int min=Collections.min(vc);
		System.out.println("Values : "+vc);
		System.out.println("Maximum Value : "+max);
		System.out.println("Minimum Value : "+min);
		
	}
}