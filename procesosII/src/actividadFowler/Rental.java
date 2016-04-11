package actividadFowler;

public class Rental {
	Movie movieRental;
	private int rentedDays;

	public Rental(Movie movie, int daysRented) {
		movieRental = movie;
		rentedDays = daysRented;
	}

	public int getDaysRented() {
		return rentedDays;
	}

	public Movie getMovie() {
		return movieRental;
	}

	int getFrequentRenterPoints() {
		return movieRental._price.getFrequentRenterPoints(rentedDays);
	}

	double getCharge() {
		return movieRental._price.getCharge(rentedDays);
	}
}