public class firstoccurance {


    static void main() {
        int[]arr={1,1,1,1,2,2,3,3,3,34,4,4,5,};
        int lo=0 , hi=arr.length-1;
        int target = 3;
        int idx = -1;
        while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid]==target){
            idx = mid;
            hi=mid-1;
            if(arr[mid]>target){
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
            System.out.println(mid);
        }


    }
}
