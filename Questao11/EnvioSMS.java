package Questao11;

import java.util.Random;

class EnvioSMS implements EnvioMensagem {
    private String status = "Pendente";

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
        // Simula o envio com uma chance de falha
        if (new Random().nextDouble() < 0.05) {
            this.status = "Falha no envio do SMS.";
            return false;
        }
        this.status = "SMS enviado com sucesso.";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}