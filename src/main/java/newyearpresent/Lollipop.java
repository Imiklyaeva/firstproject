package newyearpresent;

public class Lollipop extends Newyearpresent {// класс леденец на палочке, наследуется от новогоднего подарка
    private String lollipopColor;// уникальный параметр цвет леденца

    public Lollipop(String presentName, double presentWeight, double presentPrice, String lollipopColor) {// конструктор для для 4 полей класса
        super(presentName, presentWeight, presentPrice);
        this.lollipopColor = lollipopColor;
    }

    @Override
    public String toString() {// переопределяем метрод toString для вывода в консоль 4 параметров леденца на палочке
        return "леденец на палочке[" + super.toString() + ", цвет = " + lollipopColor + "]";
    }
}
