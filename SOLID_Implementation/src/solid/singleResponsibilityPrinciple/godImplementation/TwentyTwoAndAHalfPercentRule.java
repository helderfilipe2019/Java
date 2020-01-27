package solid.singleResponsibilityPrinciple.godImplementation;

public class TwentyTwoAndAHalfPercentRule implements CalculationRule {

	@Override
	public double calculates(Employee employee) {

		return employee.getSalary() - (employee.getSalary() * 0.225);

	}

}
