package com.lab.forward.search.controller;

import com.lab.forward.search.entity.NoteBook;
import com.lab.forward.search.service.NoteBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for NoteBook
 * Handles operations related to notes
 * i.e., Notes update
 */
@RestController
@RequestMapping("/v1")
public class NoteBookController {

    @Autowired
    private NoteBookService noteBookService;

    @PutMapping(path = "/notes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteBook update(@RequestBody NoteBook notes) {
        return noteBookService.updateNotes(notes);
    }

}
