package com.careerdevs.moviefactory;

public class Movie {

    public String title;
    public float runtimeInMin;
    public boolean hasBeenReleased;
    public String director;

    public Movie(String title, float runtimeInMin, boolean hasBeenReleased,String director) {
        this.title = title;
        this.runtimeInMin = runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;
        this.director = director;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", runtimeInMin=" + runtimeInMin +
                ", hasBeenReleased=" + hasBeenReleased +
                ", director='" + director + '\'' +
                '}';
    }
}




//title (String) Sing2
//director (String)   Garth Jennings
// runtimeInMin (float) 120 minutes
//hasBeenReleased (boolean) Monday true