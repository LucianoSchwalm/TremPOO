public class Locomotiva {
	private int identificador;
	private double pesoMaximo;
	private double qtdadeMaxVagoes;
	private Composicao composicao;

	public Locomotiva(int identificador, double pesoMaximo, double qtdadeVagoes) {
		this.identificador = identificador;
		this.pesoMaximo = pesoMaximo;
		this.qtdadeMaxVagoes = qtdadeVagoes;
		this.composicao = null;
	}

	public int getIdentificador() {
		return identificador;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public double getQtdadeMaxVagoes() {
		return qtdadeMaxVagoes;
	}

	public Composicao getComposicao() {
		return composicao;
	}

	/*public Composicao getComposicaoByID(int identificador){
		return composicoes.get(identificador);
	}*/

	public boolean livre(){
		return composicao == null;
	}

	public void setComposicao(Composicao composicao) {
		this.composicao = composicao;
	}
	
	@Override
	public String toString() {
		if (livre()){
			return "Locomotiva [LIVRE, identificador=" + identificador + ", pesoMaximo="
			+ pesoMaximo + ", qtdadeMaxVagoes=" + qtdadeMaxVagoes + "]";
		}
		return "Locomotiva [Engatada na composicao=" + composicao.getIdentificador() + ", identificador=" + identificador + ", pesoMaximo="
			+ pesoMaximo + ", qtdadeMaxVagoes=" + qtdadeMaxVagoes + "]";
	}
}
