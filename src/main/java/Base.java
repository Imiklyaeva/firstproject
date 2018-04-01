

import java.io.FileNotFoundException;


/**
 * Задание 6. Коллекции.
 *
 * @author Irina Miklyaeva
 */
public class Base {
    public static void main(String[] args) throws FileNotFoundException {
        WordFromFile statistics = new WordFromFile();// Объявляем объект класса Слова из файла
        System.out.println("Статистика (слово=количество повторений):\n" + statistics.wordsTreeMap());// Выводим статистику в консоль
        MaxCountRepeat maxCountRepeat = new MaxCountRepeat();
        maxCountRepeat.countMaxRepeat(statistics.wordsTreeMap());
    }
}




