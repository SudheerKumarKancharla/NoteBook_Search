package com.lab.forward.search.controller;

import com.lab.forward.search.component.SearchParam;
import com.lab.forward.search.service.NoteBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to Search the word
 * in the notes
 */
@RestController
@RequestMapping("/v1")
public class SearchController {

    @Autowired
    private NoteBookService noteBookService;

    @GetMapping("/search/{param}")
    public SearchParam find(@PathVariable(value = "param") String param) {

        SearchParam result = new SearchParam();
        result.setFrequency(noteBookService.findFrequency(param));
        result.setWords(noteBookService.findSimilarWords(param));

        return result;
    }
}
