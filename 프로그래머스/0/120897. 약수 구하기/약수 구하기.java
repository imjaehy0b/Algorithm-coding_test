import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        return arr;
    }
}