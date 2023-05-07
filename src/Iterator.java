public interface Iterator {

    boolean hasNext();

    Number next();


}

class Collection {
    static Number[] numbers;

    Collection(Number[] numbers) {
        Collection.numbers = numbers;
    }

    public class ChangeToZeroOddNumbersIterator implements Iterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < numbers.length;
        }

        @Override
        public Number next() {
            if (numbers[i].intValue() % 2 != 0) {
                numbers[i] = 0;
            }
            return numbers[i++];
        }
    }

    public ChangeToZeroOddNumbersIterator createChangeToZeroOddNumbersIterator() {
        return new ChangeToZeroOddNumbersIterator();
    }

    public class BackwardIterator implements Iterator {
        private int i = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Number next() {
            if ((numbers.length - i) % 2 == 0) i--;
            return numbers[i--];
        }
    }

    public BackwardIterator createBackwardIterator() {
        return new BackwardIterator();
    }

    public Iterator createAnonymousIterator() {
        return new Iterator() {
            private int i = numbers.length - 1;
            private int lastI = -1;
            @Override
            public boolean hasNext(){
                if (lastI == i) return i<numbers.length;
                if (numbers.length == i + 1) i -= 2;
                else i -= 3;
                while (i>=0 && numbers[i].intValue() % 2 == 0) i-=3;
                lastI = i;
                return i>=0;
            }

            @Override
            public Number next() {
                lastI = -1;
                return numbers[i];
            }
        };
    }

    public Iterator createLocalIterator() {
        class LocalIterator implements Iterator {

            private int i = 0;
            private int lastI = -1;

            @Override
            public boolean hasNext() {
                if (lastI == i) return i<numbers.length;
                if (i==0) i += 4;
                else i += 5;
                while (i<numbers.length && numbers[i].intValue() % 2 != 0) i+=5;
                lastI = i;
                return i<numbers.length;
            }

            @Override
            public Number next() {
                lastI = -1;
                numbers[i] = numbers[i].intValue()-100;
                return numbers[i];
            }
        }
        return new LocalIterator();
    }
    static class StaticIterator implements Iterator {
        private int i = 0;
        private int lastI = -1;
        @Override
        public boolean hasNext() {
            if (lastI == i) return i<numbers.length;
            if (i==0) i += 1;
            else i += 2;
            while (i<numbers.length && numbers[i].intValue() % 2 != 0) i+=2;
            lastI = i;
            return i<numbers.length;
        }

        @Override
        public Number next() {
            lastI = -1;
            numbers[i] = numbers[i].intValue()+1;
            return numbers[i];
        }
    }

    static StaticIterator createStaticIterator() {
        return new StaticIterator();
    }
}

