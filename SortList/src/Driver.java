import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String args[]) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("abc1");
		s1.setId(3);

		Student s2 = new Student();
		s2.setName("abc2");
		s2.setId(2);

		Student s3 = new Student();
		s3.setName("abc3");
		s3.setId(1);

		list.add(s1);
		list.add(s2);
		list.add(s3);

		ComparatorSort comparator = new ComparatorSort();

		//		comparator.useComparatorAnonymous(list);
		//		comparator.useComparatorJava8Comparing(list);
		comparator.useComparatorJava8Lambda(list);
		comparator.useComparatorJava8ComparingReverse(list);

		list.forEach(item -> System.out.println(item.getId()));

	}
}
