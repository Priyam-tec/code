import java.util.*;
class Calaculator1
{
  public static void main(String[] args) {
    Scanner S =new Scanner (System.in);
    System.out.print("Enter First No");
    int no1=S.nextInt();
    System.out.print("Enter secound No");
    int no2=S.nextInt();
    System.out.print("Symbol(+,-,*,/)"); 
    String sym = S.next();
    int res;
    switch (sym)
    {
      case"+":res = no1+no2;
      System.out.print("Addition is:"+res);
      break;
      case"-":res = no1-no2;
      System.out.print("subtraction is :"+res);
      break;
      case"/":res = no1/no2;
      System.out.print("division is:"+res);
      break;
      case"*":res = no1*no2;
      System.out.print("multiplication is:"+res);
      break;
       default: System.out.print("invalid symbol"); 
    }
 }
}