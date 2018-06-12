
import java.util.*;
 import java.lang.*;
class Waveform
{
    void sortWave(int arr[], int n)
    {
          int i,j;
        for(i=0;i<n-1;i++)
     {
for(j=0;j<n-1-i;j++)
    {
   if(arr[j]>arr[j+1])
{
        int t = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = t;
    }}}
   
        for ( i=0; i<n-1; i += 2)
            {

        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
        for(i=0;i<n;i++)
           System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int n = 10;
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        Waveform w1 = new Waveform();
        w1.sortWave(a, n);
} }