package entities;

public abstract class Payers {
	
	protected String name;
	protected Double anual_income;
	
	public Payers() {
		
	}

	public Payers(String name, Double anual_income) {
		super();
		this.name = name;
		this.anual_income = anual_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnual_income() {
		return anual_income;
	}

	public void setAnual_income(Double anual_income) {
		this.anual_income = anual_income;
	}
	
	public abstract double taxPayed();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Taxex payed: " + "\n");
		sb.append(this.name + ": $ " + taxPayed());
		return sb.toString();
	}
}
