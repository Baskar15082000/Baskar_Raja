//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        		HashMap<Integer,Integer> map=new HashMap<>();
        		map.put(0,-1);
        		int length=0;
        		int sum=0;
        		for(int i=0;i<n;i++){
        		    sum+=arr[i];
        		    if(map.containsKey(sum)){
        		        length=Math.max(length,i-map.get(sum));
        		    }
        		    else{
        		        map.put(sum,i);
        		    }
        		}
        		return length;
    }
}