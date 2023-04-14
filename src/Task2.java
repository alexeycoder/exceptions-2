import java.util.stream.IntStream;

public class Task2 {
	public static void main(String[] args) {

		Integer[] intArray = IntStream.range(0, 5).boxed().toArray(Integer[]::new);
		int d = 0;

		try {
			// приводим знаменатель к double, поскольку тип назначения (результата)
			// явно намекает, что требуется нецелочисленное деление
			// (подразумеваемое приведение числителя к нужному типу вещественных
			// чисел обеспечит компилятор).
			double catchedRes1 = intArray[8] / (double) d;
			System.out.println("catchedRes1 = " + catchedRes1);

			// } catch (IndexOutOfBoundsException | NullPointerException e) {
		} catch (RuntimeException e) {
			//
			// 1. Потенциально возможное при работе с int ArithmeticException
			// не может возникнуть при работе с double
			// (результат деления на ноль определён и равен Infinity)
			//
			// 2. Возможное при иных исходных типах ClassCastException, тем не менее
			// не возможно при указанных исходных типах int double, включая их
			// boxed версии.
			//
			// 3. Однако, если типом массива, явно не обозначенного в исходном
			// коде, окажется целочисленная boxed-версия Integer[],
			// то потенциально может произойти NullPointerException.
			//
			// 4. Очевидно, может возникнуть IndexOutOfBoundsException при
			// работе с массивом.
			//
			// Из всех, реально возможными остаются исключения
			// IndexOutOfBoundsException и NullPointerException.
			//
			// Однако, поскольку все потенциально рассматриваемые исключения
			// являются подтипами RuntimeException, а какой-то специфической
			// обработки исключений в исходном задании явно не требуется,
			// с целью упрощения чтения/разработки выбрано отлавливание любых
			// RuntimeException!

			System.err.println("Catching exception: " + e);
			// e(.toString()) -- OK, т.к. напечатает тип исключения и его сообщение.
		}
	}
}
