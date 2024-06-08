--
-- PostgreSQL database dump
--

-- Dumped from database version 13.15
-- Dumped by pg_dump version 13.15

-- Started on 2024-06-08 17:26:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16820)
-- Name: book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    book_id integer NOT NULL,
    book_car_id integer NOT NULL,
    book_name text NOT NULL,
    book_idno text NOT NULL,
    book_mpno text NOT NULL,
    book_mail text,
    book_strt_date date NOT NULL,
    book_fnsh_date date NOT NULL,
    book_prc integer NOT NULL,
    book_note text,
    book_case text NOT NULL
);


ALTER TABLE public.book OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16818)
-- Name: book_book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.book ALTER COLUMN book_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.book_book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 205 (class 1259 OID 16830)
-- Name: brand; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.brand (
    brand_id bigint NOT NULL,
    brand_name text NOT NULL
);


ALTER TABLE public.brand OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16828)
-- Name: brand_brand_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.brand ALTER COLUMN brand_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.brand_brand_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 207 (class 1259 OID 16840)
-- Name: car; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.car (
    car_id integer NOT NULL,
    car_model_id integer NOT NULL,
    car_color text NOT NULL,
    car_km integer NOT NULL,
    car_plate text NOT NULL
);


ALTER TABLE public.car OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16838)
-- Name: car_car_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.car ALTER COLUMN car_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.car_car_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 209 (class 1259 OID 16850)
-- Name: model; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.model (
    model_id integer NOT NULL,
    model_brand_id integer NOT NULL,
    model_name text NOT NULL,
    model_type text NOT NULL,
    model_year text NOT NULL,
    model_fuel text NOT NULL,
    model_gear text NOT NULL
);


ALTER TABLE public.model OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16848)
-- Name: model_model_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.model ALTER COLUMN model_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.model_model_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 200 (class 1259 OID 16808)
-- Name: user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."user" (
    user_id bigint NOT NULL,
    user_name text NOT NULL,
    user_pass text NOT NULL,
    user_role text NOT NULL
);


ALTER TABLE public."user" OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16816)
-- Name: user_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public."user" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);



SELECT pg_catalog.setval('public.book_book_id_seq', 18, true);


--
-- TOC entry 3035 (class 0 OID 0)
-- Dependencies: 204
-- Name: brand_brand_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.brand_brand_id_seq', 19, true);


--
-- TOC entry 3036 (class 0 OID 0)
-- Dependencies: 206
-- Name: car_car_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.car_car_id_seq', 7, true);


--
-- TOC entry 3037 (class 0 OID 0)
-- Dependencies: 208
-- Name: model_model_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.model_model_id_seq', 16, true);


--
-- TOC entry 3038 (class 0 OID 0)
-- Dependencies: 201
-- Name: user_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_user_id_seq', 1, true);


--
-- TOC entry 2882 (class 2606 OID 16827)
-- Name: book book_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (book_id);


--
-- TOC entry 2884 (class 2606 OID 16837)
-- Name: brand brand_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_pkey PRIMARY KEY (brand_id);


--
-- TOC entry 2886 (class 2606 OID 16847)
-- Name: car car_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_pkey PRIMARY KEY (car_id);


--
-- TOC entry 2888 (class 2606 OID 16857)
-- Name: model model_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.model
    ADD CONSTRAINT model_pkey PRIMARY KEY (model_id);


--
-- TOC entry 2880 (class 2606 OID 16815)
-- Name: user user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);


-- Completed on 2024-06-08 17:26:55

--
-- PostgreSQL database dump complete
--

