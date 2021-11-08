package com.lab.forward.search.repository;

import com.lab.forward.search.entity.NoteBook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPARepository for NoteBook
 */

@Repository
public interface NoteBookRepository extends JpaRepository<NoteBook, Long>{
    
}
