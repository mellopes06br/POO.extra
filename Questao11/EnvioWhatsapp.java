package Questao11;

import java.util.Random;

class EnvioWhatsApp implements EnvioMensagem {
    private String status = "Pendente";

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
        // Simula o envio com uma chance de falha
        if (new Random().nextDouble() < 0.08) {
            this.status = "Falha no envio do WhatsApp.";
            return false;
        }
        this.status = "WhatsApp enviado com sucesso.";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}