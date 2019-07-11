package mypack.java.Composition;

public class TestBook {
	public static void main(String[] args) {
		
		Author Ivanov = new Author("Иван Иванов", "ivanov@nikuda.com");
		System.out.println(Ivanov);
		
		Book dummyBook = new Book("Java для чайников", Ivanov, 200, 99);
		System.out.println(dummyBook);
		
		dummyBook.setPrice(300.75);
		dummyBook.setQty(88);
		
		System.out.println(dummyBook);
		
		System.out.println("Название: " + dummyBook.getName());
		System.out.println("Цена: " + dummyBook.getPrice());
		System.out.println("Количество: " + dummyBook.getQty());
		System.out.println("Автор: " + dummyBook.getAuthor());
		System.out.println("Имя автора: " + dummyBook.getAuthor().getName());
		System.out.println("Email автора: " + dummyBook.getAuthor().getName());
		
		Book moreDummyBook  = new Book("Java для опытных", new Author("Петров Петр", "petrov@nikuda.com"), 19.99, 8);
		System.out.println(moreDummyBook);
	}

}
