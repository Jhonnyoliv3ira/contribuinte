package entities;

public class Company extends Payers {
	
	protected Integer num_employee;
	
	public Company() {
		
	}

	
	public Company(String name, Double anual_income, Integer num_employee) {
		super(name, anual_income);
		this.num_employee = num_employee;
	}


	public Integer getNum_employee() {
		return num_employee;
	}

	public void setNum_employee(Integer num_employee) {
		this.num_employee = num_employee;
	}

	@Override
	public double taxPayed() {
		
		if (this.num_employee > 10) {
			return super.anual_income * 0.14;
		} else {
			return super.anual_income * 0.16;
		}
		
	}

}
