package com.example.demo.controllers;

import com.example.demo.domain.Note;
import com.example.demo.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

  private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("listofnotes",noteService.listOfNotes());
        model.addAttribute("notes",new Note());
        return "/notes";
    }

    @PostMapping("/list")
    public String addNote(@ModelAttribute Note note, Model model){
        model.addAttribute("notes",note);
        noteService.addNote(note);
        return "redirect:/list";
    }

}
