import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.stopwatch(a));
    }
}

class Solution {
    static String stopwatch(int[] a) {
        // write code here
        int n=a.length;
        //String tot_time="";
        if(n%2!=0)return "still running";
        int sum=0;
        for(int i=0; i<n; i+=2)
        {
            sum+=a[i+1]-a[i];
        }
        return Integer.toString(sum);
    }
}