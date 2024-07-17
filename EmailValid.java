package util;

import java.util.regex.Pattern;

public class EmailValid extends StringDeco {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	public EmailValid(ProperString decoratedValidator) {
		super(decoratedValidator);
	}
	
	@Override
    public boolean validate(String input) {
        return super.validate(input) && pattern.matcher(input).matches();
    }
}
