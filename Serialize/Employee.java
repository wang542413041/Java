
public class Employee implements java.io.Serializable {
	public String name;
	public String address;
	//不可序列化对象,忽略序列化对象
	public transient int SSN;
	public int number;
	public void mailCheck() {
		System.out.println("邮件：" + name + " " + address);
	}
}