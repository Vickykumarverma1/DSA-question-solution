import java.util.Scanner;
public class Main{
      public static void main(String Args[])
      {
            
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            String prev = sc.nextLine();
            int count = 1;
            
            for(int i = 1; i<n; i++)
            {
                  String curr = sc.nextLine();
                  if(!curr.equals(prev))
                  {
                        count++;
                  }
                  
                  prev = curr;
            }
            System.out.print(count);
      }
}