
public class LRUCache extends LinkedHashMap<Object,Object> {

    int capacity;
    public LRUCache(int capacity) {
        super(capacity);
        this.capacity=capacity;
    }
    
    
    public int get(int key) {
        if (containsKey(key)){
            int value = (int)get((Object)key);
            remove(key);
            put((Object)key,(Object)value);
            return value ;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(containsKey(key)){
            remove(key);
        }
        put((Object)key,(Object)value);
    }
    
    @Override
    protected boolean removeEldestEntry(
			java.util.Map.Entry<Object,Object> eldest) {
		// remove the oldest element when size limit is reached
		
		return (size() > capacity);
    
}
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */