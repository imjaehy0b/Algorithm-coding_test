class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        //n 이후 값을 앞으로 이동
        int idx =0;
        for(int i=n; i<num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        for(int j=0; j<n; j++){
            answer[idx++] = num_list[j];
        }
        return answer;
    }
}