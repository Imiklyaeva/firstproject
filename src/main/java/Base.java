import java.util.Scanner;
/**
 * Калькулятор, выполняет сложение двух дробных числе. Задание 2
 *
 * @author Irina Miklyaeva
 * @see #SumMethod(float, float)  Выполняет сложение двух дробных чисел
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Новый объект Scanner

        System.out.println("Введите первое дробное число для сложения (разделитель ,) :");// Ввод из консоли первого дробного числа
        float i = scanner.nextFloat();
        System.out.println("Введите второе дробное число для сложения (разделитель ,) :");// Ввод из консоли второго дробного числа
        float j = scanner.nextFloat();
        scanner.close();// закрываем сканер
        float summa=SumMethod(i,j);// вызываем метод для сложения двух дробных чисел и передаем в summa  результат
        System.out.printf("Сумма=%.4f ", summa);// Вывод Итога сложения двух дробных чисел с точностью до 4 знаков после запятой
    }

    /**
     * Метод для сложения двух дробных чисел
     * @param i  первое введенное число
     * @param j  второе введенное число
     * @return Результат сложения двух дробных чисел
     */
    private static float SumMethod(float i, float j){
        float sum; // обяъявляем переменную sum
        sum = i+j ;// выполнякм сложение полученных на вход переменных
        return sum;}// Возвращаем на выход результат сложения

}