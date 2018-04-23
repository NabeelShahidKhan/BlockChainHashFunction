
public class Queue <T>{
	private T A[];
	private int count;
	private int size;
	
	Queue(int s)
	{
		A = (T[])new Object[s];
		count =0;
		size = s;
	}
	
	void enQueue(T val)
	{
		A[count] = val;
		count++;
	}
	T deQueue()
	{
		T z = A[0];
		for(int i=0;i<count-1;i++)
		{
			A[i]=A[i+1];
		}
		A[count-1] = null;
		count--;
		return z;
	}
	
	
	
	
	
	
	public String toString(){
	String s = "[";
	for(int i=0;i<count-1;i++)
	{
		s=s+A[i]+",";
	}
	s = s+A[count-1]+"]";
	return s;
	}
}
