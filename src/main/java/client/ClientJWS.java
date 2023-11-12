package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientJWS {
    public static void main(String[] args) {
        // Création d'une instance du service de la banque en utilisant le proxy généré
        BanqueService banqueService = new BanqueServiceService().getBanqueServicePort();
        // Appel d'exemples d'opérations du service bancaire
        System.out.println(banqueService.conversion(5));
        // Appel de la méthode getComptes pour obtenir la liste des comptes
        List<Compte> comptes = banqueService.getComptes();

        // Affichage des comptes
        for (Compte compte : comptes) {
            System.out.println("Code: " + compte.getCode() + ", Solde: " + compte.getSolde() + ", Date de Création: " + compte.getDateCreation());
        }

    }
}
/*
La classe ClientJWS a pour objectif d'illustrer l'utilisation d'un service web de la banque à l'aide de JAX-WS
 */