package Collections;

import java.util.Objects;

public class User {

	String Name;

	User(String Name){
		
		this.Name = Name;
	}
	
	@Override
 
	public String toString() {

		return "Nome inserido: " + this.Name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Name, other.Name);
	}
	
	
}
