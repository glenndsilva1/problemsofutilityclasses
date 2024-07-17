package util;

public class PatternValidator extends StringDeco {
    private String pattern;

    public PatternValidator(StringDeco decoratedValidator, String pattern) {
        super(decoratedValidator);
        this.pattern = pattern;
    }

    @Override
    public boolean validate(String input) {
        return super.validate(input) && input.matches(pattern);
    }
}
