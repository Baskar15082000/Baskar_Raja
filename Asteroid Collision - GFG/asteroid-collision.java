//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
                		Stack<Integer> st=new Stack<>();
		for(int i=0;i<asteroids.length;i++){
			if(asteroids[i]>0){
				st.push(asteroids[i]);
			}
			else {
				while(st.size()>0 &&st.peek()>0 && Math.abs(st.peek())<Math.abs(asteroids[i])){
					st.pop();
				}
				if(st.size()>0 && st.peek()>0 && st.peek()==Math.abs(asteroids[i])){
					st.pop();
				}
				else if(st.size()>0 && st.peek()>0 && st.peek()>Math.abs(asteroids[i]))
                {
					continue;
				}
				else{
					st.push(asteroids[i]);
				}
				
				
			}
			
			}
		int arr[]=new int[st.size()];
		for(int i=arr.length-1;i>=0;i--){
			arr[i]=st.pop();
		}
		return arr;
    }
}
