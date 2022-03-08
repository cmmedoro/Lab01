package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Words {
		private List<String> parole;
			
		public Words() {
			parole = new ArrayList<String>();
		}
		
		public void addParola(String p) {
			parole.add(p);
		}
		
		public List<String> getElenco() {
			List<String> temp = new ArrayList<String>();
			for(String ss : parole) {
				temp.add(ss);
			}
			Collections.sort(temp, new ComparatoreAlfabetico());
			return temp;
		}
		
		public void reset() {
			parole.clear();
		}
		
		public void cancel(String s) {
			this.parole.remove(s);
		}

		@Override
		public String toString() {
			return "" + parole.toString();
		}
}
