package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "星际穿越", 9.6, "安妮");
        Movie m = new Movie(2, "速度与激情7", 9.8, "凯特");
        movies[1] = m;
        movies[2] = new Movie(3, "速度与激情8", 9.8, "凯特");
        movies[3] = new Movie(4, "速度与激情9", 9.8, "凯特");
        movies[4] = new Movie(5, "速度与激情10", 9.8, "凯特");
        movies[5] = new Movie(6, "速度与激情11", 9.8, "凯特");

        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieBiId();
    }
}
