	public class treeclass1 {
		
		private static node head=null;
		public static node root=null;

		private static node position;
		private static node node;
		static node nodeclone;
		private node headclone;
		private boolean leftside=false;
		public static int counter=-1;

		
		
public class  node <E> {
	

	
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

	
	public node(char a, node left, node right, node parent)
	{
		
	this.attr=a;
	this.left=left;
	this.right=right;
	this.parent=parent;
		
	}
	
	
	
	public node(char a, char b, char c, boolean empty) 
	{
		
		
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
	
	if(head!=null)
	
		System.out.println("HEAD:"+ " "+ head.attr);

		
	
	
	
		

	if(head==null && string.equals("root"))
	{
	
	System.out.println("inserting headnode:"+" "+ a);
	node= new node(a,null,null,null);
	root=node;
	nodeclone=node;
	head= node;
	counter++;
	return;
	}
		//public node(char a, node link, node left, node right, node parent)
	
	
	
	
	 
	  if(head.right==null)
	  {
	  
	  node=new node(a,null,null,head);
	  head.right=node;
	  
	  if(type.equals("ops"))
	  {
		  System.out.println("PREV NODE: " + " " + head.attr);
			System.out.println("inserting op right:"+" "+ a);
			 head=node;
		  
	  }
	  
	  else
	  {
		  System.out.println("inserting right:"+" "+ a);
		  System.out.println("PREV NODE: " + " " + head.attr);

	  }
	  
	  return;

	  }
	  
	  if(head.left==null)
	  {
		  System.out.println("PREV NODE: " + " " + head.attr);

	  node=new node(a,null,null,head);
	  head.left=node;
	  counter++;
	  
	  
	  if(type.equals("ops"))
	  {
		  
			System.out.println("inserting op left:"+" "+ a);
			  System.out.println("PREV NODE: " + " " + head.attr);

			 head=node;
		  
	  }
	  
	  else
	  {
		  System.out.println("inserting left:"+" "+ a);
		  System.out.println("PREV NODE: " + " " + head.attr);

	  }
		return;
	  }
	  
	  
	  if((head.right!=null && head.left !=null))
	  {
		  System.out.println(head.right.attr);
		  System.out.println(head.left.attr);
		  while(!(head.right==null || head.left ==null))
		  {
			  
			  
			  head=head.parent;
			  
			  
		  }
		  System.out.println("right"+ head.right.attr);
		  if(head.right==null)
		  {
			  System.out.println(head.attr+"ROOT");
			System.out.println("inserting:"+" "+ a);
			System.out.println("inserting op right:"+" "+ a);
			
			
			  node = new node(a,null,null,head);
			 head.right=node;
			  head= node;
			  counter++;
		  }
		  
		  if(head.left==null)
		  {
		  System.out.println(head.attr+"ROOT");
			System.out.println("inserting:"+" "+ a);
			System.out.println("inserting op left:"+" "+ a);
			
			  node = new node(a,null,null,head);
			  head.left=node;
			  head= node;
		  }
	
		return;

	  }
	  
	  

	
	head=node;
	
	
	
	
}
	

public boolean isLeftside() {
	return leftside;
}



public void setLeftside(boolean leftside) {
	this.leftside = leftside;
}


public static void inorder(node p)
{



	  if(p==null)
	  {
		  return;
	  }
	  
	  else
	  {
          
           inorder(p.left);
           System.out.print(p.attr + " ");
           inorder(p.right);
          

       }


				
}

		public static node getElement(int i)
		{
			position=head;
			for(int k = 0;k<i;k++)
			{
			while(position.parent!=null)
				
				{
					position=position.parent;
				}
			
			while(position.left!=null)
			{
				
				position=position.left;
				
			}
			
			if(position.right!=null && position.left!=null)
			{
				head=position.right;
				while(position.left!=null)
				{
					
					head= position.left;
				}
				
			}
			
			else if(position.right!=null && position.left!=null && position.parent.left.attr == position.attr)
	{
		
				head=position.parent;
		
	}
			
			
			else if(position.right!=null && position.left!=null && position.parent.right.attr == position.attr)
			{
				
				head=position.parent.parent;
				
			}
			
			
			
						
						head=position;
				
			
			}
			return head;
		
		}
		
		
		public boolean root(int i)
		{
			head=getElement(i);
			
			if(head.parent==null)
			return true;
			
			else
			return false;
		
		}
		
		public char root()
		{
			return head.attr;
		
		}
		
		
	
		public node parent(int i)
		{
			head=getElement(i);
			
			if(head.parent==null)
				return null;
			
				else 
					return head.parent;
		
		}
		public node children(node p)
		{
			return head;
		
		}
		
		public int numchildren(int i)
		{
			head= getElement(i);
			if(head.left!=null && head.right!=null)
			return 2;
			
			else
				return 0;
		
		}
		public node left(int i)
		{
			head=getElement(i);
			if(head.left!=null)
			{
				head=head.left;
				return head;
			}
			
			else
				return null;
				
		
		}
		
		public node right(int i)
		{
			head=getElement(i);
			if(head.right!=null)
			{
				head=head.right;
				return head;
			}
			
			else
				return null;
				
		
		}
		
		
		public node siblings(node p)
		{
			return head;
		
		}
		
		public boolean isExternal(node p)
		{
			head=p;
		
			if(head.left==null && head.right==null)
				return true;
			else
			return false;
		
		}
		
		
		public static void clone(node old,node copy)
		{

			
			if(old==null)
				return;
			
			
			 if(!(old.left==null))
			{
				 System.out.println("attr1"+old.left.attr);
				 	copy.left.attr=old.left.attr; 
				 	copy.left.parent=copy;
				  clone(old.left, copy.left);

				  
			}
			
			 if(!(old.right==null))
			{
				 System.out.println("attr2"+old.right.attr);

				 copy.right.attr=old.right.attr;
				 copy.right.parent=copy;

				clone(old.right, copy.right);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
			}
				
			
			
		}
		
		public boolean isInternal(node p)
		{
			
			head=p;
			
			if(head.left!=null || head.right!=null)
				return true;
			else
			return false;
		
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



