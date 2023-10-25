import java.util.Iterator;

public class MinhaLista<T> {
    class Nodo<D> {
        public D dado;
        public Nodo<D> prox;

        public Nodo(D dado) {
            this.dado = dado;
            this.prox = null;
        }
    }

    class Iterador<I> implements Iterator<I> {
        private Nodo<I> cursor;

        public Iterador() {
            cursor = (MinhaLista<T>.Nodo<I>) prim;
        }

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public I next() {
            I dado = cursor.
        }

    }

    private Nodo<T> prim;
    private Nodo<T> ult;

    public MinhaLista() {
        this.prim = null;
        this.ult = null;
    }

    public void add(T dado) {
        Nodo<T> novo = new Nodo<T>(dado);
        if (this.prim == null) {
            this.prim = novo;
            this.ult = novo;
        } else {
            ult.prox = novo;
            this.ult = novo;
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        Nodo<T> aux = prim;

        while(aux != null) {
            str.append("[" + aux.dado + "]");
            aux = aux.prox;
        }

        return str.toString();
    }
}
