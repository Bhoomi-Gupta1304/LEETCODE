class Solution {
    public void nextPermutation(int[] nums) {
        permutation(nums);
    }
    public static void permutation(int [] arr) {
		//step-1 find p
		int p=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		if(p==-1) {
			reverse(arr,0,arr.length-1);
			return;
		}
		//step-2 find q
		int q=-1;
		for(int i=arr.length-1;i>p;i--) {
			if (arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		//step-3 swap p and q index value
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		//step-4 reverse p+1 to n-1 index
		reverse(arr,p+1,arr.length-1);
		}
		public static void reverse(int [] arr,int i, int j) {
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}

}