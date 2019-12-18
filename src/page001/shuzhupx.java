package page001;

public class shuzhupx {

	public static void main(String[] args) {
		int[]arr= {9,8,3,5,2};
		System.out.println("这个数组长度是"+arr.length);
		//foreach循环
		for (int says:arr) {
			System.out.print(says+" ");
		}
		System.out.println();
		/*冒泡排序第一趟：8352 9
		 * 冒泡排序第二趟：23 985
		 * 冒泡排序第三趟：235 98
		 * 冒泡排序第四趟：23589
		 */
		//定义外循环，表示趟数
		for(int m=1;m<arr.length;m++) 
			//定义内循环，比较第m趟要比较的多个数，两两比较
			for (int n=0;n<arr.length-1;n++) {
				if(arr[n]>arr[n+1]);
				{
					int temp=arr[n];
					arr[n]=arr[n+1];
					arr[n+1]=temp;
				}
				
			}
		for (int says:arr) {
			System.out.print(says+" ");
		}
		}
	}

