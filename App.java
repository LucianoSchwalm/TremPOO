import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locomotiva locomotiva = new Locomotiva(10,10000,10);
        Vagao v1 = new Vagao(100, 800);

        GaragemLocomotivas gl = new GaragemLocomotivas(40);
        gl.estacionaLocomotiva(locomotiva);
        gl.estacionaLocomotiva(new Locomotiva(20, 15000, 15));
        gl.estacionaLocomotiva(new Locomotiva(30, 20000, 20));
        gl.estacionaLocomotiva(new Locomotiva(40,30000, 25));

        GaragemVagoes gv = new GaragemVagoes();
        gv.estacionaVagao(v1);
        gv.estacionaVagao(new Vagao(120, 1000));
        gv.estacionaVagao(new Vagao(130, 2000));
        gv.estacionaVagao(new Vagao(140, 800));
        gv.estacionaVagao(new Vagao(150, 200));
        gv.estacionaVagao(new Vagao(160, 200));
        gv.estacionaVagao(new Vagao(170, 200));
        gv.estacionaVagao(new Vagao(180, 200));
        gv.estacionaVagao(new Vagao(190, 200));
        gv.estacionaVagao(new Vagao(200, 200));
        gv.estacionaVagao(new Vagao(210, 200));
        gv.estacionaVagao(new Vagao(220, 200));
        gv.estacionaVagao(new Vagao(230, 200));
        gv.estacionaVagao(new Vagao(240, 200));
        gv.estacionaVagao(new Vagao(250, 200));
        gv.estacionaVagao(new Vagao(260, 200));
        gv.estacionaVagao(new Vagao(270, 200));
        gv.estacionaVagao(new Vagao(280, 200));
        gv.estacionaVagao(new Vagao(290, 200));
        gv.estacionaVagao(new Vagao(300, 200));
        gv.estacionaVagao(new Vagao(310, 200));
        gv.estacionaVagao(new Vagao(320, 200));
        gv.estacionaVagao(new Vagao(330, 9000));
        //gv.estacionaVagao(new Vagao(150, 9000)); // teste do peso

        PatioCentral pc = new PatioCentral();

        /*trem1.engataLocomotiva(gl.buscaLocomotiva(10));
        trem1.engataLocomotiva(gl.buscaLocomotiva(20));
        trem1.engataVagao(gv.buscaVagao(100));
        trem1.engataVagao(gv.buscaVagao(120));
        trem1.engataVagao(gv.buscaVagao(130));
        trem1.engataVagao(gv.buscaVagao(140));
        trem1.engataVagao(gv.buscaVagao(150));
        trem1.engataVagao(gv.buscaVagao(160));
        trem1.engataVagao(gv.buscaVagao(170));
        trem1.engataVagao(gv.buscaVagao(180));
        trem1.engataVagao(gv.buscaVagao(190));
        trem1.engataVagao(gv.buscaVagao(200));
        trem1.engataVagao(gv.buscaVagao(210));
        trem1.engataVagao(gv.buscaVagao(220));
        trem1.engataVagao(gv.buscaVagao(230));
        trem1.engataVagao(gv.buscaVagao(240));
        trem1.engataVagao(gv.buscaVagao(250));
        trem1.engataVagao(gv.buscaVagao(260));
        trem1.engataVagao(gv.buscaVagao(270));
        trem1.engataVagao(gv.buscaVagao(280));
        trem1.engataVagao(gv.buscaVagao(290));
        trem1.engataVagao(gv.buscaVagao(300));
        trem1.engataVagao(gv.buscaVagao(310));
        trem1.engataVagao(gv.buscaVagao(320));
        trem1.engataVagao(gv.buscaVagao(330)); //teste da quantidade de vagoes*/
        boolean returnMenu = true;
        while(returnMenu == true ){
        returnMenu = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Bem vindo ao sistema de Composição de trens!");
        System.out.println("---------------------------------------------");
        System.out.println("1- Crie uma composição");
        System.out.println("2- Edite uma composição");
        System.out.println("3- Liste todas as composições");
        System.out.println("4- Desfaça uma composição");
        System.out.println("5- Sair");
        System.out.println("Digite aqui o número da ação desejada: ");
        int aux = teclado.nextInt();
        if(aux == 1){
            System.out.println("Digite um número de identificador de Composição novo: ");
            int id = teclado.nextInt();
            if(pc.buscaComposicao(id) == null){
                boolean locomotivaDisp = false;
                System.out.println("Digite um número de identificador de Locomotiva:");
    
                for(int i = 0; i<gl.getQtdadeLocomotivas();i++){
                    System.out.println(gl.getLocomotiva(i));
                }
                int idLoc = 0;
                while(locomotivaDisp == false){
                idLoc = teclado.nextInt();
                for(int i = 0; i<gl.getQtdadeLocomotivas();i++){
                    if(idLoc == gl.getLocomotiva(i).getIdentificador()) {
                        locomotivaDisp = true;
                    }
                } 
                if(locomotivaDisp == false) {
                    System.out.println("Locomotiva indisponível, digite um número de identificação disponível");
                }
            }
                pc.estacionaComposicao(new Composicao(id));
                pc.buscaComposicao(id).engataLocomotiva(gl.buscaLocomotiva(idLoc));
                System.out.println("Composição Criada" + "\n" + pc.buscaComposicao(id));
             }
             else{
                 System.out.println("Número de identificador já em uso.");
             }
        returnMenu = true;
        }
        if(aux == 2){
            boolean returnMenu2 = true;
            while(returnMenu2 == true){
                returnMenu2 = false;
            System.out.println("Digite o número de identificador de Composição que deseja editar:");
            for(int i = 0; i<pc.getQtdadeComposicoes();i++){
                System.out.println(pc.getComposicao(i));
            }
            int idComp = teclado.nextInt();
            System.out.println(pc.buscaComposicao(idComp));

            System.out.println("Digite a ação de edição desejada");
            System.out.println("1-Inserir uma Locomotiva na Composição");
            System.out.println("2-Inserir um Vagão na Composição");
            System.out.println("3-Remover o último elemento da Composição");
            System.out.println("4-Listar locomotivas livres");
            System.out.println("5-Listar vagões livres");
            System.out.println("6-Encerrar edição");
            int opcao = teclado.nextInt();
 
            if(opcao == 1){
                System.out.println("Esolha a locomotiva que será engatada");
                 for(int i = 0; i<gl.getQtdadeLocomotivas();i++){
                  System.out.println(gl.getLocomotiva(i));
                }
                int idLoc = teclado.nextInt();
                pc.buscaComposicao(idComp).engataLocomotiva(gl.buscaLocomotiva(idLoc));
                System.out.println("Locomotiva engatada");
            }

            if(opcao == 2){
                System.out.println("Esolha o vagão que será engatado");
                for(int i = 0; i<gv.getQtdadeVagoes();i++){
                 System.out.println(gv.getVagao(i));
                }
               int idVag = teclado.nextInt();
               boolean sizeCheck = pc.buscaComposicao(idComp).engataVagao(gv.buscaVagao(idVag));
               if (sizeCheck == false){
               System.out.println("Vagão não pode ser engatado: Excesso de peso ou excesso de vagões");
               }
            }
            
            if(opcao == 3){
               if(pc.buscaComposicao(idComp).getQtdadeVagoes() == 0){
               pc.buscaComposicao(idComp).removeUltimaLocomotiva();
               }
               else{
                pc.buscaComposicao(idComp).removeUltimoVagao();
               }
               System.out.println("Removido com sucesso!");
            }
            if(opcao == 4){
                for(int i = 0; i<gl.getQtdadeLocomotivas();i++){
                    System.out.println("Locomotivas Livres: " + gl.getLocomotiva(i));
                }
            }
            if(opcao == 5){
                for(int i = 0; i<gv.getQtdadeVagoes();i++){
                    System.out.println("Locomotivas Livres: " + gv.getVagao(i));
                }
            }
            returnMenu2 = true;
            if(opcao == 6){
               System.out.println("Encerrando edição...");
               returnMenu2 = false;
               returnMenu = true;
            }
        }
    }
    if(aux == 3){
       for(int i = 0; i < pc.getQtdadeComposicoes(); i++){
           System.out.println("Composições adicionadas: " + pc.getComposicao(i));
        }
        returnMenu = true;
    }
    if(aux == 4){
        System.out.println("Digite o número de identificador de Composição que deseja editar:");
            for(int i = 0; i<pc.getQtdadeComposicoes();i++){
                System.out.println(pc.getComposicao(i));
            }
            int idComp = teclado.nextInt();
            System.out.println(pc.buscaComposicao(idComp));
            for(int i = 0 ;  i < pc.buscaComposicao(idComp).getQtdadeVagoes();i++){
                gv.estacionaVagao(pc.buscaComposicao(idComp).getVagao(pc.buscaComposicao(idComp).getQtdadeVagoes()-1));
                pc.buscaComposicao(idComp).removeUltimoVagao();
            }
            for(int i = 0 ;  i < pc.buscaComposicao(idComp).getQtdadeLocomotivas();i++){
                gl.estacionaLocomotiva(pc.buscaComposicao(idComp).getLocomotiva(pc.buscaComposicao(idComp).getQtdadeLocomotivas()-1));
                pc.buscaComposicao(idComp).removeUltimaLocomotiva();
            }
            pc.removeComposicao(idComp);
            System.out.println("Removido com sucesso");
        returnMenu=true;    
    }
    if(aux == 5){
        System.out.println("Desligando o programa!");
        returnMenu = false;
    }
}
}
}


