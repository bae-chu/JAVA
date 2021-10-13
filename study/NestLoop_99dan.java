package loopexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestLoop_99dan {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		int dansu;
		int cols;

		System.out.print("몇 단까지 보시겠습니까? ");
		dansu = Integer.parseInt(inbr.readLine());
		System.out.print("몇 열로 표시하겠습니까? ");
		cols = Integer.parseInt(inbr.readLine());

		int rows;
		if (dansu % cols == 0)
			rows = dansu / cols;
		else
			rows = dansu / cols;

		for (int i = 0; i < rows; i++) {
			for (int times = 1; times <= 9; times++) {
				for (int dan = ((i * cols) + 1); dan < ((i * cols) + 1) + cols; dan++) {
					if (dan > dansu)
						continue;
					System.out.print(dan + "x" + times + "=" + dan * times + " \t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
