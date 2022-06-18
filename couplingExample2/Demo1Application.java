package couplingExample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {
	

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int res = binarySearch.binarySearch(new int[] {1,2,3,4,5,6,7,8}, 4);

		System.out.println(res);
		
	}

}
