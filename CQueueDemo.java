import java.util.*;
class CQueue 
{
	int q[];
	int f,r,size;
	CQueue()
	{
		f=r=-1;
		size=5;
		q=new int[size];
	}
	void enQueue(int e)
	{
		if(!isFull())
		{
			r=(r+1)%size;
			q[r]=e;
			if(f==-1)
				f=0;
		}
		else 
			System.out.println("Queue is full");
	}
	void deQueue()
	{
		if(!isEmpty())
		{
			System.out.println("the element that is to be deleted is "+q[f]);
			if(f==r)
				f=r=-1;
			else
				f=(f+1)%size;
		}
		else
			System.out.println("Queue is empty");
	}
	boolean isEmpty()
	{
		if(f==-1)
			return true;
		else 
			return false;
	}
	boolean isFull()
	{
		if((r+1)%size==f)
			return true;
		else
			return false;
	}
	void display()
	{
		if (!isEmpty())
		{
			if(f<=r)
			{
				for (int i=f;i<=r;i++)
					System.out.println(q[i]);
			}
			else
			{
				for(int i=f; i!=r;i=(i+1)%size)
					System.out.println(q[i]);
				System.out.println(q[r]);
			}
		}
		else
			System.out.println("queue is empty");
	}
}
class CQueueDemo
{
	public static void main(String[] args) 
	{
		CQueue x=new CQueue();
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
			case 3:x.display();
			break;
			default:return;
			}
		}
	}
}
