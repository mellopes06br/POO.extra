package Questao11;

import java.util.Random;

class EnvioEmail implements EnvioMensagem {
    private String status = "Pendente";

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
        // Simula o envio com uma chance de falha
        if (new Random().nextDouble() < 0.1) {
            this.status = "Falha no envio do e-mail.";
            return false;
        }
        this.status = "E-mail enviado com sucesso.";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}