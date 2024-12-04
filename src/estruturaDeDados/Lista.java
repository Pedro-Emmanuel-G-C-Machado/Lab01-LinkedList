package estruturaDeDados;

public class Lista {

    private No cabeca;

    public Lista() {
        this.cabeca = null;
    }

    public void insereInicio(int i) {
        No n = new No(i);
        n.setProximo(cabeca);
        cabeca = n;
    }

    public boolean buscaElemento(int i) {
        No n = cabeca;
        while (n != null) {
            if (n.getValor() == i) {
                return true;
            }
            n = n.getProximo();
        }
        return false;
    }

    public int buscaIndice(int i) {
        if (cabeca == null) {
            return -1;
        }
        No n = cabeca;
        int indice = 0;
        while (n != null) {
            if (n.getValor() == i) {
                return indice;
            }
            n = n.getProximo();
            indice++;
        }
        return -1;
    }

    public void insereFim(int i) {
        No novoNo = new No(i);
        if (cabeca == null) {
            cabeca = novoNo;
            return;
        }
        No n = cabeca;
        while (n.getProximo() != null) {
            n = n.getProximo();
        }
        n.setProximo(novoNo);
    }

    public void removeInicio() {
        if (cabeca != null) {
            cabeca = cabeca.getProximo();
        }
    }

    public void removeFim() {
        if (cabeca == null) {
            return;
        }
        if (cabeca.getProximo() == null) {
            cabeca = null;
            return;
        }
        No n = cabeca;
        while (n.getProximo().getProximo() != null) {
            n = n.getProximo();
        }
        n.setProximo(null);
    }

    public void removeIndice(int i) {
        No n = cabeca;

        for (int f= 0; f<i; f++) {
                n = n.getProximo();
        }

        n.setProximo(n.getProximo().getProximo());
}

public void insereElementoPosicao(int i, int j) {
        //busca a posicao
        No n = cabeca;
        No anterior = n;
        for (int b=0 ; b<=j ; b++) {
                anterior = n;
                n = n.getProximo();

                if (n == null) {
                        insereFim(i);
                        return;
                }
        }

        No novo = new No(i);
        novo.setProximo(n);

        anterior.setProximo(novo);
}

}