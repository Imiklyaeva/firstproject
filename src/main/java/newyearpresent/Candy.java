package newyearpresent;

public class Candy extends Newyearpresent {// класс конфета, наследуется от новогоднего подарка
    private String fruitTaste; // уникальный параметр вкус фрукта

    public Candy(String presentName, double presentWeight, double presentPrice, String fruitTaste) {// конструктор для для 4 полей класса
        super(presentName, presentWeight, presentPrice);
        this.fruitTaste = fruitTaste;
    }

    @Override
    public String toString() {// переопределяем метрод toString для вывода в консоль 4 параметров кофеты
        return "фруктовая конфета [" + super.toString() + ", вкус фрукта = " + fruitTaste + "]";
    }
}

