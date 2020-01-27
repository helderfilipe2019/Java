package solid.openClosePrinciple.godImplementation;

public class PriceCalculator {

	private PriceTable table;
	private FreightService freight;

	public PriceCalculator(PriceTable table, FreightService freight) {
		this.table = table;
		this.freight = freight;
	}

	public double calculates(Product product) {
		double discount = table.calculatesDiscount(product.getValue());
		double freightValue = frete.calculatesFreight(product.getState());
		return product.getValue() * (1 - discount) + freightValue;
	}

}
