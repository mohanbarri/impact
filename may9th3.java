import java.util.*;

public class may9th3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements in the array");

    int n=sc.nextInt();

    int arr[]=new int[n];
    for(int i=0;i<n;i++){   
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
      System.err.print(arr[i]+" "); 
    }

System.out.println("sum:"+sum);
} 
}
