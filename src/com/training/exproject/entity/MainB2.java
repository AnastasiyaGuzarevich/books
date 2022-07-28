package com.training.exproject.entity;

import java.util.List;

//Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод equals. hashCode, toString().
// Создать второй класс, агрегирующий(включающий) список типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

// Найти и вывести: 
// a) список книг заданного автора; 
// b) список книг, выпущенных заданным издательством; 
// c) список книг, выпущенных после заданного года.

public class MainB2 {

	public static void main(String[] args) {
		
		BookGroup group = new BookGroup();
		
		group.add(new Book2(1234, "Les", "Petrov", "Luch", 1992, 35, 25, "tverduy"));
		group.add(new Book2(2121, "Ozero", "Petrov", "Zvezda", 2002, 100, 11, "tverduy"));
		group.add(new Book2(3232, "Reka", "Ivanov", "Zvezda", 1990, 25, 7, "myagkiy"));
		group.add(new Book2(1111, "Derevnya", "Ivanov", "Luch", 2001, 95, 52, "myagkiy"));
		group.add(new Book2(2222, "Gorod", "Sidorov", "Luch", 2001, 88, 12, "myagkiy"));
		group.add(new Book2(4545, "Pole", "Sidorov", "Zvezda", 2005, 75, 25, "tverduy"));
		
				
		BookLogic logic = new BookLogic();
		
		List<Book2> result1 = logic.listIvanovIsAutor(group.getBooks());
		List<Book2> result2 = logic.listPetrovIsAutor(group.getBooks());
		List<Book2> result3 = logic.listLuchPublisher(group.getBooks());
		List<Book2> result4 = logic.listYearBook(group.getBooks());
		
		BookView view = new BookView();
					
		view.printIvanovBooks(result1);
		view.printPetrovBooks(result2);
		view.printLuchBooks(result3);
		view.printNewBooks(result4);

	}

	

}
