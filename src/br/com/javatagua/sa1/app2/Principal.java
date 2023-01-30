package br.com.javatagua.sa1.app2;

import br.com.javatagua.sa1.bo.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp = JOptionPane.showInputDialog("Data de lançamento do primeiro avião");
		//Convertendo
		int lançamento =Integer.parseInt(resp);
		
		//Criando objeto
		Lançamento abo = new Lançamento();
		
		JOptionPane.showMessageDialog(null,"Idade do primeiro lançamento de avião: " + abo.calcularLancamento(lançamento));
	}

}
