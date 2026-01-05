package MovieTicketBookingSystem;

public class SilverScreen extends Screen{



    public SilverScreen(int id, int price , int snack , ViewerInterface viewer,int [][] seat){
        this.setBookingId(id);
        this.setTicketPrice(price);
        this.setSnackPrice(snack);
        this.setViewer(viewer);
        this.setSeating(seat);
    }


    }

