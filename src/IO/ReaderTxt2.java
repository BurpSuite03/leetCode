package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderTxt2 {
	public static void main(String args[]) {
		File file = new File("D:\\test2\\lj.txt");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String lineTxt = null;
			List<String> list = new ArrayList<>();
			while((lineTxt =br.readLine()) !=null) {
				String s = lineTxt.substring(6,7);
				String s1 = lineTxt.substring(0,2);
				if(s1.equals("19")) {
					list.add(lineTxt);
				}
			}
			
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println(list.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
