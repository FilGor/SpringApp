package com.example.demo.services;

import com.example.demo.domain.Note;

import java.util.List;

public interface NoteService {
    List<Note> listOfNotes();
    void addNote(Note n);
}
