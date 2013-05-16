import java.io.*;
class HelloWorld{
	public static void main(String[] args) throws IOException{
		String CurLine = ""; // Line read from standard in
		
		System.out.println("Enter your name and lastname (type 'quit' to exit): ");
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		System.out.println();
		
		while (!(CurLine.equals("quit"))){
			CurLine = in.readLine();
			
			if (!(CurLine.equals("quit"))){
				System.out.println("Hello " + CurLine);
			}
		}
	}
}