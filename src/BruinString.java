public class BruinString {
    private char[] data;
    private int length;

    public BruinString(){
        this.data = new char[0];
        this.length = 0;
    }

    public BruinString(char[] data){
        this.data = data;
        this.length = data.length;
    }

    public BruinString(String data){
        this.data = data.toCharArray();
        this.length = data.length();
    }

    public int length(){return length;}

    @Override
    public String toString(){
        return new String(data);
    }

    public void insert(int index, char ch){
        char[] newData = new char[this.length+1];
        for (int i = 0; i< index; i++){
            newData[i]=data[i];
        }
        newData[index] = ch;
        length++;
        for (int i = index+1; i<length; i++){
            newData[i]=data[i-1];
        }
        data = newData;
    }

    public void insert(int index, char[] data){
        for(int i = 0; i<data.length; i++){
            insert(index+i,data[i]);
        }
    }

    public void insert(int index, String data){
        insert(index,data.toCharArray());
    }

}
