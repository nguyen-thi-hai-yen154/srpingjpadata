package com.jpa.demospringjpa.model;

public class ProductForm {
	private String name;

	public ProductForm() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public ProductForm(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductForm [name=" + name + ", getName()=" + getName() + "]";
	}

}
