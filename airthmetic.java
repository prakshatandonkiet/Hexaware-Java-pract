public class Airtmetic1{
  public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      String o = args[2];
      
      switch(o)
      {
          case "+":
              System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
              break;

          case "-":
              System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
              break;

          case "*":
              System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
              break;

          case "/":
              System.out.println("Division of "+a+" and "+b+" : "+(a/b));
              break;

          case "%":
              System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
              break;


          default:
              System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
      }
      }

  }