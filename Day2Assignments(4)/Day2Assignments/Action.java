package Day2Assignments;

class Action extends Movie {
    // Constructor
    public Action(String title, int idNumber, String mpaaRating) {
        super(title, idNumber, mpaaRating);
    }

    // Overriding calcLateFees method
    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 3.0;
    }
}
