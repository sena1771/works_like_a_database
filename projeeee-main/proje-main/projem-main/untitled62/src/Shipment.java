import java.io.Serializable;

class Shipment implements Serializable {






    int id;
    String sender;
    String receiver;





    String current_place;
    //String branch;








    public Shipment(int id, String sender, String receiver, String current_place) {
        this.id=id;
        this.current_place=current_place;

        this.sender=sender;
        this.receiver=receiver;
    }

    public String toString()
    {

        return "\nShipment ID: "  + this.id + "\nSender : " + this.sender+"Receiver: "+this.receiver+"Current Place: "+this.current_place;
    }
}
