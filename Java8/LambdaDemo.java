
public class LambdaDemo {
	
	/*
	 (parameters) -> expression = 参数 -> 表达式
	 (parameters) ->{ statements; } = 参数 -> { 表达式语句组合 }
	 
	 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
	 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号
	 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
	 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
	 lambda 表达式只能引用 final 或 final 局部变量，这就是说不能在 lambda 内部修改定义在域外的变量，否则会编译错误。
	 */

	final static String wang = "你好";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaDemo lb = new LambdaDemo();
		
		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> { return a * b; };
		MathOperation division = (int a, int b) -> a / b;
		//本类实例对象.操作方法(入参) -> 调用lambda表达式来计算
		System.out.println(lb.operate(10, 5, addition) + " " 
		+ lb.operate(10, 5, subtraction) + " " 
				+ lb.operate(10, 5, multiplication) + " " + lb.operate(10, 5, division));
		
		GreetingService gs = message -> System.out.println(wang + message);
		GreetingService gs2 = (message) -> System.out.println(wang + message);
		gs.sayMessage("王家伟");
		gs2.sayMessage("Lambda");
		
	}
	
	interface MathOperation {
		int operation(int a, int b);
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
