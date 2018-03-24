package newyearpresent;

public abstract class Newyearpresent {// Абстрактный класс Новогодний подарок пакета Новогодний подарок
    private String presentName;// Поле название подарка
    private double presentWeight;// Поле сес подарка
    private double presentPrice;// Поле цена подарка

    Newyearpresent(String presentName, double presentWeight, double presentPrice) {// конструктор для полей класса
        this.presentName = presentName;
        this.presentWeight = presentWeight;
        this.presentPrice = presentPrice;
    }

    public double getPresentWeight() {
        return presentWeight;
    }


    public double getPresentPrice() {
        return presentPrice;
    }


    @Override
    public String toString() {// переотпределяем метод toString для вывода на консоль названия, веса и цены
        return "название = " + presentName + ", вес = " + presentWeight + " грамм" + ", цена = " + presentPrice + " рублей";
    }
}

