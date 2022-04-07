import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n",Math.PI);
		System.out.printf("hello");
		
		int num = 325325;
		System.out.printf("%,d%n",num);

		String name = "山田";
		int age = 23;
		System.out.printf("こんにちは山田%s(%d歳)さん！%n",name,age);

		System.out.printf("%,6d%n",34);
		System.out.printf("%,6d%n",2532);
		System.out.printf("%,6d%n",426);
		System.out.printf("%,6d%n",15234);
	}
}

