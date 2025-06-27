package com.controller;

import java.util.List;

import com.DTO.NoteDTO;
import com.service.NotesService;
import com.service.NotesServiceImpl;

public class MyController {
	
	private static final NotesService noteService=new NotesServiceImpl();

	public String addNote(NoteDTO noteDTO) {
		
           return noteService.saveNote(noteDTO);
	}

	public void viewNotes() {
		List<NoteDTO> allContent = noteService.getAllContent();
		if (allContent.isEmpty()) {
			System.out.println("No notes found.");
		} else {
			System.out.println("Saved Notes");
for (NoteDTO noteDTO : allContent) {
	System.out.println(noteDTO);
	
}
		}
		

	}

}
