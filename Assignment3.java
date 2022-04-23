package week1.day1;

public class Assignment3 {
	public static void main(String[]args)
	{
		int input=8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2; i<input; i++)
			sum=firstNum+secNum;
		System.out.println(sum);
		firstNum=secNum;
		secNum=sum;
		
				
	}

}
