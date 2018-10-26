import java.nio.file.*;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get("/home/bulut/eclipse-workspace/ReadingFromText/text.txt"))); 
		System.out.print(data);
	}

}
