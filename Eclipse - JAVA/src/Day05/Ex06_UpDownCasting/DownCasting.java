package Day05.Ex06_UpDownCasting;

public class DownCasting {

	public static void main(String[] args) {
		// 다운캐스팅 (깅제 형 변환)
		// : 전제 조건 - 업캐스팅
		// 다운캐스팅은 업캐스팅된 부모객체를 자식객체로 변환하는 것
		// - 업캐스팅: (부모)<-(자식)
		// - 다운캐스팅: (자식)<-(부모)
		
		//업캐스팅
		Person person = new Student("김휴먼", 20, 1 , "뮤지컬학과");
		
		System.out.println(person);
		System.out.println(person.work());
		
		//다운캐스팅
		Student student = (Student) person;
		
		System.out.println(student.grade);
		System.out.println(student.major);
	}
	
}
