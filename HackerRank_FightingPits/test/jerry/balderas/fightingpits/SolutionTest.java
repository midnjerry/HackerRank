package jerry.balderas.fightingpits;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setup() {

	}

	private Double testSolution(String name, String inputFilename, String expectedOutputFilename) {
		Double timeElapsed = null;
		try {
			PrintStream stdout = System.out;
			PrintStream printStream = new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")));
			System.setOut(printStream);
			System.setIn(new FileInputStream(inputFilename));
			long time1 = System.nanoTime();
			Solution2.main(null);
			long time2 = System.nanoTime();
			printStream.close();
			assertOutputIsCorrect("output.txt", expectedOutputFilename);
			System.setOut(stdout);
			timeElapsed = (time2 - time1) / 1000000.0;
			System.out.println(name + " elapsed time (ms): " + timeElapsed);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timeElapsed;
	}

	private boolean assertOutputIsCorrect(String filename1, String filename2) {
		Path file1 = Paths.get(filename1);
		Path file2 = Paths.get(filename2);
		try {
			List<String> f1 = Files.readAllLines(file1);
			List<String> f2 = Files.readAllLines(file2);

			for (int i = 0; i < f2.size(); i++) {
				assertEquals(f2.get(i), f1.get(i));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	@Test
	public void SampleTest0() {
		testSolution("Test0", "./FightingPits/input00.txt", "./FightingPits/output00.txt");
	}

	@Test
	public void SampleTest5() {
		testSolution("Test5", "./FightingPits/input05.txt", "./FightingPits/output05.txt");
	}

}
