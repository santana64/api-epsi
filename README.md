# API Bière

Ce projet est une API et une interface utilisateur pour la gestion d'articles de bière. Le backend est développé avec Spring Boot et le frontend avec React.

## Prérequis

- Java 17 ou supérieur
- Maven
- MySQL
- Node.js et npm

## Configuration de la base de données

1. Assurez-vous que MySQL est installé et en cours d'exécution.
2. Connectez-vous à MySQL et créez une base de données :

```sh
mysql -u root -p
CREATE DATABASE grand_bazar;
Mettez à jour les informations de connexion à la base de données dans src/main/resources/application.properties si nécessaire.
Installation et lancement du backend
Naviguez vers le répertoire du backend :

cd backend
Compilez et lancez le backend :

.\mvnw.cmd clean install
.\mvnw.cmd spring-boot:run
Le backend sera accessible à http://localhost:8080.

Installation et lancement du frontend
Naviguez vers le répertoire du frontend :

cd frontend
Installez les dépendances :

npm install
Lancez le serveur de développement :

npm start
Le frontend sera accessible à http://localhost:3000.
