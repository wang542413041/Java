public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	RunnableDemo(String name) {
		threadName = name;
		System.out.println("创建" + threadName);
	}

	public void run() {
		System.out.println("运行" + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("线程：" + threadName + "," + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("线程" + threadName + "interrupted");
		}
		System.out.println("线程" + threadName + "exiting");
	}

	public void start() {
		System.out.println("开始" + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}