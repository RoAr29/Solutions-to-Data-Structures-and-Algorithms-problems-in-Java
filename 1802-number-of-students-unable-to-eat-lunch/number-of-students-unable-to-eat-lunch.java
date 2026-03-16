import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qs = new ArrayDeque<>();
        Queue<Integer> qss = new ArrayDeque<>();

        for(int i = 0; i < students.length; i++){
            qs.add(students[i]);
        }

        for(int i = 0; i < sandwiches.length; i++){
            qss.add(sandwiches[i]);
        }

        int count = 0;

        while(!qs.isEmpty() && count < qs.size()){
            if(qs.peek().equals(qss.peek())){
                qs.poll();
                qss.poll();
                count = 0;
            } 
            else{
                qs.add(qs.poll());
                count++;
            }
        }

        return qs.size();
    }
}