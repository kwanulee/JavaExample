import java.io.*;
import java.util.*;

public class ObjectStreamTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;

		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		Student s = new Student("Lee", 20, new Phone("mobile", "010-1234-4567"));
		out.writeObject(s);

		in = new ObjectInputStream(new FileInputStream("object.dat"));
		System.out.println((Student) in.readObject());
		
		if (in != null)  in.close();	
		if (out != null) out.close();
	}
}

class Student implements Serializable {
	String name;
	int age;
	Phone phone;

	public Student(String name, int age, Phone phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String toString() {
		return String.format("(%s, %d, %s)", name, age, phone.toString());
	}
}

class Phone implements Serializable {
	String type;
	String number;

	public Phone(String type, String number) {
		this.type = type;
		this.number = number;
	}

	public String toString() {
		return type + ": " + number;
	}
}
