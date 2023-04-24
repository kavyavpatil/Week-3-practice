import java.util.Scanner;
 class publisher{
  private String title;
  private double price;
  private int copies;
  private double totalscale;
   public publisher(String title,double price,int copies,double totalscale)
   {
     this.title=title;
     this.price=price;
     this.copies=copies;
     this.totalscale=totalscale;
     
   }
   public string getTitle()
   {
     return title;
   }
   public double getPrice()
   {
     return price;
   }
   public int  getCopies()
   {
     return copies;
   }
   public double getTotalScale();
   {
   return price*copies;
}
}
public margin extends publisher{
  private int order;
  private String current;
  public Margin(String title,double price,int copies,int order,String current)
    {
    this.order=order;
    this.current=current;
    }
  public int getOrder()
    {
    return order;
    }
  public int TotalOrder()
    {
    return totalorder;
    }
}
public class Program3
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in)
        System.out.println("enter the title");
        String k=s.next();
        System.out.println(k);
        System.out.println("enter the price");
        double p=s.nextDouble();
        System.out.println(p);
        System.out.println("enter the num of copies");
        int e=s.nextInt();
        System.out.println(e);
        
    }
  }

  