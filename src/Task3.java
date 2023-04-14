public class Task3 {

	// Никаких проверяемых исключений не декларируется и не пробрасывается
	// функциями, используемыми к клиентской части -- можно убрать
	// декларирование throws Exception
	public static void main(String[] args) {

		try {
			int a = 90;
			int b = 3;
			System.out.println(a / b);
			printSum(23, 234);
			int[] abc = { 1, 2 };
			abc[3] = 9;

		} catch (NullPointerException ex) {
			System.out.println("Указатель не может указывать на null!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Массив выходит за пределы своего размера!");
		} catch (Throwable ex) {
			// Отлов оставшегося множества исключений (по суперклассу Throwable)
			// двигаем в самый конец всех блоков catch
			System.out.println("Что-то пошло не так...");
		}
	}

	// Можно убрать неуместное декларирование throws FileNotFoundException
	public static void printSum(Integer a, Integer b) {
		System.out.println(a + b);
	}

}
