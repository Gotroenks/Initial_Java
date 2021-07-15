package Class;

public class Users {

	String Name, Email;

	public boolean equals(Object object) {

		if (object instanceof Users) {
			Users Other = (Users) object;

			boolean NameEquals = Other.Name.equals(this.Name);
			boolean EmailEquals = Other.Email.equals(this.Email);

			return NameEquals && EmailEquals;
		}
		else {
			
			return false;
		}
	}
}
