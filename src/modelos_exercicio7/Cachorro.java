package modelos_exercicio7;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("AUAU");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando rabo");
    }
}
