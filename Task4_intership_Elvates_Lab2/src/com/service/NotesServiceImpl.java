package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.DTO.NoteDTO;

public class NotesServiceImpl implements NotesService {
	private static final String FILE_PATH = "D:\\java notes app\\data\\notes.text";

	@Override
	public String saveNote(NoteDTO noteDTO) {
		File file = new File(FILE_PATH);
		System.out.println("File Saved At :" + file.getAbsolutePath());
		try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
			writer.write(noteDTO.getTitle() + "::" + noteDTO.getContent() + System.lineSeparator());
		} catch (Exception e) {
			System.out.println("Error");
		}

		return "Save successfully";
	}

	@Override
	public List<NoteDTO> getAllContent() {

		List<NoteDTO> note = new ArrayList<NoteDTO>();
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split("::", 2);
				if (parts.length == 2) {
					note.add(new NoteDTO(parts[0], parts[1]));
				}

			}

		} catch (Exception e) {
           System.out.println("Error");
		}

		return note;
	}

}
