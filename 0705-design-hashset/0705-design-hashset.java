class MyHashSet {
    List<Integer> hashSet = new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        int flag=0;
        for(int i=0;i<hashSet.size();i++){
            if(hashSet.get(i)==key)
            return;
        }
        hashSet.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<hashSet.size();i++){
            if(key==hashSet.get(i)){
                hashSet.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i:hashSet){
            if(i==key)
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