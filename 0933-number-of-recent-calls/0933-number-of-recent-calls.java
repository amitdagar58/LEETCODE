import java.util.*;
class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
        }

    
    public int ping(int t) {
        // add krenge current request time ko
        queue.offer(t);

        // remove krenge older request ko if the range is noyt in t - 30000
        while(queue.peek() < t - 3000){
            queue.poll();
        }

        return queue.size();// retrun kiy anumbner if request inside the queue;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */