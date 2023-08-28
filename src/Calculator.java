import org.w3c.dom.ls.LSOutput;

import java.util.function.*; // Использование предопреленных ФИ

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    /*
    расшифровка:
    static Supplier<Calculator> instance = (d) -> new Calculator(d);
     */

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) ->  y != 0  ? x/ y : 0; //git Деление на 0 пропускается. Требуется отдельно обрабатывать -> При делении на ноль 0 возвращаем 0
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;


}