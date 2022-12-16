import java.io.*;
import java.util.*;
 
class Main{
 
    static int countDistinct(int arr[], int n)
    {
        int res = 1;
 
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
 
            if (i == j)
                res++;
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        int arr[] = {3,4,4,3,5,6,1,1,2,3,8,9,33};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }
}