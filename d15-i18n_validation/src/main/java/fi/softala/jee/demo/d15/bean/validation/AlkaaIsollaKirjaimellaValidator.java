package fi.softala.jee.demo.d15.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AlkaaIsollaKirjaimellaValidator implements
		ConstraintValidator<AlkaaIsollaKirjaimella, String> {

	public void initialize(AlkaaIsollaKirjaimella alkaaIsollaKirjaimella) {

	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.length() == 0) {
			return true;
		}else if(Character.isUpperCase(value.charAt(0))) {
			return true;
		}
		return false;
	}
}