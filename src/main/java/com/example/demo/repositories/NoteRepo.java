package com.example.demo.repositories;

import com.example.demo.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NoteRepo extends JpaRepository<Note, Long> {
    List<Note> findByOrderByTimestampDesc();
}
