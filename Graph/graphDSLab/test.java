
public class test {

	
	public static void main(String arg[])
	{
		Graph g1 = new Graph(5);
		g1.add(0, 1, 2);
		g1.add(0, 2, 4);
		g1.add(1, 0, 2);
		g1.add(3,4 , 7);
		g1.add(4, 3, 9);
		
		System.out.println(g1);
		
	}
	
	
}
