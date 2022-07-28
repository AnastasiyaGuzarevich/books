package com.training.exproject.entity;

import java.util.Objects;

// Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод equals. hashCode, toString().
// Создать второй класс, агрегирующий(включающий) список типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

// Найти и вывести: 
// a) список книг заданного автора; 
// b) список книг, выпущенных заданным издательством; 
// c) список книг, выпущенных после заданного года.

public class Book2 {

	private int id;
	private String title;
	private String nameAuthor;
	private String namePublisher;
	private int yearPublishing;
	private int numberPages;
	private int price;
	private String typeBinding;

	public Book2() {

		id = 0;
		title = "";
		nameAuthor = "";
		namePublisher = "";
		yearPublishing = 0;
		numberPages = 0;
		price = 0;
		typeBinding = "";
	}

	public Book2(int id, String title, String nameAuthor, String namePublisher, int yearPublishing, int numberPages,
			int price, String typeBinding) {
		this.id = id;
		this.title = title;
		this.nameAuthor = nameAuthor;
		this.namePublisher = namePublisher;
		this.yearPublishing = yearPublishing;
		this.numberPages = numberPages;
		this.price = price;
		this.typeBinding = typeBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public String getNamePublisher() {
		return namePublisher;
	}

	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nameAuthor, namePublisher, numberPages, price, title, typeBinding, yearPublishing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book2 other = (Book2) obj;
		return id == other.id && Objects.equals(nameAuthor, other.nameAuthor)
				&& Objects.equals(namePublisher, other.namePublisher) && numberPages == other.numberPages
				&& price == other.price && Objects.equals(title, other.title)
				&& Objects.equals(typeBinding, other.typeBinding) && yearPublishing == other.yearPublishing;
	}

}
