--Agragação da Soma de cada Região
SELECT
    regiao as 'Região',
    sum(populacao) as Total
FROM estados
GROUP BY regiao
order BY Total desc

--Média de todos os estados
SELECT
    avg(populacao) as Total
FROM estados

