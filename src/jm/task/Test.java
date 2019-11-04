package jm.task;

import java.util.Optional;

class Test {

    public static class Box<T> {
        //твой код здесь
        private T object;

        public static Box<?> getBox() {
            return new Box<>();
        }
    }
}
