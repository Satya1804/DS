import java.util.*;
class StackN 
{
	int top=-1;
	Scanner s= new Scanner(System.in);
	int stk[];
	int max;
	StackN()
	{
    System.out.println("enter max");
	 max=s.nextInt();
	 stk=new int[max];
	}
	void push(int e)
	{
		if(!isFull())
			stk[++top]=e;
		else
			System.out.println("stackoverflow");
	}
	void pop()
	{
		if(!isEmpty())
			System.out.println("the element which is deleted from the stack is "+stk[top--]);
		else
			System.out.println("stackunderflow");
	}
	int peek()
	{
		if(!isEmpty())
			return stk[top];
		else
			return -1;
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}
	boolean isFull()
	{
		if(top==max-1)
			return true;
		else
			return false;
	}		
	void display()
	{
		for(int i=top;i>=0;i--)
			System.out.println(stk[i]);
	}
}
class StackDemo
{
	public static void main(String[] args) 
	{
		StackN x=new StackN();
		Scanner s= new Scanner(System.in);
		int ch;
		while(true)
		{
		System.out.println("enter your choice");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:x.push(s.nextInt());
						break;
			case 2:x.pop();
						break;
			case 3:System.out.println(x.peek());
						break;
			case 4:x.display();
			break;
			default:return;
			}
		}
	}
}
