import java.util.Scanner;
class greatestofNum{
public static void main(String args[])
{
	Scanner sha=new Scanner(System.in);
	System.out.print("enter first value:");
	int firstNum=sha.nextInt();
	System.out.print("enter second value:");
	int secondNum=sha.nextInt();
	if(firstNum>secondNum)
	{
	System.out.println(firstNum+" is greatest");
	}

	else{
	System.out.println(secondNum+" is greatest");
}
}
}
