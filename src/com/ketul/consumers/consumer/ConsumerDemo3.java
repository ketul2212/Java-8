package com.ketul.consumers.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Movie {
    private String name;
    private String result;

    public Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}

public class ConsumerDemo3 {
    public static void main(String[] args) {
        List<Movie> list = Arrays.asList(
                new Movie("KGF", "HIT"),
                new Movie("Dhoom", "Floop")
        );

        Consumer<Movie> printMovieName = movie -> System.out.println("Movie Name is " + movie.getName());
        Consumer<Movie> printMovieNameAndRating = movie -> System.out.println("Movie " + movie.getName() + " is " + movie.getResult());
        Consumer<Movie> storeInDB = movie -> {
            System.out.println("Movie " + movie.getName() + "is stored in DB");
            System.out.println("------------------------------------");
        };
        Consumer<Movie> main = printMovieName.andThen(printMovieNameAndRating).andThen(storeInDB);

        for(Movie movie : list)
            main.accept(movie);
    }
}
