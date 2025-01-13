# code

import java.util.Scanner;

class Calaculator {
   Calaculator() {
   }

   public static void main(String[] var0) {
      String var1;
      do {
         Scanner var2 = new Scanner(System.in);
         System.out.print("Enter First no.");
         int var3 = var2.nextInt();
         System.out.print("Enter Second no.");
         int var4 = var2.nextInt();
         System.out.println("Select Symbol(+,-,*,/)");
         int var6;
         switch (var2.next()) {
            case "+":
               var6 = var3 + var4;
               System.out.println("Addition is:" + var6);
               break;
            case "-":
               var6 = var3 - var4;
               System.out.println("Subtraction is:" + var6);
               break;
            case "*":
               var6 = var3 * var4;
               System.out.println("Multiplication is:" + var6);
               break;
            case "/":
               var6 = var3 / var4;
               System.out.print("Division is:" + var6);
               break;
            default:
               System.out.print("Invalid Symbol");
         }

   }
}
