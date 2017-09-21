public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	
	ThreadDemo(String name) {
		threadName = name;
		System.out.println("创建" + name);
	}
	
	//如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
	public void run() {
		System.out.println("运行" + threadName);
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("线程" + threadName + " " + i);
				Thread.sleep(50);
			} 
		} catch (InterruptedException e) {
			System.out.println("线程" + threadName + "interrupted");
		}
		System.out.println("线程" + threadName + "exiting");
	}
	
	//使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
	public void start() {
		System.out.println("开辟" + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
