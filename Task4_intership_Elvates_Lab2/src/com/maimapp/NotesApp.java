package com.maimapp;

import java.util.Scanner;

import com.DTO.NoteDTO;
import com.controller.MyController;

public class NotesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	      MyController myController = new MyController();

		while (true) {
			System.out.println("***********Notes App*************");
			System.out.println(" 1.Add Note \n 2.View Notes \n 3.Exit");
			System.out.println("*********************************");
			System.out.println("Enter Youe Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Title: ");
				String title=sc.next();
				System.out.println("Enter Content: ");
				String content=sc.next();
				String note = myController.addNote(new NoteDTO(title, content));
				System.out.println(note);

				break;
			case 2:
                 myController.viewNotes();
				break;
			case 3:System.out.println("Existing...Thanku You!");
			System.exit(0);

				break;

			default:
				System.out.println("!Invalid Choice!....Please try again");
				
				
			}

		}

	}

}
