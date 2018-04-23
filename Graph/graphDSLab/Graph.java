
public class Graph {

	Node cell[][];
	
	
	Graph(int NumOfNodes)
	{
		cell = new Node[NumOfNodes][NumOfNodes];
		
		for(int i=0;i<cell.length;i++)
		{
			for(int j=0;j<cell.length;j++)
			{
				cell[i][j] = new Node();
			}
		}
	}
	
	
	void add(int from,int to,int Val)
	{
		cell[from][to].SetVal(Val);
	}
	
	
	
	
	public String toString()
	{
		String s="";
		

		for(int i=0;i<cell.length;i++)
		{
			for(int j=0;j<cell.length;j++)
			{
				if(cell[i][j].GetVal()!=0)
				{
					s=s + "From Node " + i + "To Node " + j + " Path Complexity is "+cell[i][j].GetVal()+"\n";
							
				}
			}
		}
		return s;
		
	}
	
	
	
	
	
	
}
