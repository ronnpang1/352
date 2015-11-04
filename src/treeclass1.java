	public class treeclass1 {
		
		private node head=null;
		private node position;
		private node node;
		private boolean leftside=false;
		public static int counter=-1;

		
		
public class node {
	

	
	public char attr;
	public node parent;
	public node left;
	public node right;
	public node link;
	public node prev;
	
	
	public node()
	{}
	public node (char a)
	{
		
		link=null;
		parent=null;
		
	}
	public node(char a, node link, node prev, node parent)
	{
		
		attr=a;
		this.parent=parent;
		this.prev=prev;
		this.link=link;
		
	}
	
	
	public node(char a, node link, node left, node right, node parent)
	{
		
	this.attr=a;
	this.left=left;
	this.right=right;
	this.parent=parent;
		
	}
	
	
	
	public node(char a, char b, char c, boolean empty) {
		
		
	}


}
		
		
		
public  void insert(char a, String type, String string)
{

	/*	System.out.println("inserting op:"+" "+ a);

		node= new node(a,null,head,null,null);
		counter++;
		head.parent=node;
		head = node;
		leftside=true;
		System.out.println("inserting:"+" "+ a);	
		return;
*/
	
	
	
	
		

	if(head==null && string.equals("root"))
	{
	System.out.println("inserting headnode:"+" "+ a);
	node= new node(a,null,null,null,null);
	head= node;
	counter++;
	return;
	}
		//public node(char a, node link, node left, node right, node parent)
	
	
	
	
	 
	  if(head.right==null)
	  {

	  node=new node(a,null,null,null,head);
	  head.right=node;
	  counter++;
	  
	  if(type.equals("ops"))
	  {
			System.out.println("inserting op right:"+" "+ a);
			 head.right=node;
			 head=node;
		  
	  }
	  
	  else
	  {
		  System.out.println("inserting right:"+" "+ a);
	  }
	  
	  return;

	  }
	  
	  if(head.left==null)
	  {

	  node=new node(a,null,null,null,head);
	  head.left=node;
	  counter++;
	  
	  
	  if(type.equals("ops"))
	  {
			System.out.println("inserting op left:"+" "+ a);
			 head.right=node;
			 head=node;
		  
	  }
	  
	  else
	  {
		  System.out.println("inserting left:"+" "+ a);
	  }
		

		return;

	  }
	  
	  
	  if((head.right!=null && head.left !=null))
	  {
		  
		  while(head.right!=null && head.left !=null)
		  {
			  
			  
			  head=head.parent;
			  
			  
		  }
		  System.out.println(head.attr+"ROOT");
			System.out.println("inserting:"+" "+ a);
			System.out.println("inserting op right:"+" "+ a);
			
	  node = new node(a,null,null,null,head);
	 head.right=node;
	  head= node;
	  counter++;
		return;

	  }
	  
	  
	  
	 
	/*if(!(head==null))
	{
		
		head.link=node;
		System.out.println("CHAR"+ " "+head.attr);
	}*/
	
	
	head=node;
	counter++;
	
	
}
	


		public boolean isLeftside() {
	return leftside;
}



public void setLeftside(boolean leftside) {
	this.leftside = leftside;
}



		public node getElement()
		{
			return head;
		
		}
		
		
		public char root(node  p)
		{
			
			
			
			return head.attr;
		
		}
		
		public char root()
		{
			return head.attr;
		
		}
		
		
	
		public node parent()
		{
			return head;
		
		}
		public node children(node p)
		{
			return head;
		
		}
		
		public node numchildren(node p)
		{
			return head;
		
		}
		public node left(node p)
		{
			return head;
		
		}
		
		public node right(node p)
		{
			return head;
		
		}
		
		public node siblings(node p)
		{
			return head;
		
		}
		
		public node isExternal(node p)
		{
			return head;
		
		}
		
		public node isInternal(node p)
		{
			return head;
		
		}
		
		
		
		public node size()
		{
			return head;
		
		}
		
		public node isEmpty()
		{
			return head;
		
		}
		
		public node height()
		{
			return head;
		
		}
		
		public node numleaf()
		{
			return head;
		
		}
		

		public node clone()
		{
			return head;
		
		}
		

		public node postions()
		{
			return head;
		
		}

		public node itertator()
		{
			return head;
		
		}




	}



