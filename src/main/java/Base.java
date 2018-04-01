import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Задание 6. Коллекции.
 *
 * @author Irina Miklyaeva
 */
public class Base {
    public static void main(String[] args) throws FileNotFoundException {// проверка на отсутствие файла
        Scanner scanner = new Scanner(new File("C:\\example.txt"));// передаем в объект Сканер путь к файлу
        Map<String, Integer> statistics = new TreeMap<>();// Объявляем объект класса TreeMap (сортирует по естественному порядку ключей по возврастанию (для ключа типа строка - по-алфавиту))
        while (scanner.hasNext()) {// пока следующее слово есть в файле
            String word = scanner.useDelimiter("\\s+").next();// считываем слово через пробел
            Integer count = statistics.get(word);// объявляем счетчик и инициализируем
            if (count == null) {// если файл пустой , то счетчик=0
                count = 0;
            }
            statistics.put(word, ++count); // помещаем считанное слово в коллекцию в ключ и увеличиваем счетчик на 1 и передаем в значение
        }
        System.out.println("Статистика (слово=количество повторений):\n"+statistics);// Выводим статистику в консоль
        Integer maxvalue=0;// переменная для хранения максимального значения
        String key = null;// переменная для значения ключа у максимального значения
        for(Map.Entry<String,Integer> entry: statistics.entrySet()) {// получаем все ключи и значения
            Integer value=entry.getValue();// передаем значение
            if(value>maxvalue) {// Если текущеее значение больше максимального
                maxvalue=value; // обновляем  максимальное
                key=entry.getKey();// записываем значение ключа
            }
        } System.out.println( "слово с максимальным количеством повторений="+key+" число повторений="+maxvalue);// выводим в консоль слово и кол-во повторений

    }
}



