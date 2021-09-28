import java.util.ArrayList;

public class PatioCentral {
    private ArrayList<Composicao> composicoes;

    public PatioCentral(){
        composicoes = new ArrayList<>(40);
    }

    public void estacionaComposicao(Composicao comp){
            composicoes.add(comp);
        }

    public Composicao buscaComposicao(int id) {
        int pos = 0;
        while(pos < composicoes.size()){
            Composicao comp = composicoes.get(pos);
            if(comp.getIdentificador() == id){
                return comp;
            }
            pos++;
        }
        return null;
    }

        public int getQtdadeComposicoes(){
             return composicoes.size();
    }

        public Composicao getComposicao(int posicao){
                if (posicao >= 0 && posicao < composicoes.size()) {
                    return composicoes.get(posicao);
                } else {
                    return null;
                }
            }

            public Composicao removeComposicao(int id){
                int pos = 0;
                while(pos<composicoes.size()){
                    Composicao comp = composicoes.get(pos);
                    if(comp.getIdentificador() == id){
                        composicoes.remove(pos);
                    }
                    pos++;
                }
                return null;
            }
        }
