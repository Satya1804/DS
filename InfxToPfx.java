import java.util.*;
class  Stack1
{
	char stk[]=new char[20];
	int top=-1;
	void push(char c)
	{
		stk[++top]=c;
	}
	char pop()
	{
		return stk[top--];
	}
	char peek()
	{
		return stk[top];
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}                                       
}
class InfxToPfx
{
	public static void main(String[] args) 
	{
		Stack1 x=new Stack1();
		Scanner s=new Scanner(System.in);
		String infx;
		String pfx="";
		System.out.println("enter the infix string!");
		infx=s.nextLine();
		for(int i=0;i<infx.length();i++)
		{
			if (Character.isLetter(infx.charAt(i)))
			{
				pfx=pfx+infx.charAt(i);
			}
			else if (infx.charAt(i)=='(')
			{
				x.push('(');
			}
			else if(infx.charAt(i)==')')
			{
				char y;
				while((y=x.pop())!='(')
					pfx=pfx+y;
			}
			else
			{
				if(x.isEmpty() || precedence(x.peek())<precedence(infx.charAt(i)))
					x.push(infx.charAt(i));
				else
				{
					while( !x.isEmpty()&&precedence(x.peek())>=precedence(infx.charAt(i)))
						pfx=pfx+x.pop();
					x.push(infx.charAt(i));
				}
			}
		}
		while(!x.isEmpty())
		{
			pfx=pfx+x.pop();
		}
		System.out.println(pfx);
	}
	static int precedence(char ch)
	{
		switch(ch)
		{
			case '(': return 1;
			case '+':
            case '-': return 2;
			case '*':
			case '/':
			case '%': return 3;
			case '^': return 4;
		}
		return -1;
	}
}
