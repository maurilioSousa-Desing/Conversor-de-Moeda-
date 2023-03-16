import javax.swing.JOptionPane;


public class EscolheMoedas {

    private final String opcaoSelecionada;

    public EscolheMoedas() {
        String[] opcoes = {
                "De Reais a D�lares",
                "De Reais a Euros",
                "De Reais a Libras Esterlinas",
                "De Reais a Peso argentino",
                "De Reais a Peso Chileno",
                "De D�lares a Reais",
                "De Euros a Reais",
                "De Libras Esterlinas a Reais",
                "De Peso argentino a Reais",
                "De Peso Chileno a Reais"
        };
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a moeda para qual voc� deseja girar seu dinheiro:",
                "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcaoSelecionada;
    }
}