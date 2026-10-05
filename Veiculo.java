public class Veiculo {
    protected String marca;
    protected String modelo;

public Veiculo(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
}

public void buzinar(){ System.out.println("Bi bi!");}

public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("Toyota", "Corolla");

        System.out.println("Veículo criado: " + meuCarro.marca + " " + meuCarro.modelo);
        
        System.out.print("Chamando a buzina: ");
        meuCarro.buzinar();
    }
}
