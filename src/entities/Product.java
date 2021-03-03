package entities;

public class Product {

	private String name;
	private Double value;
	private Integer qt;
	
	public Product(String name, Double value, int qt) {
		this.name = name;
		this.value = value;
		this.qt = qt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public Integer getQt() {
		return qt;
	}
	
	public Double getTotalValue() {
		return value * qt;
	}
}
