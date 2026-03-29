class EventManager {
    private PriorityQueue<int[]> pq;
    private HashMap<Integer, Integer> active;
    private HashMap<Integer, Integer> d;
    
    public EventManager(int[][] events) {
        active = new HashMap<>();

        for(int[] e : events){
            active.put(e[0], e[1]);
        }
        d = new HashMap<>(active);
        pq = new PriorityQueue<>((a, b) -> 
            a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]
        );
        for(int[] e: events){
            pq.offer(new int[]{e[0] , e[1]});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        if(active.containsKey(eventId)){
            active.put(eventId, newPriority);
            pq.offer(new int[]{eventId , newPriority});
        }
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int priority = top[1];
            int eId = top[0];

            if(active.containsKey(eId) && active.get(eId) == priority){
                active.remove(eId);
                return eId;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */