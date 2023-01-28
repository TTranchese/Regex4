public class Main {
	public static void main(String[] args) {
		String string =  "x3z ? xYz ! R1 && __";
		System.out.println(string);
		string = string.replaceAll("[a-z]|\\d", "*");
		System.out.println(string);
	}
}