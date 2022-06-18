package couplingExample2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		// logic for Bubble Sort
		return numbers;
	}

}
