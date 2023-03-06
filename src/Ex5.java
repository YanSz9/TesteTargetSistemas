public class Ex5 {
	public static void main(String[] args) {
		String string = "Target Sistemas";

		char[] caracteres = string.toCharArray();

		int inicio = 0;
		int fim = caracteres.length - 1;

		while (inicio < fim) {
			
			char temp = caracteres[inicio];
			caracteres[inicio] = caracteres[fim];
			caracteres[fim] = temp;

			inicio++;
			fim--;
			String newString = new String(caracteres);

			System.out.println(newString);
		}
	}
}
