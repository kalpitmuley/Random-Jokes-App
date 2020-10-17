package study.spring5.RandomJokesApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import study.spring5.RandomJokesApp.service.JokeService;

/**
 * @author Kalpit Muley
 */

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @GetMapping
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chuckNorris";

    }
}
