package it.polito.tdp.parole.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Parole {
	
	//private String word;
	private List<String> parole;
		
	public Parole() {
		parole = new ArrayList<String>();
		//TODO
	}
	
	public void addParola(String p) {
		parole.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		List<String> temp = new ArrayList<String>();
		for(String ss : parole) {
			temp.add(ss);
		}
		Collections.sort(temp, new ComparatoreAlfabetico());
		//TODO
		return temp;
	}
	
	public void reset() {
		parole.clear();
		// TODO
	}
	
	public void cancel(String s) {
		this.parole.remove(s);
	}

	@Override
	public String toString() {
		return "" + parole.toString();
	}
	
	

}
