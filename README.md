#Projet 7: Développez le nouveau système d’information de la bibliothèque d’une grande ville

####Site pour les usagers de la bibliothèque.

! ! ! Si vous lancez l'application pour la première fois, aller au chapitre sur le paramétrage avant de builder ! ! !


##Build packaging
```
- Dans le terminal, au niveau de la racine de votre projet entrez:
mvm clean package
```

## Run
```
cd target
java -jar escaladefriendsp6ocr.war
```

##Start Web page
- http://localhost:8080

## Application.properties
```
#PROD
#spring.profiles.active=prod
#DEV
spring.profiles.active=prod
```

## Paramétrage
```
application-prod.properties:
- server.port = 8088
- datasource url = jdbc:mysql://localhost:3306/escaladefriends
- username = root
- password = "mettre le mot de passe de votre base de données"

Pour lancer le mode prod il faut d'abord créer la table escaladefriends et y importer le dump qui 
est dans le dossier data à la racine du projet.

Les 3 utilisateurs enregistrés sont:
- Mail: admin@admin.com / Mot de passe: admin (MEMBRE --> évolue comme ADMIN dans l'application)
- Mail: cerise@gmail.com / Mot de passe: cerise@2021 (UTILISATEUR CONNECTE)
- Mail: francois@gmail.com / Mot de passe: francois@2021 (UTILISATEUR CONNECTE)
```

