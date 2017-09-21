import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "王家伟";
		e.address = "北京";
		e.SSN = 11223344;
		e.number = 101;
		
		try {
			FileOutputStream ft = new FileOutputStream("/Users/swift/Desktop/employee.ser");
			ObjectOutputStream ot = new ObjectOutputStream(ft);
			ot.writeObject(e);
			ot.close();
			ft.close();
			System.out.println("文件已写入");
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

}
