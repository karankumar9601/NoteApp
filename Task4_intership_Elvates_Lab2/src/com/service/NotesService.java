package com.service;

import java.util.List;

import com.DTO.NoteDTO;

public interface NotesService {
	public String saveNote(NoteDTO noteDTO);
	public List<NoteDTO> getAllContent();

}
