import java.util.ArrayList;

public class GaragemVagoes{
    private ArrayList<Vagao> vagoes;
    
    public GaragemVagoes(){
        vagoes = new ArrayList<>(100);
    }
    public void estacionaVagao(Vagao vagao){
        vagoes.add(vagao);
        vagao.setComposicao(null);
    }

    public Vagao getVagao(int i){
        return vagoes.get(i);
    }

    public int getQtdadeVagoes(){
        return vagoes.size();
    }

    public Vagao buscaVagao(int id){
        for(int i = 0; i<vagoes.size();i++){
            if(vagoes.get(i).getIdentificador()==id){
                return vagoes.remove(i);
            }
        }
        return null;
    }

    public ArrayList<Integer> getIdentificadores(){
        ArrayList<Integer> ids = new ArrayList<>();
        for(Vagao v:vagoes){
            ids.add(v.getIdentificador());
        }
        return ids;
    }
}