# API Epsi

Ce projet est une API développée avec Spring Boot pour gérer un système de vente d'articles. Il utilise MySQL comme base de données et Flyway pour la migration de schéma.

## Prérequis

- Java 17 ou version supérieure
- Maven
- MySQL

## Installation

1. Clonez le dépôt GitHub :
   ```sh
   git clone https://github.com/santana64/api-epsi.git
   cd api-epsi
Configurez la base de données MySQL :

Créez une base de données nommée grand_bazar.
Mettez à jour les informations de connexion à la base de données dans le fichier src/main/resources/application.properties si nécessaire.
Installez les dépendances et démarrez l'application :


./mvnw spring-boot:run
Utilisation
L'API expose plusieurs endpoints pour gérer les vendeurs et les articles. Vous pouvez utiliser des outils comme Postman ou Curl pour interagir avec l'API.

Endpoints
GET /api/vendeurs : Récupère la liste de tous les vendeurs.

POST /api/vendeurs : Crée un nouveau vendeur.

GET /api/vendeurs/{id} : Récupère un vendeur par son ID.

PUT /api/vendeurs/{id} : Met à jour les informations d'un vendeur.

DELETE /api/vendeurs/{id} : Supprime un vendeur.

GET /api/articles : Récupère la liste de tous les articles.

POST /api/articles : Crée un nouvel article.

GET /api/articles/{id} : Récupère un article par son ID.

PUT /api/articles/{id} : Met à jour les informations d'un article.

DELETE /api/articles/{id} : Supprime un article.

Structure du projet
bash
Copier le code
api-epsi
├── build.gradle
├── mvnw
├── mvnw.cmd
├── README.md
├── settings.gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── example
│   │   │           ├── ApiEspiNoahPApplication.java
│   │   │           ├── model
│   │   │           │   ├── Article.java
│   │   │           │   └── Vendeur.java
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── controller
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   │               └── V1__initial_schema.sql
│   └── test
│       └── java
│           └── org
│               └── example
│                   └── ApiEspiNoahPApplicationTests.java
Contribuer
Les contributions sont les bienvenues ! Pour contribuer, veuillez suivre les étapes suivantes :

Fork le projet
Créez une branche de fonctionnalité (git checkout -b feature/ma-fonctionnalité)
Commitez vos modifications (git commit -m 'Ajout de ma fonctionnalité')
Poussez la branche (git push origin feature/ma-fonctionnalité)
Ouvrez une Pull Request
Licence
Ce projet est sous licence MIT. Voir le fichier LICENSE pour plus de détails.



### Ajouter ce fichier à votre dépôt

1. **Créez un fichier `README.md` à la racine de votre projet**.
2. **Copiez et collez le contenu ci-dessus dans le fichier `README.md`**.
3. **Ajoutez le fichier à Git, commitez-le et poussez-le vers GitHub** :

```sh
cd C:\Users\pucci\IdeaProjects\api-espi-noahP
git add README.md
git commit -m "Add README file"
git push origin main
