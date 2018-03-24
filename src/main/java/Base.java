import newyearpresent.Candy;
import newyearpresent.Chocolate;
import newyearpresent.Lollipop;
import newyearpresent.Newyearpresent;

/**
 * Задание 4 часть 2. Новогодний подарок
 *
 * @author Irina Miklyaeva
 * @see #findCommonPresentWeight(double, double, double) Метод для нахождения общего веса подарка
 * @see #findCommonPresentPrice(double, double, double) Метод для нахождения общей стоимости подарка
 */
public class Base {
    public static void main(String[] args) {
        Candy candy = new Candy("Мечта", 5.00, 6.00, "апельсин");// Новый объект класса Конфета
        Chocolate chocolate = new Chocolate("Милка", 80.00, 100.00, "Молочный");// Новый объект класса Шоколад
        Lollipop lollipop = new Lollipop("Петушок", 20.00, 15.00, "Оранжевый");// Новый объект класса Леденец на палочке
        Newyearpresent[] newYearPresent = {candy, chocolate, lollipop};// объявляем и инициализируем массив новогодний подарок
        double commonNewYearPresentWeight = findCommonPresentWeight(candy.getPresentWeight(), chocolate.getPresentWeight(), lollipop.getPresentWeight());// объявляем и инициализируем переменную для общего веса новогоднего подарка
        System.out.println("Общий вес новогоднего подарка = " + commonNewYearPresentWeight + " грамм");// выводим в консоль общий вес новогоднего подарка
        double commonNewYearPresentPrice = findCommonPresentPrice(candy.getPresentPrice(), chocolate.getPresentPrice(), lollipop.getPresentPrice());//объявляем и инициализируем переменную для общей стоимости новогоднего подарка
        System.out.println("Общая стоимость новогоднего подарка = " + commonNewYearPresentPrice + " рублей \nСладости, входящие в подарок:");// вывод в консоль общей стоимости новогоднего подарка
        for (Newyearpresent somePresent : newYearPresent) {// выводим в консоль информацию о сладостях в подарке
            System.out.println(somePresent.toString());
        }
    }

    /**
     * Метод для нахождения общего веса подарка
     *
     * @param candyPresentWeight     вес конфеты
     * @param chocolatePresentWeight вес шоколада
     * @param lollipopPresentWheigt  вес леденца на палочке
     * @return Общий вес подарка
     */
    private static double findCommonPresentWeight(double candyPresentWeight, double chocolatePresentWeight, double lollipopPresentWheigt) {
        return candyPresentWeight + chocolatePresentWeight + lollipopPresentWheigt;// общий вес подарка= сумме веса конфеты, шоколада и леденца на палочке

    }

    /**
     * Метод для нахождения общей стоимости подарка
     *
     * @param candyPresentPrice     цена конфеты
     * @param chocolatePresentPrice цены шоколада
     * @param lollipopPresentPrice  цена леденца на палочке
     * @return Общая стоимость подарка
     */
    private static double findCommonPresentPrice(double candyPresentPrice, double chocolatePresentPrice, double lollipopPresentPrice) {
        return candyPresentPrice + chocolatePresentPrice + lollipopPresentPrice;// общая цена подарка= сумме цены конфеты, шоколада и леденца на палочке

    }
}


