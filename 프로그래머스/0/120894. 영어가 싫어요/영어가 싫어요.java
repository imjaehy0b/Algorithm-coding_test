import java.util.*;
class Solution {
    public long solution(String numbers) {
        String[] str_num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String str = numbers.replace("zero","0").replace("one","1").replace("two","2")
            .replace("three","3").replace("four","4").replace("five","5").replace("six","6")
            .replace("seven","7").replace("eight","8").replace("nine","9");
        long answer = Long.parseLong(str);
        
        return answer;
    }
}