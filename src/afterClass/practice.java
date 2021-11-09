package afterClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class practice {
	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\pr.txt");

		byte msize = 0;
		int fsize = 0;
		byte[] file = new byte[1024];
		for (msize = 0; msize < 127; msize++) {
			file[msize] = msize;
		}
		for (fsize = 0; fsize < 1024; fsize++) {
			os.write(file);

		}
		System.out.println("프짱");
		os.close();
	}

}
