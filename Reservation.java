public class Reservation {
    private String pnr;
    private String name;
    private String trainNumber;
    private String classType;
    private String date;
    private String from;
    private String to;

    public Reservation(String pnr, String name, String trainNumber, String classType, String date, String from, String to) {
        this.pnr = pnr;
        this.name = name;
        this.trainNumber = trainNumber;
        this.classType = classType;
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public String getPnr() {
        return pnr;
    }

    public String getName() {
        return name;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getClassType() {
        return classType;
    }

    public String getDate() {
        return date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
