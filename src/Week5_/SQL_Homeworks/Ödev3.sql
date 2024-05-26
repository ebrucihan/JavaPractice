--1.soru
SELECT country FROM country
WHERE country LIKE 'A%a';

--2.soru
SELECT country FROM country
WHERE LENGTH(country) >= 6 AND country LIKE '%n';

--3.soru
SELECT title FROM film
WHERE WHERE (title ILIKE '%t%t%t%t%');

--4.soru
SELECT * FROM film
WHERE (title like 'C%') AND length > 90 AND rental_rate = 2.99;
