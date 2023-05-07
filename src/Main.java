public class Main {
    public static void main(String[] args) {
        Number[] arr = {16, -33, -26, 961, 443, 86, 9, -3, 55, 18, 97, 100, 62, 0, 8, 17};
        Number[] arr2 = {16, -33, -26, 961, 443, 86, 9, -3, 55, 18, 97, 100, 62, 0, 8, 17};

        System.out.println("Замінюємо непарні елементи на 0:");
        Collection collection = new Collection(arr);
        Iterator iterator = collection.createChangeToZeroOddNumbersIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Виводимо масив в зворотньому порядку через одну цифру:");
        Collection collection2 = new Collection(arr2);
        Iterator iterator2 = collection2.createBackwardIterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Виводимо кожен третій елемент масиву з кінця, якщо він непарний:");
        Iterator iterator3 = collection2.createAnonymousIterator();
        while (iterator3.hasNext()) {
            Number next = iterator3.next();
            System.out.print(next + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Виводимо кожен п’ятий елемент масиву, якщо він парний");
        System.out.println("і віднімаємо від нього 100:");
        Iterator iterator4 = collection2.createLocalIterator();
        while (iterator4.hasNext()) {
            Number next = iterator4.next();
            System.out.print(next + "  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Виводимо кожен другий елемент масиву, якщо він парний");
        System.out.println("та робимо з нього непарне число:");
        Iterator iterator5 = Collection.createStaticIterator();
        while (iterator5.hasNext()) {
            System.out.print(iterator5.next() + "  ");
        }
    }
}
