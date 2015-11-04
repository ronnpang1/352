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
				System.out.println("pushing"+" "+ a.charAt(i));
				leftp++;
				System.out.println(leftp);
				ops.push(a.charAt(i));

				
				
			}
			
			//solve ASAP the moment one P is infront of an a left parantheses
			
			
if(a.charAt(i)== '+' ||a.charAt(i)== '-'||a.charAt(i)== '/'||a.charAt(i)== '*' ||a.charAt(i)== '<'||a.charAt(i)== '>')	
				
{
	ops.push(a.charAt(i));//special case EX: (+(3*2)
	System.out.println("pushing"+" "+ a.charAt(i));

	numops++;
	if(leftp==1)//OR IF  IF OPS.PEEK='('
	{
		char childnode = (char) ops.pop();
		System.out.println("popping"+" "+ childnode);
		tree.insert(childnode,"ops","root");
		if(!nums.isEmpty())
		{
			  char firstnum=(char)nums.pop();
			  tree.insert(firstnum,"num",null);
			
		}
	}

				
}
else if (!(a.charAt(i)==')')&& !(a.charAt(i)=='('))
{
	//PUSH IF A NUMBER;
	
	nums.push(a.charAt(i));
	System.out.println("pushing"+" "+ a.charAt(i));

			//IF ITS THE LAST PARANTHESES
			if(a.charAt(i)==')' && i==a.length() -1 )
			{
				
				return;
				
			}
			
		}
			if(a.charAt(i)==')')
			{

				
				
					  char rootnode =  a.charAt(++i);
					  
					  System.out.println(rootnode);
					  if(rootnode!=')')
						  
					  
							tree.insert(rootnode,"ops","root");
						    
					  
				  
				  char operator=(char) ops.pop();
				  
				  if(ops.isEmpty())
				  {
					  return;
				  }
				  
				  else{
					System.out.println("popping1"+" "+ operator);

				  tree.insert(operator,"ops",null);
				  
				  char firstnum=(char)nums.pop();
					System.out.println("popping1"+" "+ firstnum);

				 

				  tree.insert(firstnum,"num",null);
			}
				  while((char)ops.peek() !='(')
				  {

				 char operatornext= (char) ops.pop();
					System.out.println("popping1"+" "+ operatornext);

				  tree.insert(operatornext,"ops",null);
				  
				  	char numnext= (char) nums.pop();
					System.out.println("popping1"+" "+ numnext);

				  tree.insert(numnext,"num",null);
				  
				  }
				  
				  
				  if(nums.isEmpty())
					   continue;
					   else
					   {
					  
						   char secondum=(char)nums.pop();
							System.out.println("popping1"+" "+ secondum);
						   
						   tree.insert(secondum,"num",null); 
					  
					  
					   
				  System.out.println("EXITING");
				  ops.pop();
				  leftp--;

				
				
				
				
				
				//treenode tree= new treenode(childnode,fathernode,num1,num2,num3,false);
				
				}
				
				
				
				
				
			
			
			}
			
			
			
				
			
			
		}
		
		
		
}
	

}
