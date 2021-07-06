import java.util.*;
class Main 
{
   public static void main(String args[])
   {
      int temp,k,i,j;
      int arr[]={1,2,3,4,5};
      k=arr.length;
      for(i=0;i<k;i++)
      {
         for(j=i+1;j<k;j++)
         {
           if(arr[i]>arr[j])
           {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
         }
      }
      System.out.println("second largest number is"+arr[k-2]);
   }
}
  
output:
second largest number is4
