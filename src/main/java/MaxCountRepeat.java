import java.util.Map;


public class MaxCountRepeat {// Класс максимальное количество повторений

    MaxCountRepeat() {
    }

    /**
     * Метод для нахождения слова с максимальным количеством повторений в коллекции и вывод  на консоль
     */
    public void countMaxRepeat(Map<String, Integer> statistics) {
        Integer maxvalue = 0;// переменная для хранения максимального значения
        String key = null;// переменная для значения ключа у максимального значения
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {// получаем все ключи и значения
            Integer value = entry.getValue();// передаем значение
            if (value > maxvalue) {// Если текущеее значение больше максимального
                maxvalue = value; // обновляем  максимальное
                key = entry.getKey();// записываем значение ключа
            }
        }
        System.out.println("слово с максимальным количеством повторений=" + key + " число повторений=" + maxvalue);// выводим в консоль слово и кол-во повторений
    }
}