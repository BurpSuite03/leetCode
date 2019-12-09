package IO;

import java.io.IOException;

public class IOTest1 {
	
	public static void main(String[] args) throws IOException{
		
		//test();
		
		
		for(int i=1; i<=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				if(i==j) {
					System.out.println();
				}
			}
		}
	}
	
	/*public static void test() throws IOException{
		RandomAccessFile file = new RandomAccessFile("d:/io/test.txt", "rw");
		FileChannel fileChannel = file.getChannel();
		
		ByteBuffer buf = ByteBuffer.allocate(1024);
		int byteRead = fileChannel.read(buf);
		while(byteRead !=-1) {
			System.out.println("Read:"+byteRead);
			buf.flip();
			
			while(buf.hasRemaining()) {
				System.out.println((char)buf.get());
			}
			
			buf.clear();
			byteRead = fileChannel.read(buf);
		}
		
		file.close();
		
	}*/

}
