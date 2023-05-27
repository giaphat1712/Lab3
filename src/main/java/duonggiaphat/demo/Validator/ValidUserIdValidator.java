package duonggiaphat.demo.Validator;

import duonggiaphat.demo.Validator.anonation.ValidUserId;
import duonggiaphat.demo.entity.User;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() !=null;

    }
}
