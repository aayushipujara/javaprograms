import java.util.Scanner;
public class u1p9_1
{ 
   public static void main(String args[])
   {
		    Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the gr.no:");
			String gr=scn.nextLine();
			System.out.println("Enter the name:");
			String name=scn.nextLine();
			System.out.println("Enter the marks of sub1 :");
			int sub1=scn.nextInt();
			System.out.println("Enter the marks of sub2 :");
			int sub2=scn.nextInt();
			System.out.println("Enter the marks of sub3 :");
			int sub3=scn.nextInt();
			System.out.println("Enter the marks of sub4 :");
			int sub4=scn.nextInt();
			System.out.println("Enter the marks of sub5 :");
			int sub5=scn.nextInt();
            
			int total=sub1+sub2+sub3+sub4+sub5;
			int per=total/5;
			
			 String grade = "";
             String result = "";
        
        if (per >= 90 && per <= 100)
		{ 
            grade = "O"; 
            result = "PASS"; 
        }
		else if (per >= 80 && per < 90)
		{ 
            grade = "A"; 
            result = "PASS"; 
        } 
		else if (per >= 70 && per < 80)
		{ 
            grade = "B"; 
            result = "PASS"; 
        }
		else if (per >= 60 && per < 70)
		{ 
            grade = "C"; 
            result = "PASS"; 
        } 
		else if (per >= 50 && per < 60)
		{ 
            grade = "D"; 
            result = "PASS"; 
        } 
		else if (per >= 35 && per < 50) 
		{ 
            grade = "E"; 
            result = "PASS"; 
        } 
		else 
		{ 
            grade = "F"; 
            result = "FAIL"; 
        }
		System.out.println(per);
        System.out.println(grade);
        System.out.println(result);	
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf( "\n GR No."+ "\tName"+ "\tSubject1"+ "\tSubject2"+ "\tSubject3"+ "\tSubject4"+ "\tSubject5"+ "\ttotal"+ "\tpercentage"+ "\tgrade"+ "\tresult");
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf( gr + "\t"+ "\t"+name+ "\t"+ "\t"+ sub1+ "\t"+  "\t"+sub2+ "\t"+ "\t"+ sub3+ "\t"+  "\t"+sub4+  "\t"+ "\t"+sub5+ "\t"+  "\t"+total+ "\t" +"\t"+ per+  "\t"+ "\t"+grade+  "\t"+ "\t"+result);
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
    }
		
   
}
