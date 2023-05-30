import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

    /**
     * capacity - по умолчанию имеет размер 16
     * При достижении предела, размер увеличивается вдвое по формуле: capacity * loadFactoty
     * loadFactory = 0.75 default
     * <p>
     * При добавлении элемента, мы считаем хэш-код ключа с помощью метода hashCode()
     * с помощью метода indexFor определяется позиция в массиве элемента
     * Вызов метода addEntry() для добавление нового элемента
     * <p>
     * Если ключ у нас равен null, вызов метода putForNullKey()
     * Будет записан в первую ячейку table[0]
     * <p>
     * КОЛЛИЗИЦИЯ
     * Если элемент уже существует на такой позиции, то новый элемент помещается в начало цепочки
     * <p>
     * Есть проблема с удалением элементов в HashMap, допустим, если добавить 150 элементов, а потом их
     * удалить, то размер цепочки не изменится, чтобы исправить ситуацию можно воспользоваться конструктором
     * <p>
     * Добавление элемента выполняется за время O(1), потому как новые элементы вставляются в начало цепочки
     */

    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("0", "zero");
        hashmap.put("key", "one");
        hashmap.put(null, null);
        hashmap.put("idx", "two");

        for (Map.Entry<String, String> entry: hashmap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (String key: hashmap.keySet()) {
            System.out.println(hashmap.get(key));
        }

        Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
