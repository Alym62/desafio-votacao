CREATE DATABASE desafio-votacao;

CREATE TABLE candidates (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE votes(
    id SERIAL PRIMARY KEY,
    id_candidate BIGINT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_candidate) REFERENCES candidates (id)
);