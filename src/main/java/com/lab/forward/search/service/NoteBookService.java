package com.lab.forward.search.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.lab.forward.search.entity.NoteBook;
import com.lab.forward.search.repository.NoteBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteBookService {

    @Autowired
    private NoteBookRepository noteRepo;

    /**
     * Saves the notes in to db
     * 
     * @param notes String
     * @return NoteBook object which was updated
     */
    public NoteBook updateNotes(NoteBook notes) {
        NoteBook note = noteRepo.findAll().get(0);

        note.setText(notes.getText());
        noteRepo.save(note);
        return notes;
    }

    /**
     * Finds frequency of the given word
     * 
     * @param param String
     * @return Count of the given word
     */
    public Long findFrequency(String param) {

        var notes = noteRepo.findAll().get(0).getText();

        String[] words = notes.split(" ");

        var count = Stream.of(words).filter(word -> word.equals(param)).count();

        return count;
    }

    /**
     * Finds similar words
     * 
     * @param param String
     * @return List of similar words
     */
    public List<String> findSimilarWords(String param) {
        var notes = noteRepo.findAll().get(0).getText();

        String[] words = notes.split(" ");

        return Stream.of(words).filter(word -> !word.equals(param))
                .filter(word -> getLevenshteinDistance(word, param) <= 1).collect(Collectors.toList());
    }

    /**
     * Finds LevenshteinDistance between two strings
     * 
     * @param s String
     * @param t String
     * @return Distance between two strings
     */
    public static int getLevenshteinDistance(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }

        int n = s.length(); // length of s
        int m = t.length(); // length of t

        if (n == 0) {
            return m;
        } else if (m == 0) {
            return n;
        }

        if (n > m) {
            // swap the input strings to consume less memory
            String tmp = s;
            s = t;
            t = tmp;
            n = m;
            m = t.length();
        }

        int p[] = new int[n + 1]; // 'previous' cost array, horizontally
        int d[] = new int[n + 1]; // cost array, horizontally
        int _d[]; // placeholder to assist in swapping p and d

        // indexes into strings s and t
        int i; // iterates through s
        int j; // iterates through t

        char t_j; // jth character of t

        int cost; // cost

        for (i = 0; i <= n; i++) {
            p[i] = i;
        }

        for (j = 1; j <= m; j++) {
            t_j = t.charAt(j - 1);
            d[0] = j;

            for (i = 1; i <= n; i++) {
                cost = s.charAt(i - 1) == t_j ? 0 : 1;
                // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
                d[i] = Math.min(Math.min(d[i - 1] + 1, p[i] + 1), p[i - 1] + cost);
            }

            // copy current distance counts to 'previous row' distance counts
            _d = p;
            p = d;
            d = _d;
        }

        // our last action in the above loop was to switch d and p, so p now
        // actually has the most recent cost counts
        return p[n];
    }

    public NoteBook getNotesFromDB() {
        NoteBook notes = noteRepo.findAll().get(0);
        return notes;
    }
}
