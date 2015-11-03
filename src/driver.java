import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;



import java.util.Scanner;

@SuppressWarnings("unused")
public class driver {
	static Stack ops = new Stack();
	static Stack nums= new Stack();
	static treeclass1 tree = new treeclass1();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.print("Enter expression");
		Scanner in = new Scanner(System.in);
		String operation = in.nextLine();
		decompose(operation);
		//System.out.print(treeclass1.gettest());
		
		/*for(int i=0;i<ops.size();i++)
		{
			
			System.out.println(ops.get(i));
			
		}
		
		System.out.print("NUMBERS:");

		for(int i=0;i<nums.size();i++)
		{
			
			System.out.println(nums.get(i));
			
		}*/
		
		
		
		
	}
	
	public static void decompose(String a)
	{
		
		int leftp=0;
		int numops=0;
		for(int i=0;i<a.length();i++)
		{
			
			
			if(a.charAt(i)=='(')
				
			{
				leftp++;
				ops.push(a.charAt(i));

				
				
			}
			
			//solve ASAP the moment one P is infront of an a left parantheses
			
			
if(a.charAt(i)== '+' ||a.charAt(i)== '-'||a.charAt(i)== '/'||a.charAt(i)== '*' ||a.charAt(i)== '<'||a.charAt(i)== '>')	
				
{
	ops.push(a.charAt(i));
	numops++;
	if(leftp==1)//OR IF  IF OPS.PEEK='('
	{
		char childnode = (char) ops.pop();
		System.out.println("popping"+" "+ childnode);
		tree.insert(childnode);
		
	}

				
}
else if (!(a.charAt(i)==')'))
	nums.push(a.charAt(i));
			
			if(a.charAt(i)==')' && i==a.length() -1 )
			{
				
				return;
				
			}
			if(a.charAt(i)==')')
			{
				/*
				 * while((!((char)ops.peek()=='(')
				 * {
				 * 
				 * }
				 *ops.pop();
				 */
				
				char childnode = (char) ops.pop();
				System.out.println("Popping"+ " "+ childnode);

				ops.pop();
				leftp--;
				char num1= (char) nums.pop();
				System.out.println("Popping"+ " "+ num1);
				
				char num2= (char) nums.pop();
				System.out.println("Popping"+ " "+ num2);

				if(tree.isLeftside()==false)
				{
				 tree.insert(num1);
				 System.out.println("INSERTED");
				 tree.insert(childnode);
				 System.out.println("INSERTED");
				 tree.insert(num2);
				 System.out.println("INSERTED");
				if((!((char)ops.peek()=='(')) && (!nums.isEmpty()))
				{
				
				char fathernode = (char) ops.pop();
				tree.insert(fathernode);
				char num3= (char) nums.pop();
				tree.insert(num3);
				if(!ops.isEmpty())
				{
				
				//treenode tree= new treenode(childnode,fathernode,num1,num2,num3,false);
				}
				}
				
				else
				{
					 tree.insert(childnode);
					 System.out.println("INSERTED");
					 tree.insert(num1);
					 System.out.println("INSERTED");
					 tree.insert(num2);
					 System.out.println("INSERTED");
					if((!((char)ops.peek()=='(')) && (!nums.isEmpty()))
					{
					
					char fathernode = (char) ops.pop();
					tree.insert(fathernode);
					char num3= (char) nums.pop();
					tree.insert(num3);
					
					
					
				}
				
				
				
			}
			
			
			
			
			
				
			
			
		}
		
		
		
		
	}

}}}
