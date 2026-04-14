class Search2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5},{7,9,11}};
        int target = 9;

        int rows=mat.length, cols=mat[0].length;
        int left=0,right=rows*cols-1;

        while(left<=right){
            int mid=(left+right)/2;
            int val = mat[mid/cols][mid%cols];

            if(val==target){
                System.out.println(true);
                return;
            }
            else if(val<target) left=mid+1;
            else right=mid-1;
        }
        System.out.println(false);
    }
}