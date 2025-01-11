package Lec_01;

public class MAXIMUM_SUM_SUBARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4} ;
		int sum=0;
	        int ans=-999999999;
	        for(int i=0;i<arr.length;i++){
	            sum+=arr[i];
//	            System.out.println(sum);
	            ans=Math.max(sum,ans);
	            if(sum<0){
	                sum=0;
	            }
	        }
	        System.out.println(ans);
	}

}
