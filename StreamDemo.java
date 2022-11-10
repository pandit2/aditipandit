import java.util.ArrayList;
import java.util.List;

import java.util.stream. Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> List=new ArrayList<>();
		List.add("v");
		List.add("jungkook");
		List.add(" ");
		List.add("jin");
		List.add(" ");
		List.add("jimin");
       List<String> List2=List.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
       List2.forEach (i->System.out.println(i));
	}

}
