import java.util.Scanner;
public class test03{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	//输入一个整数，表示裁判个数
	int N = 1;
	float sum = 0;
	float lGoal = 0;
	float max = 0;
	float min = 0;
	int num = 0;
	//System.out.println("请按要求输入：");
	N = scan.nextInt();
	float [] a = new float [N];
	for(int i=1;i<=N;i++){
			a[i-1] = scan.nextFloat();
		}

	//测试
	for(int i = 0;i<=N-1;i++){
	//System.out.println(a[i]);
		}

		//计算最终得分
		//求最大值
		max = a[0];
		for(int i = 0 ;i <= N-2;i++){
			if(a[i+1] > max){
				max = a[i+1];
				}
			}
		//System.out.println(max);

		//求最小值
		min = a[0];
		for(int i = 0;i <= N-2;i++){
			if(a[i+1] < min){
				min = a[i+1];
				}
			}
		//System.out.println(min);

		for(int i = 0;i <= N-1;i++){
			sum += a[i];
			}
			sum = sum - max - min;
			lGoal = sum / (N-2);
			//System.out.println(lGoal);
		//	System.out.println(sum);

		float abs = Math.abs(a[0] - lGoal);
		num = 0;
		for(int i = 0;i <= N-2;i++){
			if(Math.abs(a[i+1] - lGoal) < abs){
				abs = Math.abs(a[i+1] - lGoal);
			num = i+2;
			}
		}
		System.out.println(num);
	}
}
