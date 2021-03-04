public class DataStructure {
    
    
    private final static int num= 15;
    private int[] array = new int[num];
    
    public DataStructure() {
       
        for (int i = 0; i < num; i++) {
            array[i] = i;
        }
    }
    
    public void printEven() {
        
        
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    private class EvenIterator implements DataStructureIterator {
        
        
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            
            return (nextIndex <= num - 1);
        }        
        
        public Integer next() {
            
           
            Integer retValue = Integer.valueOf(array[nextIndex]);
            
           
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
       
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}