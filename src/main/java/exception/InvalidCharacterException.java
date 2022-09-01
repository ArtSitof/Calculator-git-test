package exception;

// Это исключение вызывается при неверном вводе символа операции
public class InvalidCharacterException extends Exception{

    private char operation;

     public InvalidCharacterException (String message, char operation) {
         super(message);
         this.operation = operation;
     }

    public char getOperation() {
        return operation;
    }

}
