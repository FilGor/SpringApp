package com.example.demo.controllers;

import com.example.demo.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.repositories.NoteRepo;

@Controller
public class NoteController {

  private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping("/list")
    public String getList(Model model){
        model.addAttribute("list",noteService.listOfNotes());
        return "/notes";
    }

}
