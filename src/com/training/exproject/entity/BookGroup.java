package com.training.exproject.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookGroup {

	private List<Book2> books;

	public BookGroup() {
		books = new ArrayList<Book2>();
	}

	public void add(Book2 bb) {
		books.add(bb);
	}

	public List<Book2> getBooks() {
		return books;
	}

	public void setBooks(List<Book2> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookGroup other = (BookGroup) obj;
		return Objects.equals(books, other.books);
	}

}
