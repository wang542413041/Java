import java.io.File;

public class DeleteFileDemo {
	public static void main(String[] args) {
		File floder = new File("/Users/swift/Desktop/wangjiawei");
		deleteFloder(floder);
	}

	public static void deleteFloder(File floder) {
		File[] files = floder.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFloder(f);
				} else {
					f.delete();
				}
			}
		}
		floder.delete();
	}
}
