import java.util.Scanner;
class  Program2
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the array length");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    
        int evenCount =0; 
        int oddCount=0;
        int primeCount=0;
        for(int i=0;i<n;i++)
          {
            if(arr[i]%2==0)
            {
              evenCount++;
            }
            else{
              oddCount++;
            }
            if(arr[1]>=1)
            {
              primeCount++;
            }
           
          }
        System.out.println("even num"+evenCount);
        System.out.println("odd num"+oddCount);
        System.out.println("prime num"+primeCount);
        
      }
}
        