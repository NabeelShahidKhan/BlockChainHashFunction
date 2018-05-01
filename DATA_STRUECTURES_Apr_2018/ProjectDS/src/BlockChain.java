
import java.util.ArrayList;
import java.util.List;


public class BlockChain {

	private List<Block> blockChain;

    public BlockChain() {
        this.blockChain = new ArrayList<Block>();
        blockChain.add(this.getFristBlock());
    }

    private String calculateHash(int index, String previousHash, long timestamp, String data) {
        StringBuilder builder = new StringBuilder(index);
        builder.append(previousHash).append(timestamp).append(data);
        return HashFunction.getSHA256(builder.toString());
    }

    public Block getLatestBlock() {
        return blockChain.get(blockChain.size() - 1);
    }

    private Block getFristBlock() {
        return new Block(1, "0", System.currentTimeMillis(), "Genisis Block", "aa212344fc10ea0a2cb885078fa9bc2354e55efc81be8f56b66e4a837157662e");
    }

    public Block generateNextBlock(String blockData) {
        Block previousBlock = this.getLatestBlock();
        int nextIndex = previousBlock.getIndex() + 1;
        long nextTimestamp = System.currentTimeMillis();
        String nextHash = calculateHash(nextIndex, previousBlock.getHash(), nextTimestamp, blockData);
        return new Block(nextIndex, previousBlock.getHash(), nextTimestamp, blockData, nextHash);
    }

    public void addBlock(Block newBlock) {
        if (isValidNewBlock(newBlock, getLatestBlock())) {
            blockChain.add(newBlock);
        }
    }

    private boolean isValidNewBlock(Block newBlock, Block previousBlock) {
        if (previousBlock.getIndex() + 1 != newBlock.getIndex()) {
            System.out.println("invalid index: " + newBlock.getIndex() +"  Data: "+newBlock.getData());
            return false;
        } else if (!previousBlock.getHash().equals(newBlock.getPreviousHash())) {
            System.out.println("invalid previoushash");
            return false;
        } else {
            String hash = calculateHash(newBlock.getIndex(), newBlock.getPreviousHash(), newBlock.getTimestamp(),
                    newBlock.getData());
            if (!hash.equals(newBlock.getHash())) {
                System.out.println("invalid hash: " + hash + " " + newBlock.getHash());
                return false;
            }
        }
        return true;
    }
//
//    public void replaceChain(List<Block> newBlocks) {
//        if (isValidBlocks(newBlocks) && newBlocks.size() > blockChain.size()) {
//            blockChain = newBlocks;
//        } else {
//            System.out.println("Received blockchain invalid");
//        }
//    }

//    private boolean isValidBlocks(List<Block> newBlocks) {
//        Block fristBlock = newBlocks.get(0);
//        if (fristBlock.equals(getFristBlock())) {
//            return false;
//        }
//
//        for (int i = 1; i < newBlocks.size(); i++) {
//            if (isValidNewBlock(newBlocks.get(i), fristBlock)) {
//                fristBlock = newBlocks.get(i);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    public List<Block> getBlockChain() {
        return blockChain;
    }
    
    public String toString(){
    	String s="{\n"+"\""+this.getClass().getTypeName()+"\"";
    	for(int i=0;i<blockChain.size();i++)
    	{
    		s+="\n\tBlock # "+i+"\n"+this.blockChain.get(i).toString()+"\n";
    	}       
    	if(s!="")
    		s+="\n}";
    	return s;
    	
//    	ObjectMapper objectMaper = new ObjectMapper();
//    	try{
//    		for(int i=0;i<blockChain.size();i++){
//        	String jsonString = objectMaper.writeValueAsString(blockChain.get(i).toString());
//        	System.out.println(jsonString);
//    		}
//    	}
//    	catch(JsonProcessingException e){
//    		System.out.println(e);
//    	}
//    		
    	
    }
    
}
	