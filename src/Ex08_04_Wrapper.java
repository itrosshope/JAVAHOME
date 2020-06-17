
public class Ex08_04_Wrapper {

	public static void main(String[] args) {
		
		Integer it1 = new Integer(11);// int가 ---> integer변경
		
		Integer it2 =11;// 11이 new Integer(11) 자동 변경 autoboxing(오토박싱)
		Integer it3 =22;// 22이 new Integer(11) 자동 변경
		
		int it4 = 33;
		int i5 = new Integer(44); // new Integer(44)-->44로 자동 변경 unboxing(언박싱)
		
		int i = Integer.parseInt("100");//parseInt = 문자열을 정수로 변경해줌
		int j = Integer.parseInt("200");
		System.out.println(i+j);
		System.out.println("100" + "200");//문자 "100" + 문자"200" 출력
		
		Integer a = Integer.valueOf("100");
		int b = Integer.valueOf("200"); //위와 같음
		System.out.println(a+b);
		System.out.println("--------------------");
		
		double c = Double.parseDouble("123.4");//더블형 변수에 담는다.
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
		
		String[] str = {"웬디:90", "크리스탈:70", "아이유:80"};
		
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
			
//			sum += Integer.parseInt(str[i].substring(str[i].indexOf(":")+1)); <--위와같음
			
		}
		System.out.println("합:" + sum);
		System.out.println("++++++++++++++++++++++++");
		
		
		sum = 0;
		String[] str2 = {"웬디:90","크리스탈:70","아이유:80"};
		for(i=0;i<str2.length;i++) {
			String[] s = str2[i].split(":");
			sum += Integer.parseInt(s[1]);
		}
		System.out.println("합:"+sum);
		
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n");
	}
}








