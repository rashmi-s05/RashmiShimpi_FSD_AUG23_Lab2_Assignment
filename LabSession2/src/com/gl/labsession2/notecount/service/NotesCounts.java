package com.gl.labsession2.notecount.service;

public class NotesCounts {

	public void NotesCountImplement(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];

		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];

					if (amount == 0) {
						break;
					}
				}
			}

			if (amount > 0) {
				System.out.println("Exact amount cannot be given with highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + " : " + notesCounter[i]);
					}
				}
			}

		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}
}
