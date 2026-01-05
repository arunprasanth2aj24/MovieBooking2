package MovieTicketBookingSystem;

public interface ScreenInterface {
    public int getBookingId();
    public void setBookingId(int bookingId);
    public int getTicketPrice();
    public void setTicketPrice(int ticketPrice);
    public int getSnackPrice();
    public void setSnackPrice(int snackPrice);
    public int getTotalBill();
    public void setTotalBill(int totalBill);
    public void setViewer(ViewerInterface viewer);
    public void calculateTicketPrice();
    public void calculateSnackPrice();
    public void generateBill();
    public void applyDiscount();

}
