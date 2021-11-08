package com.lab.forward.search.component;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * This component is to hold the result
 * of the given word to search in the notebook
 */
@Component
public class SearchParam {
    private Long frequency;
    private List<String> words;

    public SearchParam(Long frequency, List<String> words) {
        this.frequency = frequency;
        this.words = words;
    }

    public SearchParam() {
    }

    public Long getFrequency() {
        return frequency;
    }

    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "SearchParam [frequency=" + frequency + ", words=" + words + "]";
    }

}
