import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public void useComparatorAnonymous(List<Student> list) {

		Comparator<Student> compareId = new Comparator<>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}

		};

		Collections.sort(list, compareId);

	}

	public void useComparatorJava8Lambda(List<Student> list) {

		Collections.sort(list, (Student o1, Student o2) -> o1.getId() - o2.getId());
	}

	public void useComparatorJava8Comparing(List<Student> list) {

		Collections.sort(list, Comparator.comparing(Student::getId));

	}

	public void useComparatorJava8ComparingReverse(List<Student> list) {

		Collections.sort(list, Comparator.comparing(Student::getId).reversed());

	}

}
