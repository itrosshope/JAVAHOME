
//import static java.lang.Math.*;

public class Ex08_05_Math {

	public static void main(String[] args) {
			
		
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		long num1 = Math.round(3.859); //�Ҽ��� �ݿø�
		System.out.println("num1:" + num1);
		
		double num2 = Math.ceil(4.32);// �Ҽ���  ������ �ø�
		System.out.println(num2);
		
		double num3 = Math.floor(4.72);// �Ҽ��� ������ ����
		System.out.println(num3);
//		double num3 = floor(4.72); ���� import �ϸ� Math��� ����
//		System.out.println(num3);
		
		double num4 = Math.random();
		System.out.println("num4:" + num4);// <-- 0 <= 1
		
		double num10 =(Math.random()*10);
		System.out.println("num4:" + num10);
		// <-- 0*10 <= x*10 < 1*10
		
		double num11 =(Math.random()*50)+30;
		System.out.println("num4:" + num11);
		// <-- 30~79 ������ ���� ������ ����
		// 79-30 +1 =
	}

}
