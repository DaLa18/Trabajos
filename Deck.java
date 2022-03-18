import java.util.*;

public class Deck {

    public static void main(String[] args)
    {
        int PALOS = Cartama.elsimbolito.length;
        int VALORES = Cartama.elnumerito.length;
        int opc = 0;
        int ban = 0;

        Scanner leer = new Scanner(System.in);


        ArrayList<String> deck = new ArrayList<String>();

        for (int i = 0; i < VALORES ; i++)
        {
            for (int j = 0; j < PALOS; j++)
            {

                if (Cartama.elsimbolito.equals("Corazon")|| (Cartama.elsimbolito.equals("Diamante"));
                deck.add(Cartama.elsimbolito[j]+ Cartama.elcolor[0] + Cartama.elnumerito[i]);

                else if (Cartama.elsimbolito[0].equals("Trebol") ||(Cartama.elsimbolito[1].equals("Pica"));
                deck.add(Cartama.elsimbolito[i]+ Cartama.elcolor[1] + Cartama.elnumerito[i]);
            }
        }


        Iterator<String> nombreIterator = deck.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" | ");
        }

        System.out.println("Juego de cartitas .com");
        do
        {
            try{

                System.out.println("Selecciona una opción");
                System.out.println("1 - Mezcla");
                System.out.println("2 - Tomar una carta");
                System.out.println("3 - Tomar carta al azar");
                System.out.println("4 - Tomar 5 cartas");
                System.out.println("5 - EXIT");
                opc = leer.nextInt();


                switch(opc)
                {
                    case 1:
                        shuffle(deck);
                        break;

                    case 2:
                        head(deck);
                        break;

                    case 3:
                        pick(deck);
                        break;

                    case 4:
                        if(deck.size()>= 5)
                            hand(deck);

                        else
                            System.out.println("Selecciona otra opció, se acabaron las cartas");
                        break;

                    case 5:
                        System.out.println("Cartas:  ");
                        ban = 1;
                        break;

                    default:
                        System.out.println("ERROR :( ");
                        break;

                }

                if(deck.size() == 0){
                    System.out.println("Ya no hay más");
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("ERROR");
                break;

            }


        }while(ban == 0);

    }

    public static void shuffle(ArrayList deck){
        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("\n Se mezcló el Deck.");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
            System.out.print(elemento+" | ");
        }
    }

    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    public static void pick(ArrayList  deck){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }

}
