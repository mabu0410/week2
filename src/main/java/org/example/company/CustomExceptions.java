package org.example.company;

public class CustomExceptions {
    static class IdTrungException extends Exception {
        public IdTrungException(String message) { super(message); }
    }

    class LuongAmException extends Exception {
        public LuongAmException(String message) { super(message); }
    }

    class DataException extends Exception {
        public DataException(String message) { super(message); }
    }
}
