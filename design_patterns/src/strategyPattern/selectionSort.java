package strategyPattern;

public class selectionSort implements sortingStrategy {

	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<arr.length; i++) {
			
		 
			int tmp_min_index = i; 
			for(int j = i+1; j<arr.length;j++) {
				
				if(arr[j]<arr[tmp_min_index]) {
					tmp_min_index =j;  
				}
			}
			
			int swap_tmp = arr[i];
			arr[i]=arr[tmp_min_index];
			arr[tmp_min_index]=swap_tmp;
		}
		return arr;
	}

}
