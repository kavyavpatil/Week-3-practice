import java.util.Scanner;
class Program1
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of students that you to add");
      int n=s.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<=n;i++)
        {
          System.out.println("enter the studentid");
          int t=s.nextInt();
          if(t==5)
          {
            System.out.println(t);
          }
          System.out.println("enter the student name");
          String str=s.nextLine();
          {
            System.out.println(str);
          }
          System.out.println("enter the student  roll");
          int p=s.nextInt();
          if(p>=0)
          {
            System.out.println(p);
          }
          System.out.println("enter the student adress");
          String o=s.next();
          {
            System.out.println(p);
          }
          System.out.println("enter the student  marks");
          int l=s.nextInt();
          {
            System.out.println(l);
          }
          System.out.println("enter the student  mobile number");
          double r=s.nextDouble();
          if(r==10)
          {
            System.out.println(r);
          }
          
          
    }
    }
  }
  
  