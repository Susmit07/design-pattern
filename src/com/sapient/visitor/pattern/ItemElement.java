package com.sapient.visitor.pattern;

public interface ItemElement {
	
	int accept(ShoppingCartVisitor visitor);

}
