package entities;

public class Individual extends Payers {

	protected Double gasto;

	public Individual() {

	}

	public Individual(String name, Double anual_income, Double gasto) {
		super(name, anual_income);
		this.gasto = gasto;
	}

	public Double getGasto() {
		return gasto;
	}

	public void setGasto(Double gasto) {
		this.gasto = gasto;
	}

	@Override
	public double taxPayed() {
		double pay = 0;
		if (getAnual_income() < 20000) {
			pay = getAnual_income() * 15 / 100;

		} else if (getAnual_income() >= 20000) {
			pay = getAnual_income() * 25 / 100;
		}

		pay = pay - this.gasto / 2;
		return pay;
	}

}
