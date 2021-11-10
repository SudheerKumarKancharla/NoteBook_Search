package com.lab.forward.search.controller;

import com.lab.forward.search.component.SearchParam;
import com.lab.forward.search.entity.NoteBook;
import com.lab.forward.search.service.NoteBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for NoteBook Handles operations related to notes i.e., Notes
 * update
 */
@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class NoteBookController {

    @Autowired
    private NoteBookService noteBookService;

    @PutMapping(path = "/notes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteBook update(@RequestBody NoteBook notes) {
        return noteBookService.updateNotes(notes);
    }

    @GetMapping(path = "/notes")
    public NoteBook getNotes() {
        return noteBookService.getNotesFromDB();
    }

    @GetMapping("/notes/{param}")
    public SearchParam find(@PathVariable(value = "param") String param) {

        SearchParam result = new SearchParam();
        result.setFrequency(noteBookService.findFrequency(param));
        result.setWords(noteBookService.findSimilarWords(param));

        return result;
    }

}
