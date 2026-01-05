package MovieTicketBookingSystem;

public interface ViewerInterface {
    public int getNoOfSeats();
    public void setNoOfSeats(int noOfSeats);
    public String getScreenType();
    public void setScreenType(String screenType);
    public String getWantsSnacks();
    public void setWantsSnacks(String wantsSnacks);
    public int getSnackQuantity();
    public void setSnackQuantity(int snackQuantity);
    public ScreenInterface[] getScreen();
    public void setScreen(ScreenInterface[] screen);

}
