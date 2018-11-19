
import java.util.Scanner;
import java.lang.Math;

public class Calculator
{
	double z;
    public double Add(double a,double b)
    {	
    z = a+b;
    System.out.println("Sum of numbers = " + z);
    return z;
    }
    
    public double Sub(double a,double b)
    {
        z = a-b;
    System.out.println("Difference b/w numbers = " + z);
    return z;
    }

    public double Mul(double a,double b)
    {
        z = a*b;
    System.out.println("Multiple of numbers = " + z);
    return z;
    }
    public double Div(double a,double b)
    {
        z = a/b;
    System.out.println("Division of numbers= " + z);
    return z;
    }
    public double sqr(double a)
    {
        z = a*a;
    System.out.println("Square of numbers" + z);
    return z;
    }
    public double cube(double a)
    {
        z = a*a*a;
    System.out.println("Cube of numbers = " + z);
    return z;
    }
    public double sqrt(double a)
    {
        z = Math.sqrt(a);
    System.out.println("Square root of numbers = " + z);
    return z;
    }
    public double cubert(double a)
    {
        z = Math.pow(a,0.33);
    System.out.println("Cube root of numbers = " + z);
    return z;
    }
    public double Sin(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.sin(a);
    System.out.println("Sine of numbers = " + z);
    return z;
    }
    public double Cos(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.cos(a);
    System.out.println("Cosine of numbers = " + z);
    return z;
    }
    public double Tan(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.tan(a);
    System.out.println("Tangent of numbers = " + z);
    return z;
    }
    public double SinInverse(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.asin(a);
    System.out.println("Sine Inverse of numbers = " + z);
    return z;
    }
    public double CosInverse(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.acos(a);
    System.out.println("Cosine Inverse of numbers = " + z);
    return z;
    }
    public double TanInverse(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.atan(a);
    System.out.println("Tan inverse of numbers = " + z);
    return z;
    }
    public double Logarithm(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.log(a);
    System.out.println("Logarithm of numbers = " + z);
    return z;
    }
    public double Exponent(double a)
    {
        a = Math.toRadians(a);
        z = Math.toRadians(z);
        z = Math.getExponent(a);
    System.out.println("Exponent of numbers = " + z);
    return z;
    }
public static void main(String Args[])
{
    double a,b,z,d = 0;
    int i;
    char ans;
    ans='n';
    
    Scanner scan = new Scanner(System.in);
    Calculator c = new Calculator();
    
    while(ans=='n')
    {
      System.out.println("Enter an operation you want to execute");
      System.out.println("Press 1 to add\n 2 for subtract \n 3 for multiply \n 4 to divide \n 5 to square \n 6 to cube \n 7 to square root \n 8 to cube root \n 9 to sin \n 10 to cosine \n 11 to tan \n 12 to sin inverse \n 13 to cos inverse \n 14 to tan inverse \n 15 to log \n 16 to exponent");
       i = scan.nextInt(); 
      switch(i)
        {
            case 1:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
                 System.out.print("Enter second number:");
                 b = scan.nextDouble();
            	 d=c.Add(a,b);
                 break;

            case 2:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
                 System.out.print("Enter second number:");
                 b = scan.nextDouble();
            	 d=c.Sub(a,b);
                 break;

            case 3 :
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
                 System.out.print("Enter second number:");
                 b = scan.nextDouble();
            	 d=c.Mul(a,b);
                 break;

            case 4:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
                 System.out.print("Enter second number:");
                 b = scan.nextDouble();
            	 d=c.Div(a,b);
                 break;
                
            case 5:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.sqr(a);
                 break;
                 
            case 6:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.cube(a);
                 break;
                 
            case 7:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.sqrt(a);
                 break;
            
            case 8:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.cubert(a);
                 break;
            
            case 9:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.Sin(a);
                 break;
            
            case 10:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.Cos(a);
                 break;
            
            case 11:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.Tan(a);
                 break;
            
            case 12:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.SinInverse(a);
                 break;
            
            case 13:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.CosInverse(a);
                 break;
            
            case 14:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.TanInverse(a);
                 break;
            
            case 15:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.Logarithm(a);
                 break;
            
            case 16:
                 System.out.print("Enter first number:");
                 a = scan.nextDouble();
            	 d=c.Exponent(a);
                 break;    

            default:
                System.out.printf("You have entered wrong operator");
                break;
        }
      System.out.print("Do you want to continue with: (s/n/e)");
      ans = scan.next().charAt(0);
      if(ans=='s')
      {  
    	  a=d;
    	  System.out.println("Press 1 to add\n 2 for subtract \n 3 for multiply \n 4 to divide \n 5 to square \n 6 to cube \n 7 to square root \n 8 to cube root \n 9 to sin \n 10 to cosine \n 11 to tan \n 12 to sin inverse \n 13 to cos inverse \n 14 to tan inverse \n 15 to log \n 16 to exponent");
          i = scan.nextInt(); 
         switch(i)
           {
               case 1:
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	    d=c.Add(a,b);
                    break;

               case 2:
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	    d=c.Sub(a,b);
                    break;

               case 3 :
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	    d=c.Mul(a,b);
                    break;

               case 4:
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	    d=c.Div(a,b);
                    break;
                   
               case 5:
               	    d=c.sqr(a);
                    break;
                    
               case 6:
               	    d=c.cube(a);
                    break;
                    
               case 7:
               	    d=c.sqrt(a);
                    break;
               
               case 8:
                    d=c.cubert(a);
                    break;
               
               case 9:
                 	d=c.Sin(a);
                    break;
               
               case 10:
               	    d=c.Cos(a);
                    break;
               
               case 11:
                    d=c.Tan(a);
                    break;
               
               case 12:
               	    d=c.SinInverse(a);
                    break;
               
               case 13:
               	    d=c.CosInverse(a);
                    break;
               
               case 14:
               	    d=c.TanInverse(a);
                    break;
               
               case 15:
               	    d=c.Logarithm(a);
                    break;
               
               case 16:
               	    d=c.Exponent(a);
                    break;    

               default:
                   System.out.printf("You have entered wrong operator");
                   break;
           }
      }
      else if(ans=='n')
      {
    	  d=0;
    	  System.out.println("Press 1 to add\n 2 for subtract \n 3 for multiply \n 4 to divide \n 5 to square \n 6 to cube \n 7 to square root \n 8 to cube root \n 9 to sin \n 10 to cosine \n 11 to tan \n 12 to sin inverse \n 13 to cos inverse \n 14 to tan inverse \n 15 to log \n 16 to exponent");
          i = scan.nextInt(); 
         switch(i)
           {
               case 1:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	 d=c.Add(a,b);
                    break;

               case 2:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	 d=c.Sub(a,b);
                    break;

               case 3 :
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	 d=c.Mul(a,b);
                    break;

               case 4:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
                    System.out.print("Enter second number:");
                    b = scan.nextDouble();
               	 d=c.Div(a,b);
                    break;
                   
               case 5:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.sqr(a);
                    break;
                    
               case 6:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.cube(a);
                    break;
                    
               case 7:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.sqrt(a);
                    break;
               
               case 8:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.cubert(a);
                    break;
               
               case 9:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.Sin(a);
                    break;
               
               case 10:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.Cos(a);
                    break;
               
               case 11:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.Tan(a);
                    break;
               
               case 12:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.SinInverse(a);
                    break;
               
               case 13:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.CosInverse(a);
                    break;
               
               case 14:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.TanInverse(a);
                    break;
               
               case 15:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.Logarithm(a);
                    break;
               
               case 16:
                    System.out.print("Enter first number:");
                    a = scan.nextDouble();
               	 d=c.Exponent(a);
                    break;    

               default:
                   System.out.printf("You have entered wrong operator");
                   break;
           }
         
      }
      System.out.print("Do you want to continue with: (s/n/e)");
      ans = scan.next().charAt(0);
    }
    scan.close();
}
}