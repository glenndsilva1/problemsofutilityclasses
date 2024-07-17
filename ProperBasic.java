package util;

public class ProperBasic implements ProperString{
	@Override
	public boolean validate(String input) {
		return input != null && !input.trim().isEmpty();
	}
}
