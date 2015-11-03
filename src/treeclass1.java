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
		
		
		
public  void insert(char a)
{
	if(counter%2==0&&counter!=0)
	{
		
		//node= new node(a,null,head,null,null);
		//counter++;
		//System.out.println("inserting:"+" "+ a);	
		//head.parent=node;
		//head = node;
		//leftside=true;
		System.out.println("inserting:"+" "+ a);	

		node=new node(a,head.prev,null,null);
		head.prev.parent=node;                                                                                                                                                            
		counter++;
		head=node;
		leftside=true;
	}
	
	else
	{
		
	System.out.println("inserting:"+" "+ a);	
	node=new node(a,null,head,null);
	//if(head==null)
	//{
	//System.out.println("inserting:"+" "+ a);
	//node= new node(a,null,null,null,null);
	//head= node;
	//}
	//	public node(char a, node link, node left, node right, node parent)
	
	
	
	/*
	 * 
	 * if(head.right=null)
	 * node=new node(a,null,null,null,head)
	 * head.right=node;
	 *
	 * 
	 * 
	 * if(head.left=null)
	 * node=new node(a,null,null,null,head)
	 * head.left=node;

	 * 
	 * 
	 * if(head.right!=null && head.left!=null)
	 * {
	 * 
	 * 
	 * node = new node(a,null,head,null,null)
	 * head.parent = node;
	 * head= node;
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	if(!(head==null))
	{
		
		head.link=node;
		System.out.println("CHAR"+ " "+head.attr);
	}
	
	
	head=node;
	counter++;
	}
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



