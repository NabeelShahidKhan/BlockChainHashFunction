
public class Node {
	
	
	private int Val;
	private boolean visited;
	

	int GetVal()
	{
		return Val;
		
	}
	void SetVal(int Val)
	{
	this.Val = Val;
	}
	
	public boolean isVisited(){
		return this.visited;
	}
	
	public void visit(boolean v) {
		this.visited = v;
	}
	
	
}
