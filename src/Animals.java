public class Animals {
    //    public static String toString;
    private String name;
    private int occurrence;


    public Animals(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;

    }

    @Override
    public String toString() {
        return "{" +
                "name:" + "\"" + name +
                "\", occurrence: " + occurrence +
                '}';
    }
}
