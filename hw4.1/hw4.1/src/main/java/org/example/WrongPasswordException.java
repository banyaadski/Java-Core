package org.example;

public  class WrongPasswordException extends RuntimeException {
    private int passLength;
    private boolean Confirm;

    public WrongPasswordException(int passLength, boolean Confirm) {
        super();
        this.passLength = passLength;
        this.Confirm = Confirm;
    }


    @Override
    public String getMessage() {
        boolean Check = passLength <= 20;
        return String.format("Your pass is of %s length %s %d. Password %smatch",
                ((Check) ? "accepted" : "not accepted"), ((Check) ? ",expected 0>pass<20,given length" : "expected 0>pass<20,given length"), passLength, (Confirm) ? "" : "doesn't");
    }
}
