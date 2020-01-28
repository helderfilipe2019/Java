package solid.liskovSubstitution.badImplementation;

public class PayrollAccount extends CommonBankAccount {

	public void income() {
		throw new IllegalArgumentException("This account has no income");
	}

}
