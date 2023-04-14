import java.util.Scanner;

public final class ConsoleUtils {

	public static void printEmphasized(String text) {
		System.out.println("\u001b[1;97m" + text + "\u001b[0m");
	}

	public static void printError(String message) {
		System.err.println("\u001b[1;91m" + message + "\u001b[0m");
	}

	public static boolean askYesNo(Scanner console, String prompt, boolean isYesDefault) {
		System.out.print(prompt);
		var answer = console.nextLine();

		if (answer.isBlank()) {
			return isYesDefault;
		}

		if (answer.startsWith("y") || answer.startsWith("д") || answer.startsWith("l")) {
			return true;
		} else if (answer.startsWith("n") || answer.startsWith("н") || answer.startsWith("т")) {
			return false;
		} else {
			return isYesDefault;
		}
	}
}
