package demo;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 4, 2, 5};
		System.out.println(average(list, 4));
	}
	
	public static double average(int[] arr, int n) {
		return average(arr, n, 0) / n;
	}
	
	public static double average(int[] arr,int n, int result) {
		if(n == 0) {
			return result;
		}
		result += array[length - 1];
		return average(arr, n - 1 , result + arr[n-1]);
	}

}
