package MyFirstPackage;
import java.util.Scanner;

public class calnums{
	
public static int add(int n1,int n2){
	return n1+n2;
}
public static int sub(int n1,int n2){
	return n1-n2;
}
public static int multiply(int n1,int n2){
	return n1*n2;
}
public static int divide(int n1,int n2){
	return n1/n2;
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first Number:");
	int input = sc.nextInt();
	System.out.println("Enter the Second:");
	int input1= sc.nextInt();
	System.out.println("Addition is:"+calnums.add(input,input1));
	System.out.println("Substraction is:"+calnums.sub(input,input1));
	System.out.println("multiplication is:"+calnums.multiply(input,input1));
	System.out.println("Division is:"+calnums.divide(input,input1));
}
}
