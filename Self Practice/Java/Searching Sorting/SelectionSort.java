//Selection Sort
/* Practice 1
class SelectionSort{
	public static void main(String[] args){
		int[] arr = {2,7,34,7,9,5,1,5,8,3};
		System.out.print("Your Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			for(int j=i;j<arr.length;j++){
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.print("\nSorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
*/
/* Practice 2
class SelectionSort{
	public static void main(String args[]){
		int[] arr={2,3,21,4,46,78,12,2,45};
		System.out.println("Entered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[index];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/

class SelectionSort{
	public static void main(String args[]){
		int[] arr={2,3,21,23,46,7,642,1,9,7};
		System.out.println("\nEntered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[index]=temp;
		}
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}