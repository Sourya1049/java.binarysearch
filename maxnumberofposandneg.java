public class maxnumberofposandneg {
    static void main() {
        int[] arr = {-5,-4,-3,-2,-1,0,0,0,1,2,3,4,5};
        int lo = 0, hi = arr.length - 1,pos=0,neg=0;
        while(lo<hi){
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==0)
            return;
            if(arr[mid]>0)
                lo=mid+1;
             pos = hi;
             neg = arr.length-hi;

        }
        System.out.println(pos);

    }
}