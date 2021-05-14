package com.example.demo.repositories;

import com.example.demo.domain.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface NoteRepo extends CrudRepository<Note,Long> {
    List<Note> findByOrderByTimestampDesc();
}
