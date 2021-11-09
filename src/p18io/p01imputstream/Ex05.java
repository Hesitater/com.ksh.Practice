package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex05 {
	public static void main(String[] args) {
		String name = "없는파일";
		InputStream is = null;
		
		
		try {
			is = new FileInputStream(name);
			
			while(is.read() != -1) {
				System.out.println("읽음");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if  (is != null) {
					is.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
		public static void method() {
			//try-with0resource
			
			String name = "없는 파일";
			
			try (InputStream is = new FileInputStream(name);){
				while(is.read() != -1) {
					System.out.println("읽음");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	
	
}
