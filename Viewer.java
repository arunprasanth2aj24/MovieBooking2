package MovieTicketBookingSystem;

public class Viewer implements ViewerInterface {
    private int noOfSeats;
    private String screenType;
    private String wantsSnacks;
    private int snackQuantity;

    private ScreenInterface [] screen = new ScreenInterface [2];

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getWantsSnacks() {
        return wantsSnacks;
    }

    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public ScreenInterface[] getScreen() {
        return screen;
    }

    public void setScreen(ScreenInterface[] screen) {
        this.screen = screen;
    }
}
