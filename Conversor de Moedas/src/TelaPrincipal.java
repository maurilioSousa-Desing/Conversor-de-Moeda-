import java.util.Objects;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			
			try {
				
				 EscolheConversor EscolheConversor = new EscolheConversor();
				 EscolheValor EscolheValor = new EscolheValor();
				 
				 double valorSelecionado = EscolheValor.getValor();
				 
				 if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
	                    EscolheMoedas EscolheMoedas = new EscolheMoedas();
	                    new ConverteMoedas(valorSelecionado, EscolheMoedas.getOpcaoSelecionada());
	                } else if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de temperaturas")) {
	                    EscolheTemperaturas EscolheTemperaturas = new EscolheTemperaturas();
	                    new ConverteTemperaturas(valorSelecionado, EscolheTemperaturas.getOpcaoSelecionada());
	                
			 }
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
            new TelaErro("O valor informado � inv�lido!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            new TelaErro("Erro... Digite um valor v�lido!");
        }
			
		}while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);
		JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");

        System.exit(0);
	}

}
