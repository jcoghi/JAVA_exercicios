SELECT * FROM estados

SELECT 
    sigla, 
    nome
FROM estados

SELECT 
    Sigla,
    nome as 'Nome do Estado' 
FROM estados


SELECT
    Sigla, nome as 'Nome do Estado'
FROM estados
WHERE regiao = 'Sul'


SELECT nome, regiao FROM estados
WHERE populacao >= 10

SELECT nome, regiao FROM estados
WHERE populacao >= 10
ORDER BY populacao

SELECT
    nome, regiao
FROM estados
WHERE populacao >= 10
ORDER BY populacao desc
