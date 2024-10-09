import java.util.TreeMap;
//Пример использования TreeMap:
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Добавление пар ключ-значение
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);

        // Порядок сортировки
        System.out.println("Содержимое TreeMap: " + treeMap); // Выведет: {Apple=1, Banana=2, Cherry=3}

        // Получение значения по ключу
        System.out.println("Значение для ключа 'Cherry': " + treeMap.get("Cherry")); // Выведет: 3
    }
}
/**
 * TreeMap — это реализация интерфейса Map, основанная на красно-черном дереве (балансированном бинарном дереве). Этот класс обеспечивает сортировку по ключам в естественном порядке или по заданному компаратору.
 *
 * Особенности TreeMap:
 * Гарантирует порядок: Элементы хранятся в отсортированном порядке по ключам.
 * Не допускает null ключи: При попытке добавить null ключ будет выброшено исключение NullPointerException.
 * Скорость: Операции вставки, удаления и поиска имеют сложность O(log n).  */