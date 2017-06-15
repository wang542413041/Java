package CodeString;

public class LearnString {
	public static void main(String[] args) {
		String gretting = "你好";
		System.out.println(gretting);
		
		char[] helloChars = {'a', 'b', 'c'};
		String hello = new String(helloChars);
		System.out.print(hello);
		
		//格式化字符串
		System.out.printf("王家伟" + "%s 你 好", gretting);
		
		//StringBuilder StringBuffer buffer是线程安全的。builder具有更快的速度
		StringBuffer sB = new StringBuffer("可以变更的字符串");
		sB.append("   改变");
		System.out.printf("%s", sB);
	}
}
