import java.util.HashMap;
//Пример использования HashMap:
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Добавление пар ключ-значение
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);

        // Получение значения по ключу
        System.out.println("Значение для ключа 'Apple': " + hashMap.get("Apple")); // Выведет: 1

        // Удаление элемента
        hashMap.remove("Banana");
        System.out.println("Содержимое HashMap после удаления 'Banana': " + hashMap);
    }
}
/**HashMap — это наиболее распространённая реализация интерфейса Map.
 * Она использует хеш-таблицу для хранения пар "ключ-значение", что обеспечивает
 * быстрый доступ к элементам.

 Особенности HashMap:
 Не гарантирует порядок: Порядок хранения элементов не соответствует порядку их добавления.
 Позволяет null ключи и значения: Можно добавлять элементы с ключом или значением null.
 Скорость: Быстрые операции вставки, удаления и поиска (в среднем O(1)).*/