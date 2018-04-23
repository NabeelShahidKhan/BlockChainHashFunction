import java.util.*;

public class Graph {
		
	private Node cell[][];
	private int _size;
	private int count = 0;
	
	Graph(int size){
		this._size = size;
		cell = new Node[size][size];
		
		for(int i=0;i<this._size;i++){
			for(int j=0;j<this._size;j++){
				cell[i][j] = new Node();
			}
		}
	}
	
	void add(int from,int to,int Val)
	{
		cell[from][to].SetVal(Val);
	}

	public String toString(){
		String s="";
		
		for(int i=0;i<cell.length;i++){
			for(int j=0;j<cell.length;j++){
			
				if(cell[i][j].GetVal() != 0){
					s+=  "From Node " + i + " To Node " + j + " Path Complexity is "+cell[i][j].GetVal()+" "+cell[i][j].isVisited()+"\n";
				}
			}
		}
			return s;
		
	}
	
	public void isConnected(){
		
		Queue<Integer> I = new Queue<Integer>(100);	
		Queue<Integer> J = new Queue<Integer>(100);	
		
		for(int i=0;i<this._size;i++){
		
			for(int j=0;j<this._size;j++){
				
				if(i!=j){			
					if(cell[i][j].GetVal() > 0){
						cell[i][j].visit(true);
						if(i==0){
							count++;
						I.enQueue(i);
						J.enQueue(j);		
						}
						if(i!=0){
						int c;
						int r;
							try{
							c = I.deQueue();
							r = J.deQueue();
							}
							catch(Exception e){
								System.out.println("..");
							}finally{
								c=0;r=0;
							}
						if((i != c || i>c)){
							if(j==r || j>r){

								count++;
								I.enQueue(i);
								J.enQueue(j);		
									
							}
						}
						}
					}
						
				}
			}
		}
		if(count>=this._size-1)
		System.out.println("Connected");
		else
		System.out.println("Disconected");

	}
	
	public void matrixPrint(){
		System.out.print("     ");
		for(int x=0;x<this._size;x++)
			System.out.print(" "+x+" ");
		
		System.out.println();
		for(int i=0;i<this._size;i++){
			System.out.print(" "+i+" - ");
			for(int j=0;j<this._size;j++){
				
			//	if(i!=j){
					System.out.print(" "+cell[i][j].GetVal()+" ");
					
				//}
			}
			System.out.println();
		}
	}
}
