package estruturaDeDados;

public class ListaCircular {
    private No cabeca;
    private No cauda;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void insereInicio(int i) {
        No n = new No(i);
        if (n == null) {
            cabeca = n;
            cauda = n;
            cauda.setProximo(cabeca);
        } else {
            n.setProximo(cabeca);
            cauda.setProximo(n);
            cabeca = n;
            ;

        }
    }

    public boolean buscaElemento(int i) {
        if (cabeca == null) {
            return false;
        }
        No n = cabeca;
        do {
            if (n.getValor() == i) {
                return true;
            }
            n = n.getProximo();
        } while (n != cabeca);
        return false;
    }

    public int buscaIndice(int i) {
        if (cabeca == null) {
            return -1;
        }
        No n = cabeca;
        int indice = 0;
        do {
            if (n.getValor() == i) {
                return indice;
            }
            n = n.getProximo();
            indice++;
        } while (n != cabeca);
        return -1;
    }

    public void insereFim(int i) {
        No n = new No(i);
        if (cabeca == null) {
            cabeca = n;
            cauda = n;
            cauda.setProximo(cabeca);
        } else {
            cauda.setProximo(n);
            cauda = n;
            cauda.setProximo(cabeca);
        }
    }

    public void removeInicio() {
        if (cabeca == null) {
            return;
        }
        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.getProximo();
            cauda.setProximo(cabeca);

        }
    }

    public void removeFim() {
        if (cabeca == null) {
            return;
        }
        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;

        }
        No n = cabeca;
        while (n.getProximo() != cauda) {
            n = n.getProximo();
        }
        n.setProximo(cabeca);
        cauda = cabeca;
    }

    public void removeIndice(int i) {

        int indice = 0;
        if (cabeca == null || indice < 0) {
            return;
        }
        if (indice == 0) {
            removeInicio();
            return;
        }
        No n = cabeca;
        for (int j = 0; j < i - 1; j++) {
            if (n.getProximo() == null || n.getProximo() == cabeca) {
                return;
            }
            n = n.getProximo();
        }
        if (n.getProximo() == cabeca) {
            return;
        }
        n.setProximo(n.getProximo().getProximo());
        if (n.getProximo() == cabeca) {
            cauda = n;
        }
    }

    public void insereElementoPosicao(int pos, int valor) {
        if (pos < 0) {
            return;
        }
        No novoNo = new No(valor);
        if (pos == 0) {
            if (cabeca == null) {
                cabeca = novoNo;
                cauda = novoNo;
                cauda.setProximo(cabeca);
            } else {
                novoNo.setProximo(cabeca);
                cabeca = novoNo;
                cauda.setProximo(cabeca);
            }
            return;
        }
        No n = cabeca;
        for (int i = 0; n != null && i < pos - 1; i++) {
            n = n.getProximo();
        }
        if (n == null) {
            return;
        }
        novoNo.setProximo(n.getProximo());
        n.setProximo(novoNo);
        if (novoNo.getProximo() == cabeca) {
            cauda = novoNo;
        }
    }
}