package com.lab.forward.search.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * note_book is the table where the notes will be stored in the H2 database
 */
@Entity
@Table(name = "note_book")
public class NoteBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 3447)
    private String text;

    public NoteBook(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public NoteBook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Search [id=" + id + ", text=" + text + "]";
    }

}
