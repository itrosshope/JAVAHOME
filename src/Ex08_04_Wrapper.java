
public class Ex08_04_Wrapper {

	public static void main(String[] args) {
		
		Integer it1 = new Integer(11);// int�� ---> integer����
		
		Integer it2 =11;// 11�� new Integer(11) �ڵ� ���� autoboxing(����ڽ�)
		Integer it3 =22;// 22�� new Integer(11) �ڵ� ����
		
		int it4 = 33;
		int i5 = new Integer(44); // new Integer(44)-->44�� �ڵ� ���� unboxing(��ڽ�)
		
		int i = Integer.parseInt("100");//parseInt = ���ڿ��� ������ ��������
		int j = Integer.parseInt("200");
		System.out.println(i+j);
		System.out.println("100" + "200");//���� "100" + ����"200" ���
		
		Integer a = Integer.valueOf("100");
		int b = Integer.valueOf("200"); //���� ����
		System.out.println(a+b);
		System.out.println("--------------------");
		
		double c = Double.parseDouble("123.4");//������ ������ ��´�.
		System.out.println(c);
		System.out.println("+++++++++++++++++++++++++");
		
		try {
			i = Integer.parseInt("100.3");
			System.out.println(i);
			}catch(NumberFormatException e) {
				System.out.println(e.toString());
				System.out.println(e.getMessage());
			}
		System.out.println("===========================");
		
		
		int[] arr = {1,2,3,4,5};
		int sum=0;
		
		for(i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		
		String[] arr2 = {"1","2","3","4","5"};
		
		for(i=0; i<arr2.length; i++) {
			sum +=Integer.parseInt(arr2[i]);
		}
		
		System.out.println(sum);
		System.out.println("*************************");
		
		String[] str = {"����:90", "ũ����Ż:70", "������:80"};
		
		for(i=0; i<str.length; i++) {
			
		}
		System.out.println(str[1]);
		System.out.println("===================");
		
		sum=0;
		for(i=0; i<str.length; i++) {
			System.out.println(str[i]);
			
			int pos = str[i].indexOf(":");
			System.out.println("pos:" + pos);	
			
			String s = str[i].substring(pos+1);
			System.out.println("s:" + s);
			
			int jumsu = Integer.parseInt(s);
			sum += jumsu;
			
//			sum += Integer.parseInt(str[i].substring(str[i].indexOf(":")+1)); <--���Ͱ���
			
		}
		System.out.println("��:" + sum);
		System.out.println("++++++++++++++++++++++++");
		
		
		sum = 0;
		String[] str2 = {"����:90","ũ����Ż:70","������:80"};
		for(i=0;i<str2.length;i++) {
			String[] s = str2[i].split(":");
			sum += Integer.parseInt(s[1]);
		}
		System.out.println("��:"+sum);
		
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n");
	}
}








