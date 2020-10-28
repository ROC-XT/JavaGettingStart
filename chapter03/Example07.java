class Person {
	String name;
	int age;
	// 定义两个参数的构造方法
	public Person(String con_name, int con_age) {
		name = con_name;	// 为name属性赋值
		age = con_age; 		// 为age属性赋值
	}
	// 定义一个参数的构造方法
	public Person(String con_name) {
		name = con_name; 	// 为name属性赋值
	}
	public void speak() {
		// 打印name和age的值
		System.out.println("大家好，我叫" + name + ",我今年" + age + "岁!");
	}
}
public class Example07 {
	public static void main(String[] args) {
		// 分别创建两个对象 p1 和 p2
		Person p1 = new Person("陈杰");
		Person p2 = new Person("李芳", 18);
		// 通过对象p1 和 p2 调用speak()方法
		p1.speak();
		p2.speak();
	}
}
