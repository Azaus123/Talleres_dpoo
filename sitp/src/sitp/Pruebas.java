package sitp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pruebas {
	//Esto es un input:
	String[] message = "Por fi dimelo:"
			try
	{
				System.out.print(message + ": ");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String input = reader.readLine();
	}
	catch (IOException e)
	{
		System.out.println("Error reading from the standard input");
		e.printStackTrace();
	}

}
