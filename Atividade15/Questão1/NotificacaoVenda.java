package Atividade15.Questão1;

public interface NotificacaoVenda {
    void enviarConfirmacao(String produto, String cliente, int quantidade);
    void enviarRecibo();
}