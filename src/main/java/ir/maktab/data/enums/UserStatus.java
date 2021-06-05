package ir.maktab.data.enums;

public enum UserStatus {
    NEW("new"),
    AWAITING("awaiting "),
    CONFIRMED(" Confirmed");
    private final String userStatus;

    UserStatus(String status) {
        this.userStatus = status;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
