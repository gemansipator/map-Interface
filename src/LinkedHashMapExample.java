import java.util.LinkedHashMap;
//Пример использования LinkedHashMap:
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Добавление пар ключ-значение
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Cherry", 3);

        // Порядок добавления сохраняется
        System.out.println("Содержимое LinkedHashMap: " + linkedHashMap); // Выведет: {Banana=2, Apple=1, Cherry=3}

        // Получение значения по ключу
        System.out.println("Значение для ключа 'Apple': " + linkedHashMap.get("Apple")); // Выведет: 1
    }
}
/**
 * LinkedHashMap — это также реализация интерфейса Map, которая сохраняет порядок
 * добавления элементов, используя связный список. Это позволяет эффективно сохранять
 * порядок вставки, сохраняя при этом быстродействие HashMap.
 *
 * Особенности LinkedHashMap:
 * Гарантирует порядок добавления: Элементы хранятся в порядке их вставки.
 * Позволяет null ключи и значения: Как и HashMap, LinkedHashMap допускает null ключи
 * и значения.
 * Скорость: Операции вставки, удаления и поиска имеют сложность O(1), как и у HashMap.*/