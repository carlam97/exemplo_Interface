public class Carro implements Motor, Veiculo{


    @Override
    public String getFabricante() {
        return "Wolks";
    }

    @Override
    public String getModelo() {
        return "New Beetle";
    }

    @Override
    public int getId() {
        return 7;
    }

    @Override
    public String getNome() {
        return "Fusca";
    }
}
