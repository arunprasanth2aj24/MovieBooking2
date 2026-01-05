package MovieTicketBookingSystem;

public class GoldScreen  extends Screen{


    public GoldScreen(int id, int price , int snack , ViewerInterface viewer,int [][] seat){
        this.setBookingId(id);
        this.setTicketPrice(price);
        this.setSnackPrice(snack);
        this.setViewer(viewer);
        this.setSeating(seat);
    }


    }




