
import javax.swing.JOptionPane;

public class ConverteMoedas extends Conversor {

    public ConverteMoedas(double valor, String op) {
        converter(valor, op);

        String msg = String.format("O valor convertido é de %s %.2f", super.simboloConversao, super.valorConvertido);

        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {


    	//Cotação do dia 02/02/2023
        switch (op) {
            case "De Reais a Dólares":	
                super.simboloConversao = "U$";
                super.valorConvertido = valor / 5.20;
                
            case "De Reais a Euros":
                super.simboloConversao = "€";
                super.valorConvertido = valor / 5.53;
            
            case "De Reais a Libras Esterlinas":
                super.simboloConversao = "£";
                super.valorConvertido = valor / 6.25;
            
            case "De Reais a Peso argentino":
                super.simboloConversao = "$";
                super.valorConvertido = valor / 0.026;
            
            case "De Reais a Peso Chileno":
                super.simboloConversao = "CLP";
                super.valorConvertido = valor / 0.0065;
            
            case "De Dólares a Reais":
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.20;
            
            case "De Euros a Reais":
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.53;
            
            case "De Libras Esterlinas a Reais":
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 6.25;
            
            case "De Peso argentino a Reais":
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.026;
            
            case "De Peso Chileno a Reais":
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.0065;
            
        }
    }
}