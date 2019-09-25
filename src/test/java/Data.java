import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utility.JsonExtractor;

public class Data {
	public static void main(String[] a) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data.json"));
		String data="";
		while(br.ready()) {
			data = data + br.readLine();
		}
		//System.out.println(data);
		String s = new JsonExtractor().dataExtract(data, "['menu']['popup']['menuitem'][1]");
		System.out.println(s);
	}
}
