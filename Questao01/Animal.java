/*
 * Questão 01: 
 * 
 • Crie uma hierarquia básica de classes para representar diferentes tipos de
animais.

• Crie a classe base Animal com o método som(), que imprime uma
mensagem dizendo que o animal emite um som genérico.

• Crie duas subclasses: Cachorro e Gato. Cada uma deve sobrescrever o
método som() para emitir o som específico do animal (por exemplo, "O
cachorro faz: Au Au").

• Implemente uma classe Zoologico que instancie um cachorro e um gato, e
faça cada um emitir seu som chamando o método som().

• Crie uma Main para testar e manipular todos os objetos citados
anteriormente.
 */

public class Animal {
    
    public Animal(){
    }

    public void emitirSom(){
        System.out.println("O animal emite um som genérico.");
    }
}