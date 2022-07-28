package com.training.exproject.entity;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

	public boolean ivanovIsAutor(Book2 b) {
		String nameAuthor = b.getNameAuthor();

		if (nameAuthor == "Ivanov") {
			return true;
		}
		return false;
	}

	public boolean petrovIsAutor(Book2 b) {
		String nameAuthor = b.getNameAuthor();

		if (nameAuthor == "Petrov") {
			return true;
		}
		return false;
	}

	public boolean luchPublisher(Book2 b) {
		String namePublisher = b.getNamePublisher();

		if (namePublisher == "Luch") {
			return true;
		}
		return false;
	}

	public boolean yearBook(Book2 b) {
		int yearPublishing = b.getYearPublishing();

		if (yearPublishing > 2000) {
			return true;
		}
		return false;
	}

	public List<Book2> listIvanovIsAutor(List<Book2> b) {
		List<Book2> result = new ArrayList<Book2>();

		for (Book2 bb : b) {
			if (ivanovIsAutor(bb)) {
				result.add(bb);
			}
		}
		return result;
	}

	public List<Book2> listPetrovIsAutor(List<Book2> b) {
		List<Book2> result = new ArrayList<Book2>();

		for (Book2 bb : b) {
			if (petrovIsAutor(bb)) {
				result.add(bb);
			}
		}
		return result;
	}

	public List<Book2> listLuchPublisher(List<Book2> b) {
		List<Book2> result = new ArrayList<Book2>();

		for (Book2 bb : b) {
			if (luchPublisher(bb)) {
				result.add(bb);
			}
		}
		return result;
	}

	public List<Book2> listYearBook(List<Book2> b) {
		List<Book2> result = new ArrayList<Book2>();

		for (Book2 bb : b) {
			if (yearBook(bb)) {
				result.add(bb);
			}
		}
		return result;
	}
}
