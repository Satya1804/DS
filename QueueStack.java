import java.util.Scanner;
class  TwoStk
{
	int top1,top2;
	int s1[],s2[];
	TwoStk()
	{
		top1=top2=-1;
		s1=new int[20];
		s2=new int[20];
	}
	void push1(int e)
	{
		s1[++top1]=e;
	}
	int pop1()
	{
		return s1[top1--];
	}
	void push2(int e)
	{
		s2[++top2]=e;
	}
	int pop2()
	{
		return s2[top2--];
	}
	void enQueue(int e)
	{
		push1(e);
	}
	void deQueue()
	{
		if (top1==-1 && top2==-1)
			System.out.println("Queue underflow");
		else if(top2==-1)
		{
			while(top1!=-1)
				push2(pop1());
			System.out.println("the element to be deleted is "+pop2());
		}
		else
			System.out.println("the element to be deleted is "+pop2());
	}
}
class QueueStack
{
	public static void main(String[] args) 
	{
		TwoStk x=new TwoStk();
		Scanner s=new Scanner(System.in);
		int ch;
		while(true)
		{
		System.out.println("enter your choice ");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:x.enQueue(s.nextInt());
			break;
			case 2:x.deQueue();
			break;
			default:return;
			}
		}
	}
}
