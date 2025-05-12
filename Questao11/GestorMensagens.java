package Questao11;

class GestorMensagens {
    public void enviarMensagem(EnvioMensagem envio, String mensagem) {
        System.out.println("Tentando enviar mensagem...");
        boolean sucesso = envio.enviar(mensagem);
        System.out.println("Status do envio: " + envio.obterStatus());
        if (sucesso) {
            System.out.println("Mensagem enviada com sucesso por " + envio.getClass().getSimpleName() + ".");
        } else {
            System.out.println("Falha ao enviar mensagem por " + envio.getClass().getSimpleName() + ".");
        }
    }

    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        EnvioEmail email = new EnvioEmail();
        gestor.enviarMensagem(email, "Olá por e-mail!");

        System.out.println("\n---");

        EnvioSMS sms = new EnvioSMS();
        gestor.enviarMensagem(sms, "Olá por SMS!");

        System.out.println("\n---");

        EnvioWhatsApp whatsapp = new EnvioWhatsApp();
        gestor.enviarMensagem(whatsapp, "Olá por WhatsApp!");
    }
}