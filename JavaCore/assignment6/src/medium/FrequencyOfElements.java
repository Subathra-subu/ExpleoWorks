/*
 * Program to find the frequency of elements
 */


package medium;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
		int[] my_record = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		
		boolean[] visited = new boolean[my_record.length];
		
		System.out.println("Frequency of elements in my_record:");
		
		for(int i=0;i<my_record.length;i++){
			if(visited[i]==true) continue;
			int count=1;
			for(int j=i+1;j<my_record.length;j++) {
				if(my_record[i]==my_record[j]) { 
					count++;
					visited[j]=true;
				}
			}
			System.out.print(my_record[i]+" "+count+" times");
			System.out.println();
		}

	}

}
