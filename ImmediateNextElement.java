
import java.util.*;
import java.lang.*;
import java.io.*;

class ImmediateNextElement {
    
	public static void main(String[] args) throws Exception {
	    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(scanner.readLine());

		for (int tItr = 0; tItr < t; tItr++) {
			int n =  Integer.parseInt(scanner.readLine());
			int[] q = new int[n];
			String[] qItems = scanner.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;

			}
			StringBuffer result = new StringBuffer();
		    for(int k = 0;k<q.length;k++){
			if(q.length-1 > k){
				if(q[k]>q[k+1]){
					result.append(q[k+1]+" ");
				}else{
					result.append("-1"+" ");
				}
			}

		}
		result.append("-1"+" ");
		System.out.println(result);
		}
	}
}
