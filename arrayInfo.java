import java.math.*;
public class arrayInfo {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100);			
		}
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
		int av = 0;
		for(int i : arr){
			av += i;
		}
		av = av / arr.length;
		System.out.println("Average: " + av);
		for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( (arr[i] > arr[j]) && (i != j) ) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                
            }
         }
		}
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Largest: " + arr[arr.length - 1]);
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
        	if(arr[i] > av){
        		count++;
        	}
        }
        System.out.println("Greater than average: " + count);

}
}
