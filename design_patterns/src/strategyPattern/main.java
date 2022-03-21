package strategyPattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,8,9,7,4,3,2,0,10,6};
		
		sortingStrategy st = new insertionSort();
		st.sort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			

	}

}
