
public class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, double quality, int height) {
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = quality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        this.viewQuality = value;
    }

    public static void main(String args[]) {

    }
}
