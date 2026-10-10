class Solution {
    public int mySqrt(int x) {
        int n=0;
        for(int i=0;i<=x;i++){
            if(i*i==x){
                n=i;
                break;
            }
            else if ((i*i)>x && ((i+1)*(i+1))!=x)
            {
            n=i-1;
            break;}

        }
        return n;
    }
}