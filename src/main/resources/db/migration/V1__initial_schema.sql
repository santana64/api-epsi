CREATE TABLE vendeur (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nom VARCHAR(255),
                         email VARCHAR(255)
);

CREATE TABLE article (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nom VARCHAR(255),
                         description TEXT,
                         prix DOUBLE,
                         categorie VARCHAR(255),
                         vendu BOOLEAN,
                         vendeur_id BIGINT,
                         FOREIGN KEY (vendeur_id) REFERENCES vendeur(id)
);
