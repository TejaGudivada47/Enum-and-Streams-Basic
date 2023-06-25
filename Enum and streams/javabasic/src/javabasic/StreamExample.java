package javabasic;

import java.util.stream.IntStream;

public class StreamExample {
public static void main(String args[]) {
	IntStream.range(1, 11).forEach(System.out::println);
	IntStream.range(1, 100).filter(i->i%2==0).forEach(System.out::println);
	int total =IntStream.range(1, 100).filter(i->i%2==0).sum();
	System.out.println(total);
}
}
