import java.util.Scanner;

public class Ex08_02_String {

	public static void main(String[] args) {
		
		int a=1, b=2;
		System.out.println(a==b);
		
		String str1 = new String("Have a nice day");//
		String str2 = new String("Have A nice day");// str1�� str2�� �ּҰ� �ٸ�
//		String str1 = "Have a nice day";  //
//		String str2 = "Have a nice day";  // str1�� str2�� �ּҰ� ����
		
		System.out.println("str1: "+str1);
		System.out.println("str1�� ����: "+str1.length());
		System.out.println(str1.equals(str2)); //String equals�� ���ڿ��� ��ҹ��ڱ��� ��
		System.out.println(str1 == str2); // ==�� �ּҺ�
		System.out.println(str1.compareTo(str2)); //compareT0 ������ �Ǵ� ���ں� 
		
		if(str1.equals(str2)) {
			System.out.println("str1�� str2 ���ڿ� ����");
		}
		else {
			System.out.println("str1�� str2 ���ڿ� �ٸ�");
		}
			System.out.println(str1.equalsIgnoreCase(str2));//��ҹ��� �����ϰ� ��
			System.out.println(str1 == str2);
			System.out.println(str1.compareTo(str2));
			System.out.println("------------------------");
			
			System.out.println(str1.concat(str2));//str1�� str2�� ����
			System.out.println(str1 + str2); // str1.concat(str2)�� �������
			System.out.println("========================");
			
			System.out.println(str1.indexOf("nice")); //"nice"��� ������ ��ġ�� ã���� indexOf
			System.out.println(str1.indexOf("happy")); //������ ǥ�õǸ� ���ٴ� ��
			System.out.println(str1.lastIndexOf("a"));//���ڸ����� "a"�� ã�Ƽ� ��ġ ���
			System.out.println(str1.contains("nice"));//contains = boolean �� ����
			System.out.println(str1.contains("happy"));// "happy"��� ���ڰ� ���⶧�� false
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
			
			System.out.println(str1.charAt(3));//3��°���ִ� ���� ���
			char c = str1.charAt(3);
			System.out.println("c������ ��:" + c);
			System.out.println("***************************");
			
			System.out.println(str1.substring(7,9));// str1�� ����(���ڿ�) 7������~9�������� ���
			System.out.println(str1.substring(7)); //���� �ϳ��� ������ �Է��� �ڸ����� ������ ���
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
			System.out.println(str1.replace("a", "x")); // ���ڿ� �� ���"a"�� "x"�� ��� �����غ�(*"a"�� �ٲ��� ����)
			System.out.println(str1);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			String s = "   abs  d$e    fg     ";
			System.out.println(s);
			System.out.println(s.trim());//���ڿ��� �յ��� ������ ǥ������ ����(�ѹ��� �ٲ��� ����)
			System.out.println(s);
			s = s.trim();//<-----��~~~�յ� ������ ǥ������ �������� s = s.trim �Է�
			System.out.println(s);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			
			System.out.println(s.toUpperCase());//s�������� ��� ���ڸ� �빮�ڷ� ���� Ư������ ����ȵ�
			System.out.println(s.toLowerCase());//s�������� ��� ���ڸ� �ҹ��ڷ� ���� Ư������ ����ȵ�
			System.out.println("___________________________");
			
			String fullName = "Hello.java";
			String fileName;
			String ext;
			
			
			//		.�� ��ġ : 5
			int pos = fullName.indexOf(".");
			System.out.println("pos:"+pos);
			fileName = fullName.substring(0,pos);
			ext =fullName.substring(pos+1);
			
			System.out.println("ȭ�ϸ�:"+fileName);
			System.out.println("Ȯ����:"+ext);
			System.out.println("------------------------");
			
			String id="kim";
			String pw="1234";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���̵� �Է�:");
			String inputId = sc.next();
			
			System.out.println("��� �Է�");
			String inputPw = sc.next();
			
			if(id.equals(inputId) && (pw.equals(inputPw))) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				System.out.println("�α��� ����");
			}
			else 
				System.out.println("�α��� �Ұ���");
			}
	}










