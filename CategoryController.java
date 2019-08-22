package com.server.demo.Controller;


import com.server.demo.Models.Category;
import com.server.demo.Repositories.CategoryRepository;
import com.server.demo.Repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "categories")
public class CategoryController {
    private final CategoryRepository categoryRepository;
    private final MovieRepository movieRepository;

    public CategoryController(CategoryRepository categoryRepository, MovieRepository movieRepository) {
        this.categoryRepository = categoryRepository;
        this.movieRepository = movieRepository;
    }

}
