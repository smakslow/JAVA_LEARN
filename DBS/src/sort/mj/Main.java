package sort.mj;

import sort.mj.sort.Sort;
import sort.mj.tools.Asserts;
import sort.mj.tools.Integers;

import java.util.Arrays;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Main {
	public static void main(String[] args) {

	}

	static void testSorts(Integer[] array, Sort... sorts) {
		for (Sort sort : sorts) {
			Integer[] newArray = Integers.copy(array);
			sort.sort(newArray);
			Asserts.test(Integers.isAscOrder(newArray));
		}
		Arrays.sort(sorts);
		for (Sort sort : sorts) {
			System.out.println(sort);
		}
	}

}
