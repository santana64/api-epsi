CREATE TABLE vendeurs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE articles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    prix DOUBLE,
    categorie VARCHAR(255),
    vendu BOOLEAN,
    vendeur_id BIGINT,
    CONSTRAINT fk_vendeur FOREIGN KEY (vendeur_id) REFERENCES vendeurs(id)
);
