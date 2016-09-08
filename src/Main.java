import model.Battlefield;
import utils.Util;

/**
 * @author LEBOC Philippe
 */
public class Main {

    public static void main(String... args) {
        Util.print("=================================");
        Util.print("\t\tBataille de Faerun.");
        Util.print("=================================");

        // Récupération du choix du nombre de cases.
        Util.print("Nombre de cases du plateau : ", false);
        int casesCount = 0;
        boolean caseCountIsCorrect = false;

        while (!caseCountIsCorrect) {
            casesCount = Util.sc.nextInt();
            if(casesCount == 5 ||casesCount == 10 | casesCount == 15) {
                caseCountIsCorrect = true;
            } else Util.print("Nombre de cases incorrect, recommencez : ", false);
        }

        // Creation du plateau, des chateaux et des cases.
        final Battlefield field = new Battlefield(casesCount);

        boolean end = false;
        while(!end)
        {
            // Placements des troupes construites au tour précédant
            field.spawnCharacters();

            // Don d'une ressource à chaque tour
            field.giveTurnRewards();

            // Affichage du plateau
            Util.print(field.toString());

            // Dépense des ressources
            field.buyPhase();

            // Phase de mouvement
            field.movementPhase();

            // Phase de combat
            field.attackPhase();

            // Vérification des conditions de victoire
            if(!field.getCase(1).getRedCharacters().isEmpty()) {
                Util.print("Victoire des rouges !");
                end = true;
            }

            if(!field.getCase(casesCount).getBlueCharacters().isEmpty()) {
                Util.print("Victoire des bleus !");
                end = true;
            }
        }
    }
}
