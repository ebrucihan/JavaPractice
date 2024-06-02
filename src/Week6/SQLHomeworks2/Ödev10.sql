--1.soru
SELECT city,country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

--2.soru
SELECT  customer.first_name, customer.last_name, payment.payment_id  FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

--3.soru
SELECT rental.rental_id,customer.first_name,customer.last_name FROM rental
FULL JOIN  customer ON rental.customer_id = customer.customer_id;