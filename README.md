*Description du Projet: Scripts des Développeurs*
Le projet Scripts des Développeurs vise à suivre la progression des développeurs dans la réalisation de scripts pour un projet donné. Un chef de projet suit quotidiennement le nombre de scripts complétés par chaque développeur, et un rapport hebdomadaire est généré. Ces informations sont enregistrées dans une base de données MySQL, et toutes les interactions avec la base sont effectuées via des programmes Java utilisant JDBC .

*Fonctionnalités Principales*

1. Connexion à la Base de Données MySQL
Connexion sécurisée à la base de données MySQL en utilisant le driver JDBC.
Gestion de l’ouverture et de la fermeture des connexions.

2. Gestion de la Table DevData
Création de la table DevData pour stocker les informations des développeurs, des jours et du nombre de scripts réalisés.
Insertion des données initiales dans la table.
Suppression de la table si nécessaire pour réinitialiser les données.

3. Requêtes SQL Avancées
Recherche des développeurs ayant réalisé le nombre maximum de scripts en une journée donnée.
Liste des développeurs triée par nombre total de scripts réalisés de manière décroissante.
Calcul du nombre total de scripts réalisés par l'équipe pendant une semaine.
Calcul des scripts réalisés par un développeur spécifique.
Exécution de requêtes libres et affichage des noms et types des colonnes de la table.

4. Pré-requis
   
Avant d'exécuter le projet, assurez-vous d'avoir installé les éléments suivants :
 *JDK* (Java Development Kit)
*MySQL* (serveur de base de données)
*MySQL Connector/J* (bibliothèque JDBC pour MySQL)

5.Demo_video


https://github.com/user-attachments/assets/e453cae9-5ce7-4529-8483-b5558346dd12




