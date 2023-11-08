public class App {
    public static void main(String[] args) throws Exception {
        // Produto<Integer> p1 = new Produto<Integer>("Geladeira", 2000);
        // Produto<Double> p2 = new Produto<Double>("Fogao", 1380.7);

        // System.out.println(p1);
        // System.out.println(p2);

        MinhaLista<Integer> l1 = new MinhaLista<>();
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);

        System.out.println(l1);

        MinhaLista<Produto<Integer>> l2 = new MinhaLista<>();
        l2.add(new Produto<Integer>("Fogao", 2000));
        l2.add(new Produto<Integer>("Cozinha", 4000));

        System.out.println(l2);
    }
}
