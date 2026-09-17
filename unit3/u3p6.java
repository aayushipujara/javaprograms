class InvalidmarksException extends Exception{
    public InvalidmarksException(String message){
        super(message);
    }
}

public class u3p6{
    static void validatevivaanmarks(double marks) throws InvalidmarksException{
        if (marks<0.0 ||marks>100.0){
            throw new InvalidmarksException("Marks must be between0 and 100!! Input was:"+ marks );
        } else{
            System.out.println("Marks validated successfully!! Marks are:"+ marks);
        }
    }

public static void main(String args[]){
    try {
        System.out.println("Submitting exam score for Vivaan");
        validatevivaanmarks(105.5);

    } catch (InvalidmarksException e) {
        System.out.println("Custom exception caught!!" + e.getMessage());
    }
}
}