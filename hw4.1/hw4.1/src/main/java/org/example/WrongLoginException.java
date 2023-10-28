package org.example;

//public class WrongLoginException extends RuntimeException {
//    private int loginLength;
//
//    public  WrongLoginException(int loginLength){
//        super();
//        this.loginLength = loginLength;
//    }
//
//
//    public String getMassage(){
//        return String.format("your login is too long (more than 20), you are have %d symbols", loginLength);
//    }
//
//}

public class WrongLoginException extends RuntimeException {
    private int currentLength;

    public WrongLoginException(int currentLength) {
        super();
        this.currentLength = currentLength;
    }

    @Override
    public String getMessage() {
        return String.format("Your login is of incorrect length,expected<20,given%d.",
                currentLength);
    }
}