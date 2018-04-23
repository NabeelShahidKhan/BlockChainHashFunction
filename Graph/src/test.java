import java.util.Vector;

public class test {

	
	public static void main(String arg[])
	{

		Graph g1 = new Graph(10);
		g1.add(0, 1, 2);
		g1.add(1, 0, 2);
		g1.add(1, 2, 2);
		g1.add(0, 0, 2);
		g1.add(0, 1, 2);
		g1.add(5, 6, 2);
		g1.add(6, 5, 2);
		g1.add(4, 5, 2);
		g1.add(7,8, 4);

		//g1.add(2, 6, 2);
		//g1.add(6, 7, 2);
		
		
		
		/*		Graph g1 = new Graph(10);
		g1.add(0, 1, 2);
		g1.add(1, 0, 2);
		g1.add(0, 0, 2);
		
	*/
/*		Graph g1 = new Graph(6);
		g1.add(0, 1, 2);
		g1.add(1, 0, 2);
		g1.add(1, 2, 2);
		g1.add(2, 3, 2);
		g1.add(2, 5, 2);
		g1.add(0, 1, 2);
	*/	


		g1.matrixPrint();
		g1.isConnected();

		System.out.println(g1);

	}
	
	
}
