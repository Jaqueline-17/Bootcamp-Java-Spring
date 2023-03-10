package Fila;

public class Fila<T> {

    private NoFila<T> refNoEntradaFila;


    public Fila() {
    }

    public Fila(NoFila refNoEntradaFila) {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    public void enqueue(T object) {
        NoFila novoNo = new NoFila(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if(!this.isEmpty()) {
            NoFila primeiroNo = refNoEntradaFila;
            
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }   
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
            
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }

            return (T) primeiroNo.getObject();
        }   
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ->";
                noAuxiliar = noAuxiliar.getRefNo();
                
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }

    


}
