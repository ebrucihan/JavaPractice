--1.soru
SELECT rating FROM film
GROUP BY rating;

--2.soru
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY replacement_cost;

--3.soru
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

--4.soru
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY country_id DESC
LIMIT 1;



