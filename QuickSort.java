package quicSort;

import java.util.Arrays;
import java.util.stream.IntStream;

class Sorting {

	public void sortingTheValues(int[] array_List, int start, int end) {
		
		if(start<end) {
			int index = partition(array_List,start,end);
			sortingTheValues(array_List, start, index-1);
			sortingTheValues(array_List, index+1, end);
		}
		
	}

	private int partition(int[] array_List, int start, int end) {
		int pivot = array_List[end];
		int i = start -1;
		
		for(int j=start;j<=end-1;j++) {
			if(array_List[j] < pivot) {
				i++;
				int temp = array_List[i];
				array_List[i] = array_List[j];
				array_List[j] = temp;
			}
		}
		int temp = array_List[i+1];
		array_List[i+1] = array_List[end];
		array_List[end] = temp;
		return (i+1);
	}
}

public class QuickSort {

	public static void main(String[] args) {
		int[] array_List = {2, 4, 6, 8, 9, 7, 5, 3, 1 };
        int length = array_List.length;
        
        System.out.println("Before sorting array elements are :-");
        Arrays.stream(array_List).forEach(arrayData->System.out.print(arrayData+" "));
        
        Sorting sort = new Sorting();
        sort.sortingTheValues(array_List,0,length-1);
        
        System.out.println("\nAfter sorting array elements are :-");
        Arrays.stream(array_List).forEach(arrayData->System.out.print(arrayData+" "));
	}

}
