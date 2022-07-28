package com.training.exproject.entity;

import java.util.List;

public class BookView {

	public void printIvanovBooks(List<Book2> b) {
		for (Book2 bb : b) {
			System.out.println("Title book: <" + bb.getTitle() + ">\t Name author: " + bb.getNameAuthor());
		}
		System.out.println();
	}

	public void printPetrovBooks(List<Book2> b) {
		for (Book2 bb : b) {
			System.out.println("Title book: <" + bb.getTitle() + ">\t Name author: " + bb.getNameAuthor());
		}
		System.out.println();
	}

	public void printLuchBooks(List<Book2> b) {
		for (Book2 bb : b) {
			System.out.println("Title book: <" + bb.getTitle() + ">\t Publisher: " + bb.getNamePublisher());
		}
		System.out.println();
	}

	public void printNewBooks(List<Book2> b) {
		for (Book2 bb : b) {
			System.out.println("Title book: <" + bb.getTitle() + ">\t Year of publishing: " + bb.getYearPublishing() + " year");
		}
		System.out.println();
	}

}
