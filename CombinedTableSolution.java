
public class CombinedTableSolution {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTableSolution(SingleTable table1, SingleTable table2) {
        this.table1 = table1;
        this.table2 = table2;
    }

    public boolean canSeat(int numPeople) {
        if (table1.getNumSeats() + table2.getNumSeats() - 2 >= numPeople) {
            return true;
        }
        return false;
    }

    public double getDesireability() {
        if (table1.getHeight() == table2.getHeight()) {
            return (table1.getViewQuality() + table2.getViewQuality()) / 2;
        }
        return ((table1.getViewQuality() + table2.getViewQuality()) / 2) - 10;
    }

    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);
        CombinedTableSolution c1 = new CombinedTableSolution(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesireability());
        CombinedTableSolution c2 = new CombinedTableSolution(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesireability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesireability());
    }
}
