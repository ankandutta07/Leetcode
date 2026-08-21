class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long i=2;
        while(i*i<=x){
            i+=1;
        }
        return (int)i-1;
    }
}