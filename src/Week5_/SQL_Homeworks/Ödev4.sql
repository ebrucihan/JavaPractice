--1.soru
SELECT DISTINCT replacement_cost FROM film;

--2.soru
SELECT COUNT (DISTINCT replacement_cost) FROM film;

--3.soru
SELECT COUNT (title) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

--4.soru
SELECT COUNT (country) FROM country
WHERE LENGTH(country) = 5;

--5.soru
SELECT COUNT (city) FROM city
WHERE city ILIKE '%R'
