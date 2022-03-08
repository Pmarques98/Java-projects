package br.ime.usp.mac321.ex1;

import javax.swing.*;

public class Fatorial extends JFrame {
	public JLabel lblTituloPrograma;
	public JLabel lblValorFatorial;
	public JButton btnCalcular;
	public int n, fatorial;
	
	public JTextField txtValorFatorial;
	
	public Fatorial(){
		
		try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } 
    catch (Exception e) {
    }
				this.setResizable(false);
				this.setTitle("Fatorial");
				this.setBounds(50,50,300,310);
				this.getContentPane().setLayout(null);
				
 

	lblTituloPrograma = new JLabel();
	lblTituloPrograma.setText("Calculadora de Fatorial");
	lblTituloPrograma.setBounds(50,2,190,50);
	this.add(lblTituloPrograma);
	
	lblValorFatorial = new JLabel();
	lblValorFatorial.setText("Resultado ");
	lblValorFatorial.setBounds(10,40,108,50);
	this.add(lblValorFatorial);
	
	txtValorFatorial = new JTextField();
    this.add(txtValorFatorial);
    
    btnCalcular = new JButton();
	btnCalcular.setText("Calcular");
	btnCalcular.setBounds(100, 240, 90, 25);
	this.add(btnCalcular);
	
	btnCalcular.addActionListener(event -> apresentarResultados());
	
 }
	
 private void apresentarResultados() {
	 double valorFatorial= doubleValue(txtValorFatorial);

	 fatorial = 1;
	 
	  n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));  

	for (int cont = 1;cont<=n;cont++){  
         fatorial = fatorial*cont;   
     }  
	valorFatorial = fatorial;
	lblValorFatorial.setText(String.format("%.2f", valorFatorial));
	
	}
 private double doubleValue(JTextField textField) {
	    String text = textField.getText().trim();
	    if (text.isEmpty()) {
	        return 0.0;
	    }
	    return Double.parseDouble(text);
	}
}
	
	
	
	
	
	/**
  **/