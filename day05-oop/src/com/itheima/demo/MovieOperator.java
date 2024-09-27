package com.itheima.demo;

import java.util.Scanner;

public class MovieOperator {

    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        System.out.println("---------------");
        System.out.println("电影编号\t\t电影名称\t\t主演\t\t类型\t\t上映时间\t\t评分");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t\t" + m.getName() + "\t\t" + m.getActor());

        }
    }

    public void searchMovieBiId() {
        System.out.println("请输入要查询的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t\t" + m.getName() + "\t\t" + m.getActor());
                return;
            }

        }
        System.out.println("没有找到该电影");
    }
}
