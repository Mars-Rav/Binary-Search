
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int first = 0;
		int last = arr.length-1;
		int key;
		
		System.out.println("This is the array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nEnter your key");
		key = input.nextInt();
		int val = binary(arr, first, last, key);
		System.out.println("This is the element: " + val);
		
		System.out.println("\nEnter how many times you want to double that value: ");
		int num = input.nextInt();
		
		int result = 1;
		for(int i = 0; i < num; i++) {
			result *= val;
		}
		
		System.out.println("The result will be: " + result);
		
	}
	
	public static int binary(int arr[], int first, int last, int key) {
		int mid = 0;
		
		while(first <= last) {
			mid = (first + last)/2;
			if(key < arr[mid]) {
				last = mid - 1;
			}else if(key > arr[mid]) {
				first = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
