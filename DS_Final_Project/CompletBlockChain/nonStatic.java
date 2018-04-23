
public class nonStatic {
		public nonStatic(){
			BlockChain blockChain = new BlockChain();
			
			//	Block genisisBlock =  blockChain.getLatestBlock();
			
				Thread t = new Thread(new Runnable(){
					@Override
					public void run() {
						Block newBlock1 = blockChain.generateNextBlock("aaaaaaaa");
						blockChain.addBlock(newBlock1);
						
						Block newBlock2 = blockChain.generateNextBlock("bbbbbbbb");
						blockChain.addBlock(newBlock2);

					}
					
				});
			
				
				t.start();
				try {
					t.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Thread t2 = new Thread(new Runnable(){
					@Override
					public void run() {
						Block newBlock5 = blockChain.generateNextBlock("dddddddd");
						blockChain.addBlock(newBlock5);				
					}
				});
				t2.start();
				try {
					t2.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
//				Thread t3 = new Thread(new Runnable(){
//					@Override
//					public void run() {
//					}
//				});
//				t3.start();
				
				
				Block newBlock5 = blockChain.generateNextBlock("eeeeeee");		
				
				Block newBlock7 = blockChain.generateNextBlock("cccccccc");
				blockChain.addBlock(newBlock7);
				
				blockChain.addBlock(newBlock5);				


				System.out.println(blockChain.toString());
				
//				Block a = new Block(1,genisisBlock.getHash(),System.currentTimeMillis(),"Nabeel Send 1000$ to ALi",);
				
				
			
		}
}
