class Person extends Object{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name + "," + age;
	}
	public boolean equals(Object obj) {
//		System.out.println(obj.age);
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return this.age == p.age;
//			System.out.println(p.age);
		}
		return false;
	}
}

public class Ex08_01_toString {

	public static void main(String[] args) {
		
		Person man = new Person("보검",20);
		Person woman = new Person("윤아",20);
		
		System.out.println(man.toString());
		System.out.println(woman);//toString은 참조변수만 써되 된다.
		//참조 변수 == 참조변수.toString 둘다 똑같음
		
		System.out.println(man.equals(woman)); //<-- 새로만든 메서드 (나이비교)
		System.out.println(man == woman); //<--주소를 비교하기 때문에 false
		//부모의 equals 는 주소를 비교한다.
	}

}
