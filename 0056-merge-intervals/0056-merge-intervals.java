class Solution {
    public int[][] merge(int[][] intervals) {
        // sort krenge intervals ko unke start time se
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        // yha pr hmm arraylist ko create krengee
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i<intervals.length; i++){
            // agar intrval overlapp hota hai to
            if(intervals[i][0] <= end){
                // to extend krna hai
                end = Math.max(end, intervals[i][1]);
            }

            else{
                // agar overlap nhi hua ho toh store previous intervals
                result.add(new int[] {start, end});

                // start the new intervals
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // yha pe last interval ko add krenge
        result.add(new int[]{start, end});

        // convert the list into 2d array
        return result.toArray(new int[result.size()][]);
    }
}