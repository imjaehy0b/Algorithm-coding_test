class Solution {
    public int solution(String s) {
        int answer = 0;
        // String str = s.replace("zero","0").replace("one","1").replace("two","2").replace("three","3").
        //     replace("four","4").replace("five","5").replace("six","6").replace("seven","7").
        //     replace("eight","8").replace("nine","9");
        // answer = Integer.parseInt(str);
        
        
        String[] strArr = {  "zero", "one", "two",
                             "three", "four", "five",
                             "six", "seven", "eight", "nine"
                           };
        for(int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}