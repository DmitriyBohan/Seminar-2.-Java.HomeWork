/**
 * Задание 1
 * Напишите программу,
 * записывающую 100 раз слово ”ТЕST” в файл.
 * Слова должны чередоваться по формату – четная итерация большими буквами,
 * нечетные – маленькими
 * Пример: TESTtestTESTtestTEST…
 */
public class task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
            sb.append("test");
        }

        System.out.println(sb);
    }

}