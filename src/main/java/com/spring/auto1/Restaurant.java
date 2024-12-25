package com.spring.auto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	@Autowired
	@Qualifier("indian")
	private IMenu menu;

	public void setMenu(IMenu menu) {
		this.menu = menu;
	}
	
	@Autowired
	private IMenu chinese;
	
	private IMenu imenu;

	public Restaurant(@Qualifier("italian") IMenu imenu) {
		super();
		this.imenu = imenu;
	}
	
	public List<String> allItems(String choice){
		if(choice.equals("in"))
			return menu.itemsAvailable();
		if(choice.equals("c"))
			return chinese.itemsAvailable();
		if(choice.equals("it"))
			return imenu.itemsAvailable();
		
		return null;
	}

}
