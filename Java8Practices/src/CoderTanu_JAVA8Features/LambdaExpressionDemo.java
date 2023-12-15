package CoderTanu_JAVA8Features;

import java.util.function.BiConsumer;

public class LambdaExpressionDemo {
	
	
//	public static void add(int a, int b) {
//		System.out.println(a+b);
//	}
	
	
       BiConsumer<Integer, Integer> bc =(a,b) ->System.out.println(a+b);
        bc


	
	
	public static void main(String args[]) {
		add(2,3);
	}

}
