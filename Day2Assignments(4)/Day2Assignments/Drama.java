package Day2Assignments;

class Drama extends Movie {
    // Constructor
    public Drama(String title, int idNumber, String mpaaRating) {
        super(title, idNumber, mpaaRating);
    }

    // Overriding calcLateFees method
    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}
