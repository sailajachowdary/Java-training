package Day2Assignments;

class Movie {
    private String mpaaRating;
    private int idNumber;
    private String title;

    // Constructor
    public Movie(String title, int idNumber, String mpaaRating) {
        this.title = title;
        this.idNumber = idNumber;
        this.mpaaRating = mpaaRating;
    }

    // Accessor methods
    public String getMpaaRating() {
        return mpaaRating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    // Mutator methods
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        return idNumber == movie.idNumber;
    }

    // calcLateFees method (default implementation)
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}
