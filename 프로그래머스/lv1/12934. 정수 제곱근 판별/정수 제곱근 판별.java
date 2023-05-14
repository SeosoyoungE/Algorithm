class Solution {
    public long solution(long n) {
        long answer = -1;
        long x=1;
        while(n/x>=x){
        if(n/x==x&n%x==0){
            answer=(x+1)*(x+1);
            break;
        }
        answer=-1;
        x++;
    }
        return answer;
    }
}