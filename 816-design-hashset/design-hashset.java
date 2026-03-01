class MyHashSet {
    
    int[] arr = new int[10000000];
    public MyHashSet() {
        Arrays.fill(arr, 0);
    }
    
    public void add(int key) {
        arr[key] = 1;
    }
    
    public void remove(int key) {
        arr[key] = 0;
    }
    
    public boolean contains(int key) {
        if(arr[key] == 1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */