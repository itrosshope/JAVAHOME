import java.util.Scanner;

public class Ex08_02_String {

	public static void main(String[] args) {
		
		int a=1, b=2;
		System.out.println(a==b);
		
		String str1 = new String("Have a nice day");//
		String str2 = new String("Have A nice day");// str1과 str2는 주소가 다름
//		String str1 = "Have a nice day";  //
//		String str2 = "Have a nice day";  // str1과 str2는 주소가 같음
		
		System.out.println("str1: "+str1);
		System.out.println("str1의 길이: "+str1.length());
		System.out.println(str1.equals(str2)); //String equals는 문자열비교 대소문자까지 비교
		System.out.println(str1 == str2); // ==은 주소비교
		System.out.println(str1.compareTo(str2)); //compareT0 정수로 판단 문자비교 
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2 문자열 같음");
		}
		else {
			System.out.println("str1과 str2 문자열 다름");
		}
			System.out.println(str1.equalsIgnoreCase(str2));//대소문자 무시하고 비교
			System.out.println(str1 == str2);
			System.out.println(str1.compareTo(str2));
			System.out.println("------------------------");
			
			System.out.println(str1.concat(str2));//str1과 str2를 연결
			System.out.println(str1 + str2); // str1.concat(str2)과 같은방법
			System.out.println("========================");
			
			System.out.println(str1.indexOf("nice")); //"nice"라는 문자의 위치를 찾을때 indexOf
			System.out.println(str1.indexOf("happy")); //음수가 표시되면 없다는 뜻
			System.out.println(str1.lastIndexOf("a"));//뒷자리부터 "a"를 찾아서 위치 출력
			System.out.println(str1.contains("nice"));//contains = boolean 과 같다
			System.out.println(str1.contains("happy"));// "happy"라는 문자가 없기때문 false
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
			
			System.out.println(str1.charAt(3));//3번째에있는 문자 출력
			char c = str1.charAt(3);
			System.out.println("c변수의 값:" + c);
			System.out.println("***************************");
			
			System.out.println(str1.substring(7,9));// str1의 값중(문자열) 7번부터~9번까지만 출력
			System.out.println(str1.substring(7)); //숫자 하나만 썼을땐 입력한 자리부터 끝까지 출력
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
			System.out.println(str1.replace("a", "x")); // 문자열 중 모든"a"를 "x"로 잠시 변경해봄(*"a"는 바뀌지 않음)
			System.out.println(str1);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			String s = "   abs  d$e    fg     ";
			System.out.println(s);
			System.out.println(s.trim());//문자열의 앞뒤의 공백을 표시하지 않음(한번만 바뀌지 않음)
			System.out.println(s);
			s = s.trim();//<-----쭉~~~앞뒤 공백을 표시하지 않으려면 s = s.trim 입력
			System.out.println(s);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			
			System.out.println(s.toUpperCase());//s변수안의 모든 문자를 대문자로 변경 특수문은 변경안됨
			System.out.println(s.toLowerCase());//s변수안의 모든 문자를 소문자로 변경 특수문은 변경안됨
			System.out.println("___________________________");
			
			String fullName = "Hello.java";
			String fileName;
			String ext;
			
			
			//		.의 위치 : 5
			int pos = fullName.indexOf(".");
			System.out.println("pos:"+pos);
			fileName = fullName.substring(0,pos);
			ext =fullName.substring(pos+1);
			
			System.out.println("화일명:"+fileName);
			System.out.println("확장자:"+ext);
			System.out.println("------------------------");
			
			String id="kim";
			String pw="1234";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("아이디 입력:");
			String inputId = sc.next();
			
			System.out.println("비번 입력");
			String inputPw = sc.next();
			
			if(id.equals(inputId) && (pw.equals(inputPw))) {
				System.out.println("비밀번호를 입력하세요");
				System.out.println("로그인 가능");
			}
			else 
				System.out.println("로그인 불가능");
			}
	}










