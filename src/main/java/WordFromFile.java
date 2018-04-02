import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFromFile {// Класс Слова из файла
    WordFromFile() {
    }
    /**
     * Метод для считывания слов, разделенных пробелом из файла, добавление в коллекцию в алфавитном порядке
     * @return Коллекцию TreeMap с парой ключ=слово, значение= кол-во повторений в файле
     */
    public Map<String, Integer> wordsTreeMap () throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\ProjectIdea\\src\\main\\resources\\example.txt"));// передаем в объект Сканер путь к файлу
        Map<String, Integer> statistics = new TreeMap<>();// Объявляем объект класса TreeMap (сортирует по естественному порядку ключей по возврастанию (для ключа типа строка - по-алфавиту))
        while (scanner.hasNext()) {// пока следующее слово есть в файле
            String word = scanner.useDelimiter("\\s+").next();// считываем слово через пробел
            Integer count = statistics.get(word);// объявляем счетчик и инициализируем
            if (count == null) {// если файл пустой , то счетчик=0
                count = 0;
            }
            statistics.put(word, ++count); // помещаем считанное слово в коллекцию в ключ и увеличиваем счетчик на 1 и передаем в значение
        } return statistics;
    }
}
