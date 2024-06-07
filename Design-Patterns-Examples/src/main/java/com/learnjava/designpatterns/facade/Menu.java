package com.learnjava.designpatterns.facade;

import java.util.Map;
import java.util.Map.Entry;

public class Menu {

	private Map<String, Integer> items;
	
	public Menu(Map<String, Integer> items) {
		this.items = items;
	}

	public Map<String, Integer> getItems() {
		return items;
	}

	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		
		StringBuffer itemsList = new StringBuffer();

		for(Map.Entry<String, Integer> map : items.entrySet()) {
			itemsList.append(map.getKey() + "    " + map.getValue());
		}
		
		return itemsList.toString();
	}
	
	
}
