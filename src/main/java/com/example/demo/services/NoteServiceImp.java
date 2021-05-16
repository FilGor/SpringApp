package com.example.demo.services;

import com.example.demo.domain.Note;
import com.example.demo.repositories.NoteRepo;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Repository
public class NoteServiceImp implements NoteService {


    private final NoteRepo noteRepo;

    public NoteServiceImp(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    @Override
    public List<Note> listOfNotes() {
        return noteRepo.findByOrderByTimestampDesc();
    }

    @Override
    public void addNote(Note n) {
        n.setTimestamp(new Timestamp(System.currentTimeMillis()));
        noteRepo.save(n);
    }
}
