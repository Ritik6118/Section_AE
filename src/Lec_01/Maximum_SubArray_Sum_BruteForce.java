package Lec_01;

public class Maximum_SubArray_Sum_BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,2,-2,-4,-1,-3,8,1,1};
		int max=0;
		int st=0;
		int ed=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length; j++) {
				sum+=arr[j];
				if(sum>max) {
					st=i;
					ed=j;
					max=sum;
				}
//				max=Math.max(max, sum);
			}
		}
		for(int i=st;i<=ed;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(max);
		
	}

}
