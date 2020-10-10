package _05_netflix;

import javax.swing.JOptionPane;

public class movierunner {
	public static void main(String[] args) {
		Movie movie1 = new Movie("bob's life",1);
		Movie movie2 = new Movie("Kungfu panda",2);
		Movie movie3 = new Movie("toy story",3);
		Movie movie4 = new Movie("The Meg",4);
		Movie movie5 = new Movie("Murder on the oriental express",5);
		movie5.getTicketPrice();
		NetflixQueue bob = new NetflixQueue();
		bob.addMovie(movie1);
		bob.addMovie(movie2);
		bob.addMovie(movie3);
		bob.addMovie(movie4);
		bob.addMovie(movie5);
		bob.printMovies();
		bob.sortMoviesByRating();
		System.out.println("the best movie is " + bob.getBestMovie());
		System.out.println("the best movie is " + bob.getMovie(1));
	}
}
