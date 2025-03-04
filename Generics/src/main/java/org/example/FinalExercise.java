package org.example;

import java.util.ArrayList;
import java.util.List;

public class FinalExercise {

	public void main(String[] args) {

		// you have to implement the other classes such that the following code can run without any error

		Library<Algorithm> library = new Library<>();
		library.add(new SearchAlgorithm());
		library.add(new SortingAlgorithm());
		library.add(new GraphAlgorithm());

		Algorithm item = library.getLast();

		while (item != null) {
			item.execute();
			item = library.getLast();
			library.remove(item);
		}
	}

	static class SearchAlgorithm implements Algorithm {

		@Override
		public void execute() {

		}
	}

	static class SortingAlgorithm implements Algorithm {

		@Override
		public void execute() {

		}
	}

	static class GraphAlgorithm implements Algorithm {

		@Override
		public void execute() {

		}
	}

	static class Library<T extends Algorithm> {

		private final List<T> listItems;

		public Library() {
			listItems = new ArrayList<>();
		}

		public void add(T algorithm) {
			listItems.add(algorithm);
		}

		public T getLast() {
			try {
				return listItems.get(listItems.size() - 1);
			}
			catch (IndexOutOfBoundsException ex) {
				return null;
			}
		}

		public void remove(T item) {
			listItems.remove(item);
		}
	}

	interface Algorithm {
		void execute();
	}
}
