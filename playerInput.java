package unit2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class playerInput {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String pInput;

		do {
			System.out.print("> ");
			pInput = in.readLine();
			System.out.println("You entered: " + pInput);

		} while (!"Exit game".equals(pInput));

	}

}
