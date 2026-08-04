class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int rows=matrix.length,columns=matrix[0].length;
        int low=0,high=(rows*columns)-1;    
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = mid/columns;
            int col = mid%columns;
            int midValue = matrix[row][col];
            if(midValue==target)
            return true;
            else if(midValue<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}