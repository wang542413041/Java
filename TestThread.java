public class TestThread {
   public static void main(String args[]) {
	  /*
	  RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      R2.start();
      */
	   
	   ThreadDemo T1 = new ThreadDemo("王家伟1");
	   T1.start();
	   
	   ThreadDemo T2 = new ThreadDemo("开发者");
	   T2.start();
      
   }   
}