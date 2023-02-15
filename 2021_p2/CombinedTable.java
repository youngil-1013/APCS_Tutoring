public class CombinedTable {
    // Height, single tables,avg of view quality, num seats
    private int num_seats;
    private double desireability;
    private SingleTable single_table1;
    private SingleTable single_table2;

    // Constructor Class
    public CombinedTable(SingleTable single_table1, SingleTable single_table2) {
        this.single_table1 = single_table1;
        this.single_table2 = single_table2;
        this.num_seats = single_table1.getNumSeats() + single_table2.getNumSeats() - 2;
        if (single_table1.getHeight() == single_table2.getHeight()) {
            this.desireability = (single_table1.getViewQuality() + single_table2.getViewQuality()) / 2;
        } else {
            this.desireability = (single_table1.getViewQuality() + single_table2.getViewQuality()) / 2 - 10;
        }
    }

    // Compares the number of people with the number of seats available
    public boolean canSeat(int numOfPeople) {
        if (this.num_seats >= numOfPeople) {
            return true;
        } else {
            return false;
        }
    }

    public double getDesireability() {
        return this.desireability;
    }

    // Testing implementation using the main method
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);
        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesireability());
        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesireability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesireability());
    }
}
