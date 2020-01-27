package solid.singleResponsibilityPrinciple.godImplementation;

public class ElevenPercentRule implements CalculationRule {

	@Override
	public double calculates(Employee employee) {
		return employee.getSalary() - (employee.getSalary() * 0.11);
	}

}
