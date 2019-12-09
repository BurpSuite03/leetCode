package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class ReaderTxt {
	public static void main(String args[]) {
		File file = new File("D:\\test2\\lj.txt");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String lineTxt =null;
			List<Integer> list = new ArrayList<>();
			while((lineTxt = br.readLine()) !=null) {
				String s = lineTxt.substring(6, 19);
				int i= ReaderTxt.countStr(s, "9");
				list.add(i);
			}
			int num0 =0;
			int num1 =0;
			int num2 =0;
			int num3 =0;
			int num4 =0;
			int num5 =0;
			int num6 =0;
			int num7 =0;
			for (Integer integer : list) {
				if (integer.equals(1)) {
					num1++;
				}else if (integer.equals(2)) {
					num2++;
				}else if (integer.equals(3)) {
					num3++;
				}else if (integer.equals(4)) {
					num4++;
				}else if (integer.equals(5)) {
					num5++;
				}else if (integer.equals(6)) {
					num6++;
				}else if (integer.equals(7)) {
					num7++;
				}else if (integer.equals(0)) {
					num0++;
				}
			}
			System.out.println(num0);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int countStr(String s,String toFind) {
		int num =0;
		while(s.contains(toFind)) {
			s = s.substring(s.indexOf(toFind)+toFind.length());
			num++;
		}
		return num;
	}

}
