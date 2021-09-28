import java.util.ArrayList;

public class Composicao {
	private ArrayList<Vagao> vagoes;
	private ArrayList<Locomotiva> locomotivas;
	private int identificador;

	public Composicao(int identificador){
		this.identificador = identificador;
		vagoes = new ArrayList<>();
		locomotivas = new ArrayList<>();
	}

	public int getIdentificador() {
		return identificador;
	}

	public int getQtdadeLocomotivas() {
		return locomotivas.size();
	}

	public Locomotiva getLocomotiva(int posicao) {
		if (posicao >= 0 && posicao < locomotivas.size()) {
			return locomotivas.get(posicao);
		} else {
			return null;
		}
	}

	public int getQtdadeVagoes() {
		return vagoes.size();
	}

	public Vagao getVagao(int posicao) {
		if (posicao >= 0 && posicao < vagoes.size()) {
			return vagoes.get(posicao);
		} else {
			return null;
		}
	}

	public Vagao removeUltimoVagao() {
		return vagoes.remove(vagoes.size()-1);
	}

	public Locomotiva removeUltimaLocomotiva() {
		return locomotivas.remove(locomotivas.size()-1);
	}

	public boolean engataLocomotiva(Locomotiva locomotiva) {
		// TO DO: ajustar o código para respeitar as restrições indicadas na especificação
		
		if(locomotiva.livre() == true && getQtdadeVagoes() == 0){
			locomotivas.add(locomotiva);
			locomotiva.setComposicao(this);
			return true;
		}
		return false;
	}

	public double getSomaVag(){
		double somaVag = 0;
		for(int i = 0; i<vagoes.size(); i++)
			somaVag = somaVag + vagoes.get(i).getCapacidadeCarga();
			return somaVag;
	}

	public double getSomaLoc(){
		double somaLoc = 0;
		for(int j = 0; j<locomotivas.size(); j++)
			somaLoc = somaLoc + locomotivas.get(j).getPesoMaximo();
			return somaLoc;
	}
	public boolean engataVagao(Vagao vagao) {
		// TO DO: ajustar o código para respeitar as restrições indicadas na especificação
		    if(vagao.livre() == true && getQtdadeLocomotivas() > 0){
		    vagoes.add(vagao);
		    vagao.setComposicao(this);
		    }
	            if(getSomaVag() <= getSomaLoc() && vagoes.size() <= calculoQtdadeVagoes(locomotivas.size())){
				   return true;
			    }   
			else{
				vagoes.remove(vagao);
				vagao.setComposicao(null);
			    return false;
			}
	 }

	public Locomotiva desengataLocomotiva(Locomotiva loc) {
		// TO DO: escrever o código que permite desengatar uma locomotiva;
		if(!loc.livre() == true && getQtdadeVagoes() == 0){
		    locomotivas.remove(loc);
		    loc.setComposicao(null);
			return loc;
		}
		return null;
	}

	public Vagao desengataVagao(Vagao vag) {
		// TO DO: escrever o código que permite desengatar um vagao
		if(!vag.livre() == true){
		    vagoes.remove(vag);
		    vag.setComposicao(null);
			return vag;
		}
		return null;
	}

	public double calculoQtdadeVagoes(int tam){
		double aux = 0;
		int i = 0;
		if(tam==1) {
			return locomotivas.get(0).getQtdadeMaxVagoes();
		}
		else {
			while(i<tam) {
				aux = aux + (locomotivas.get(i).getQtdadeMaxVagoes() * 0.90);
				i++;
			}
	  	return aux;
		}
	}


	public String toString(){
		String aux = "Composicao: ";
		aux += this.getIdentificador() +"\n";
		aux += "Locomotivas:\n";
		
		for(int i=0;i<this.getQtdadeLocomotivas();i++){
			aux += "    "+this.getLocomotiva(i).toString()+"\n";
		}
		
		aux += "Vagoes:\n";
	
		for(int i=0;i<this.getQtdadeVagoes();i++){
			aux += "    "+this.getVagao(i).toString()+"\n";
		}
		return aux;
	}
}
