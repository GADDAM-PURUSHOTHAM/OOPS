class CustomException extends Exception {
     CustomException(String message) {
        super(message);
    }
}

 class ExceptionDemo {
 
 	static void throwException() throws CustomException {
        System.out.println("Inside try block, throwing exception...");
        throw new CustomException("This is a custom exception.");
        }
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    
    
}

