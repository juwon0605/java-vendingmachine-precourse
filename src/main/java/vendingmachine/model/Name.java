package vendingmachine.model;

import java.util.Objects;

public class Name {

	public String name;

	public Name(String input) {
		checkInput(input);
		name = input;
	}

	private void checkInput(String input) {

	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}

		if (!(other instanceof Name)) {
			return false;
		}

		Name name2 = (Name)other;
		return name.equals(name2.toString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
