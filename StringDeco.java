package util;

public abstract class StringDeco implements ProperString {
    protected ProperString decoratedValidator;

    public StringDeco(ProperString decoratedValidator) {
        this.decoratedValidator = decoratedValidator;
    }

    @Override
    public boolean validate(String input) {
        return decoratedValidator.validate(input);
    }
    
    public static void main(String args[]) {
    	ProperString p = new ProperBasic();
        StringDeco emailValidator = new EmailValid(p);
        System.out.println("Email Validator:");
        System.out.println(emailValidator.validate("test@example.com"));  // true
        System.out.println(emailValidator.validate("invalid-email"));     // false
        StringDeco emailValidator1 = new PatternValidator(emailValidator,"adf");
        emailValidator1.validate("asdfsd");
        
            // One-line chaining of validators: validate a string with combined rules
            System.out.println(new PatternValidator(
                new EmailValid(
                    new ProperBasic()
                ), "^[a-zA-Z0-9]{5,}$"
            ).validate("test@example.com")); // true
        }
}
