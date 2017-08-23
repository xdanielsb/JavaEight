package DefaultMethods;

public interface Greeting {
	default void sayHello() {
		System.out.println("Hello there!");
	}
}
