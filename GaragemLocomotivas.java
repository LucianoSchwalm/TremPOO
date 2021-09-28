import java.util.ArrayList;

public class GaragemLocomotivas {
    private ArrayList<Locomotiva> locomotivas;
    private int maximo;

    public GaragemLocomotivas(int max){
        locomotivas = new ArrayList<>();
        maximo = max;
    }

    public void estacionaLocomotiva(Locomotiva loc){
        if(loc.livre() && locomotivas.size() < maximo){
            locomotivas.add(loc);
        }
    }
    
    public Locomotiva buscaLocomotiva(int id){
        int pos = 0;
        while(pos < locomotivas.size()){
            Locomotiva loc = locomotivas.get(pos);
            if(loc.getIdentificador() == id){
                locomotivas.remove(pos);
                return loc;
            }
        }
        return null;
    }

    public Locomotiva getLocomotiva(int posicao) {
		if (posicao >= 0 && posicao < locomotivas.size()) {
			return locomotivas.get(posicao);
		} else {
			return null;
		}
	}

    public int getQtdadeLocomotivas() {
		return locomotivas.size();
	}
}
