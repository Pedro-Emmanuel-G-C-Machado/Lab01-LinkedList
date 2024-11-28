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
        if(cabeca == null){
            cabeca = new No(i);
            return false;       
        }
        No n = cabeca;
        while(n.getProximo() != null){
            if(n.getValor() == i){
                return true;
            }
        }
        return  false;
         }



    public Object buscaIndice(int i) {
              if(cabeca == null){
                return -1;
                }
                No n = cabeca;
                int indicie = 0;
                while(n.getProximo() != null){
                    if (n.getValor() == i) {
                        return indicie;

                    }
                    n = n.getProximo();
                    indicie++;

                } 
                return -1;
                }

    public void insereFim(int i) {
                if(cabeca == null){
            cabeca = new No(i);
            return;       
        }
        No n = cabeca;
        while(n.getProximo() != null){
            n.getProximo();
        }
        No prox = new No(i);
        n.setProximo(prox);      

    }

    public void removeInicio() {
        if(cabeca != null){
           cabeca =  cabeca.getProximo();
        }
    }

    public void removeFim() {
        if(cabeca == null){
            cabeca = null;
            return;
        }
        if(cabeca.getProximo() == null){
            cabeca =null;
            return;  
        }
        No n = cabeca;
        while(n.getProximo().getProximo() != null){
            n = n.getProximo();
        }
        n.setProximo(null);
    }
    public void removeIndice(int i) {
        if(cabeca == null || i < 0 ){
            return;
        }
        if(i == 0){
            cabeca.getProximo();
        }
        No n = cabeca;
    for (int j = 0; j < i - 1; j++) {
        n = n.getProximo();
  }
        if(n == null || n.getProximo() == null){
            return;
        }    
        n.setProximo(n.getProximo().getProximo());
    }

    public void insereElementoPosicao(int i, int j) {
    if (i < 0) {
        return;
    }
    No novoNo = new No(j);
    if (i == 0) {
        novoNo.setProximo(cabeca);
        cabeca = novoNo;
        return;
    }
    No n = cabeca;
    for (int k = 0; n != null && k < i - 1; k++) {
        n = n.getProximo();
    }
    if (n == null) {
        return;
    }
    novoNo.setProximo(n.getProximo());
    n.setProximo(novoNo);
}

    
}
