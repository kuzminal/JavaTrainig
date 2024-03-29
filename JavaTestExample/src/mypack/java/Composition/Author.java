package mypack.java.Composition;

public class Author {
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Author(String name, String email) {
		this.email = email;
		this.name = name;
	}
	
	public String toString() {
		return name + ", " + email;
	}

}
