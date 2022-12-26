// Пусть дан список сотрудников:Иван Иванов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.

package homework.hw5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class hw5_2 {
    public static void main(String[] args) {
        List<String> stafflst = Arrays.asList(
                "Иванов И.И.", "Петров П.П.", "Сергеев С.С.", "Петров П.П.", "Иванов И.И.",
                "Савельев И.С.", "Петрин Е.С.", "Елжов Е.С.", "Сидоров А.С.", "Пушкин А.С.",
                "Козлов К.К.", "Габидуллин М.Г.", "Селезнева Е.С.", "Петрова И.П.", "Селезнева Е.С.");

        Map<String, Long> dblcount = stafflst.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        dblcount.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
