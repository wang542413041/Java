# code2java

### Java 流(Stream)、文件（File)、IO
* Java 流、文件、IO ： 2017.09.07
	* fileStreamTest.Java
		* 输入流：FileInputStream、InputStramReader
		* 输出流：FileOutputStream、OutputStreamWriter
		* writer、reader、fop、fip需要close
	* DirList.java
		* isDirectory();判断是否文件夹
		* String s[] = f1.list();文件夹目录数组
	* CreateDir.java
		* file.mkdirs();创建文件夹
	* DeleteFileDemo.java
		* 获取文件夹 File floder = new File("文件路径");
		* File[] files = floder.listFiles();获取所有的file文件夹
		* 遍历
		* 是文件夹递归调用删除文件夹方式
		* 不是文件夹调用f.delete();删除
		* 文件夹空的时候文件夹调用floder.delete();

### Java 多线程

### Java 序列化
