CREATE TABLE Bilett
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    film      VARCHAR(225)           NOT NULL,
    antall    INTEGER                NOT NULL,
    fornavn   VARCHAR(225)           NOT NULL,
    etternavn VARCHAR(225)           NOT NULL,
    tlf       VARCHAR(225)           NOT NULL,
    epost     VARCHAR(225)           NOT NULL,
    PRIMARY KEY (id)

);