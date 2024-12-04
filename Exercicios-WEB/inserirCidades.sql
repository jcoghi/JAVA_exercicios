SELECT * FROM estados WHERE id = 33

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 25)

UPDATE cidades
set estado_id = 33
WHERE nome = 'Campinas'

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Niterói', 133.9, 27)

INSERT INTO cidades
    (nome, area, estado_id)
VALUES (
    'Caruaru',
    920.6,
    (SELECT id FROM estados WHERE sigla = 'PE')
)


INSERT INTO cidades
    (nome, area, estado_id)
VALUES(
    'Juazeiro do Norte',
    248.2,
    (SELECT id FROM estados WHERE sigla = 'CE')
)

SELECT * FROM cidades