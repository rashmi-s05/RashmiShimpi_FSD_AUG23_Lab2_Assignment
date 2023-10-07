package com.gl.labsession2.notecount.main;

import java.util.Scanner;

import com.gl.labsession2.notecount.service.MergeSortImplementation;
import com.gl.labsession2.notecount.service.NotesCounts;

public class NoteCountDriver {

	public static void main(String[] args) {

		MergeSortImplementation mergesortImplement = new MergeSortImplementation();
		NotesCounts noteCount = new NotesCounts();

		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("enter the currency denomination value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergesortImplement.sort(notes, 0, notes.length - 1);
		noteCount.NotesCountImplement(notes, amount);

		sc.close();
	}
}
