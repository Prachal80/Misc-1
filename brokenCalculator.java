// Time Complexity : o(logn)
// Space Complexity : 0
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//LC : 979
//Approach: Greedy

class Solution {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        while(Y>X){
            if(Y%2 == 0){
                Y = Y/2;
            }
            else{
                Y=Y+1;
            }
            count++;
        }
        count+=X-Y;
        
        return count;
    }
}

/*
class Solution{
    public int brokenCalc(int X, int Y){
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(X);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0 ; i < size; i++){
                int curr = q.poll();
                if(curr == Y) return count;
                if(curr > Y){
                    q.add(curr-1);
                }
                q.add(curr*2);
                q.add(curr-1);
                
            }
            count++;
             
        }
        return -1;
    }
}
*/