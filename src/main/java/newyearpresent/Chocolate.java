package newyearpresent;

public class Chocolate extends Newyearpresent {// класс шоколад, наследуется от новогоднего подарка
    private String chocolateType;// создаем уникальный параметр тип шоколада (белый, молочный, горький)

    public Chocolate(String presentName, double presentWeight, double presentPrice, String chocolateType) {// конструктор для 4 полей класса
        super(presentName, presentWeight, presentPrice);
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {// переопределяем метрод toString для вывода в консоль 4 параметров шоколада
        return "Шоколад[" + super.toString() + ", тип = " + chocolateType + "]";
    }
}


