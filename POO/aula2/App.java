public class App{
    public static void main(String args[]){
        Placa p1 = new Placa("Brasil","ABC1R23");
        Veiculo v1 = new Veiculo(p1, 40.0);

        Placa p2 = new Placa("Brasil", "ABC1R24");
        Veiculo v2 = new Veiculo(p2, 50.0);

        Placa p3 = new Placa("Brasil", "ABC1R25");
        Veiculo v3 = new Veiculo(p3, 60.0);
        
        Placa p4 = new Placa("Brasil", "ABC1R26");
        Veiculo v4 = new Veiculo(p4, 70.0);
        
        Placa p5 = new Placa("Brasil", "ABC1R27");
        Veiculo v5 = new Veiculo(p5, 80.0);

        Veiculo[] arrVeiculos = new Veiculo[5];
        arrVeiculos[0] = v1;
        arrVeiculos[1] = v2;
        arrVeiculos[2] = v3;
        arrVeiculos[3] = v4;
        arrVeiculos[4] = v5;

        0

        // Veiculo v = new Veiculo(p1);
        // System.out.println("Dados do veiculo antes de abastecer:");
        // System.out.println(v);
        // System.out.println("----------------");

        // v.abastece(65);
        // System.out.println("Dados do veiculo depois de abastecer:");
        // System.out.println(v);
        // System.out.println("----------------");

        // v.dirige(250);
        // System.out.println("Dados do veiculo depois de percorrer 250Km:");
        // System.out.println(v);
        // System.out.println("----------------");
    }
}