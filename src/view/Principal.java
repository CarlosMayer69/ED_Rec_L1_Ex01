package view;

import javax.swing.JOptionPane;

import controller.SomaNatRecController;

public class Principal {

	public static void main(String[] args) {
		int limite =
		    Integer.parseInt(JOptionPane.showInputDialog
		    		(null, "Digite um número: "));
		
		SomaNatRecController sn = new SomaNatRecController();
		int soma = sn.somaNaturais(limite);
		System.out.println(soma);
	}

}


