package com.dvdstore.dvd.web.controller;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    @RequestMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome() {
    return movieServiceInterface.getMovieList();
    }


}
