//Find Duplicate Value In 2 Array In String Array
public class DuplicateValueInTwoStringArray{
	public static void main(String args[]){
		String[] arr1={"mukesh","rakesh","shiva","ashu"};
		String[] arr2={"mukesh","rahul","mohan","ashu"};
		for(int i=0;i<arr1.length;i++)
			for(int j=0;j<arr2.length;j++)
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
	}
} 