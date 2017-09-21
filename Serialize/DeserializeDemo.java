import java.io.*;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fi = new FileInputStream("/Users/swift/Desktop/employee.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			e = (Employee) oi.readObject();
			oi.close();
			fi.close();
			System.out.println("文件读取完毕");
			System.out.println(e.address + e.name + e.number + e.SSN);
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		} catch (ClassNotFoundException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
}
