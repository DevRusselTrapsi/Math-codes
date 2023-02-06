/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
        
        double x1, x2, x3;
        
        //input of the value of x1, x2, x3
        System.out.println("Enter the of x1");
        x1 = val.nextDouble();
        System.out.println("Enter the of x2");
        x2 = val.nextDouble();
        System.out.println("Enter the of x3");
        x3 = val.nextDouble();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        //computation to get the x1 Jacobi in k=1
        
        double eq1 = (-11 + (3*x2) + (4*x3)) / 7;
        double eq2 = (3 + (3*x1) + (2*x3)) / 6;
        double eq3 = (25 + (4*x1) + (2*x2)) / 11;        
        
        
        System.out.println("--------------------------------------Gauss-Jacobi Process-------------------------------------- ");
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("k         |            x1            |           x2          |            x3        | ");
        System.out.println("------------------------------------------------------------------------------------------- ");
        
        System.out.println("|         |  "+eq1+"    |    "+eq2+"     |     "+eq3+"    |");
   
	}
}
