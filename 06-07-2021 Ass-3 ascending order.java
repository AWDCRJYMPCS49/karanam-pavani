import java.util.*;
class Main 
{
    public static void main(String args[]) 
    {
        int n,temp,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.of odd elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter odd elements");
        for(i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++) 
        {
            for(j=i+1;j<n;j++) 
            {
                if(arr[i]>arr[j]) 
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order");
        System.out.print("Odd numbers");
        for(i=0;i<n-1;i++) 
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[n-1]);
    }
}

output:
Enter no. of odd elements
5

Enter odd elements
55 77 21 49 35

Ascending Order
Odd numbers 21,35,49,55,77
