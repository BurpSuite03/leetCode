package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReaderTxt1 {
	public static void main(String args[]) {
		File file = new File("D:\\test2\\lj.txt");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String lineTxt =null;
			List<Integer> list = new ArrayList<>();
			while((lineTxt = br.readLine()) !=null) {
				String s = lineTxt.substring(20,22);
				list.add(Integer.valueOf(s.trim()));
			}
			List<Integer> list1 = new ArrayList<>();
			for(int i=0;i<=63;i++) {
				int num =0;
				for (Integer integer : list) {
					if (integer.equals(i)) {
						num++;
					}
				}
			    list1.add(num);
			}
			int num1 = 0;
			for (Integer integer : list1) {
				num1 = num1+integer;
			}
			System.out.println(num1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
