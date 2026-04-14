class FirstLastOccurrence {
    static int findFirst(int[] arr,int target){
        int l=0,r=arr.length-1,res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==target){res=m;r=m-1;}
            else if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return res;
    }

    static int findLast(int[] arr,int target){
        int l=0,r=arr.length-1,res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==target){res=m;l=m+1;}
            else if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr={1,2,2,2,3};
        System.out.println(findFirst(arr,2)+" "+findLast(arr,2));
    }
}