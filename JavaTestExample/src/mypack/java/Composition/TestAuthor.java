package mypack.java.Composition;

public class TestAuthor {
	public static void main(String[] args) {
		Author Ivanov = new Author("Ivanov", "ivan@nikuda.com");
		System.out.println(Ivanov);
		
		Ivanov.setEmail("ivan@nikuda.com");
		System.out.println(Ivanov);
		System.out.println("имя : " + Ivanov.getName());
		System.out.println("email : " + Ivanov.getEmail());
	}

}
