import java.util.Optional;

public class Java8Optional {
	public static void main(String[] args) {
		Java8Optional jo = new Java8Optional();
		Integer value1 = null;
		Integer vaule2 = new Integer(10);

		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(vaule2);

		System.out.println(jo.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("第一个参数是否存在" + a.isPresent());
		System.out.println("第二个参数是否存在" + b.isPresent());

		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();

		return value1 + value2;
	}
}