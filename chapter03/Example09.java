class Person {
	// 定义构造方法
	private Person() {
		System.out.println("调用无参的构造方法");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person p = new Person();
	}
}
