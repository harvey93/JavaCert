package aAProbs;
import java.util.*;

public class NearestLarger {
	public static int nearest(int [] arr, int k){
		int i = k - 1;
		int j = k + 1;
		
		while(i >= -1){
			if(i == -1){break;}
			if(arr[i] > arr[k]){
				break;
			}
			i--;
		}
		
		while(j <= arr.length){
			if(j == arr.length){break;}
			if(arr[j] > arr[k]){
				break;
			}
			j++;
		}
		
		if(i < 0){
			return j;
		}else if(j == arr.length){
			return i;
		}else {
			if(arr[i] >= arr[j]){
				return i;
			}else {
				return j;
			}
		}
		
	}
}
