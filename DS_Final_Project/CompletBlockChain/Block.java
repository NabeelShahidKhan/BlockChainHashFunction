public class Block {
    private int    index;
    private String previousHash;
    private long   timestamp;
    private String data;
    private String hash;

    public Block() {
    }

    public Block(int index, String previousHash, long timestamp, String data, String hash) {
        this.index = index;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.data = data;
        this.hash = hash;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    public String toString(){
    	String s="";
    		s+= "\t{"+"\n\t\tindex: "+(this.index-1) +
    				"\n\t\ttimeStamp : "+this.timestamp+
    				"\n\t\tdata : "+this.data+
    				"\n\t\tpriviousHash : "+this.previousHash+
    				"\n\t\tHash : "+this.getHash()+"\n\t}";
    		return s;
    }
    
}

