import java.io.*;
class Askname{
	public static void main(String[] args) throws IOException{
		String CurLine = ""; // Line read from standard in
		
		System.out.println("Enter your name and lastname (type 'quit' to exit): ");
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		System.out.println();
		
		Output o = new Output(in.readLine());
	}
}