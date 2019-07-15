//passing array as argument in method
class TestArray{
	 
	public static void smallNub(int a[]){
		int min=a[0];	
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(min);
	 }
	
	public static void largestNub(int []arr){
	    int	largest=arr[0];
	    	for(int i=0;i<arr.length;i++){
	    		
	    		if(arr[i]>largest){
	    			largest=arr[i];
	    		}
	    	}
	    	System.out.println("largest"+ largest);
	}
	
}


public class SmallNumInArray {

	public static void main(String[] args) {
		int arr[] ={5,88,2,3,0,0};
		TestArray.smallNub(arr);
		TestArray.largestNub(arr);
		
		
		TestArray.smallNub(new int[]{-1,8,0,6});//anonymous array
		
		//priting class name of array
		Class c= arr.getClass();
		String name= c.getName();
		System.out.println(name);

	}

}
