package MovieTicketBookingSystem;

public abstract class Screen implements ScreenInterface{
    private int bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;

    private int seating [] [] = new int [6] [5];

    private ViewerInterface viewer;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }



    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }


    public void calculateTicketPrice(){
        this.ticketPrice = this.viewer.getNoOfSeats() * this.ticketPrice;
        System.out.println("Ticket price :");
        System.out.println(this.ticketPrice);
    }

    public void calculateSnackPrice(){
        if (this.viewer.getWantsSnacks().equals("Yes")){
            this.snackPrice = this.viewer.getSnackQuantity() * this.snackPrice;
            System.out.println("Snack Price :");
            System.out.println(this.snackPrice);
        }
        else if (this.viewer.getWantsSnacks().equals("No")){
            this.snackPrice = 0;
        }
        else{
            System.out.println("Enter a valid value");
        }


    }
    public void generateBill(){
        this.totalBill = this.ticketPrice + this.snackPrice + 100;
        System.out.println("Total price incl convenience fee :");
        System.out.println(this.totalBill);
    }

    public void applyDiscount(){
        if (this.viewer.getNoOfSeats()>=4){
            int disc = this.totalBill * 10/100;
            this.totalBill = this.totalBill - disc;
            System.out.println("Discount Applied");
            System.out.println(disc);

        }
        else {
            System.out.println("No discount applicable ");
        }

    }


    public int [][] getSeating() {
        return seating;
    }

    public void setSeating(int[][] seating) {
        this.seating = seating;
    }
}
