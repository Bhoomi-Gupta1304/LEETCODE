class Solution {
    public int findKthLargest(int[] nums, int k) {
        // jb bhi maximum ya minimum ya k ki baat a jae too priority ki size n ni rkhna
        // size k rekhege or min heap maintain krege
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
