--1.soru
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

select * from employee;

--2.soru
insert into employee (name, email, birthday) values ('Stan Ollier', 'sollier0@lulu.com', '2009-03-20');
insert into employee (name, email, birthday) values ('Burlie Cancellario', 'bcancellario1@usa.gov', '2007-08-07');
insert into employee (name, email, birthday) values ('Cortney Bassilashvili', null, null);
insert into employee (name, email, birthday) values ('Mitchael Daulby', 'mdaulby3@nyu.edu', '2002-01-03');
insert into employee (name, email, birthday) values ('Lucilia Legion', 'llegion4@blogger.com', null);
insert into employee (name, email, birthday) values ('Dania Wheater', null, '2016-03-18');
insert into employee (name, email, birthday) values ('Ulberto Tolman', 'utolman6@foxnews.com', '1996-01-16');
insert into employee (name, email, birthday) values ('Ronny Hastwell', 'rhastwell7@skype.com', '1997-05-24');
insert into employee (name, email, birthday) values ('Doll Gummoe', 'dgummoe8@photobucket.com', '2003-08-19');
insert into employee (name, email, birthday) values ('Kile Levy', 'klevy9@wufoo.com', null);
insert into employee (name, email, birthday) values ('Asia Reynalds', 'areynaldsa@army.mil', '2007-01-03');
insert into employee (name, email, birthday) values ('Salaidh Lorryman', 'slorrymanb@cdbaby.com', '2019-10-03');
insert into employee (name, email, birthday) values ('Jeanna Crowcombe', 'jcrowcombec@geocities.com', '2020-09-15');
insert into employee (name, email, birthday) values ('Aldon Howman', 'ahowmand@admin.ch', '2020-01-09');
insert into employee (name, email, birthday) values ('Gav Laible', 'glaiblee@ezinearticles.com', null);
insert into employee (name, email, birthday) values ('Constanta Adame', 'cadamef@wufoo.com', '1998-02-15');
insert into employee (name, email, birthday) values ('Ambrosio Kitter', 'akitterg@alibaba.com', '1998-03-16');
insert into employee (name, email, birthday) values ('Karita Aronov', 'karonovh@cisco.com', '2015-09-14');
insert into employee (name, email, birthday) values ('Melodie Spores', null, '1981-12-31');
insert into employee (name, email, birthday) values ('Nelia Prescote', 'nprescotej@eepurl.com', '1990-09-09');
insert into employee (name, email, birthday) values ('Garrard Bromidge', 'gbromidgek@shop-pro.jp', null);
insert into employee (name, email, birthday) values ('Sigismund Tumilson', 'stumilsonl@nydailynews.com', '1983-08-04');
insert into employee (name, email, birthday) values ('Charlean Arger', 'cargerm@last.fm', '2003-12-31');
insert into employee (name, email, birthday) values ('Mose Shilstone', 'mshilstonen@java.com', null);
insert into employee (name, email, birthday) values ('Koenraad Dionisetto', 'kdionisettoo@sbwire.com', '2022-10-16');
insert into employee (name, email, birthday) values ('Marlow Ubee', 'mubeep@arizona.edu', '1982-01-27');
insert into employee (name, email, birthday) values ('Debora Aleksankin', 'daleksankinq@marketwatch.com', '2012-03-22');
insert into employee (name, email, birthday) values ('Raimund Entwistle', 'rentwistler@ustream.tv', null);
insert into employee (name, email, birthday) values ('Wallas Sapsford', 'wsapsfords@desdev.cn', '2023-05-16');
insert into employee (name, email, birthday) values ('Isak Palser', 'ipalsert@google.es', '1992-06-20');
insert into employee (name, email, birthday) values ('Xerxes Padrick', 'xpadricku@de.vu', null);
insert into employee (name, email, birthday) values ('Merrick Persse', 'mperssev@reference.com', '2003-12-17');
insert into employee (name, email, birthday) values ('Valentine Rentoll', 'vrentollw@youtu.be', '1988-05-17');
insert into employee (name, email, birthday) values ('Claiborne Beechcraft', 'cbeechcraftx@vistaprint.com', '1985-07-03');
insert into employee (name, email, birthday) values ('Weylin Marion', 'wmariony@omniture.com', null);
insert into employee (name, email, birthday) values ('Abran Spurrett', 'aspurrettz@skyrock.com', '1994-10-05');
insert into employee (name, email, birthday) values ('Adrea Traut', 'atraut10@github.com', '2000-09-18');
insert into employee (name, email, birthday) values ('Peg Greasley', 'pgreasley11@diigo.com', '1982-02-14');
insert into employee (name, email, birthday) values ('Carey Liddle', 'cliddle12@canalblog.com', null);
insert into employee (name, email, birthday) values ('Devondra Huleatt', 'dhuleatt13@mapy.cz', '2021-11-20');
insert into employee (name, email, birthday) values ('Genovera Deehan', 'gdeehan14@aboutads.info', null);
insert into employee (name, email, birthday) values ('Pavla Haworth', 'phaworth15@tripadvisor.com', '2020-12-29');
insert into employee (name, email, birthday) values ('Anthiathia Brood', 'abrood16@rambler.ru', '2005-11-20');
insert into employee (name, email, birthday) values ('Yul Stummeyer', 'ystummeyer17@omniture.com', '2019-11-16');
insert into employee (name, email, birthday) values ('Sybil Oliver-Paull', 'soliverpaull18@redcross.org', '1992-03-07');
insert into employee (name, email, birthday) values ('Faina Shovelbottom', 'fshovelbottom19@tmall.com', '2019-05-13');
insert into employee (name, email, birthday) values ('Bethina Whitby', 'bwhitby1a@artisteer.com', '2010-01-11');
insert into employee (name, email, birthday) values ('Harmonie Bendin', 'hbendin1b@un.org', '1997-03-19');
insert into employee (name, email, birthday) values ('Filberto Grayshon', 'fgrayshon1c@blog.com', '2021-06-03');
insert into employee (name, email, birthday) values ('Creight Whisson', 'cwhisson1d@ycombinator.com', '1995-04-04');

select * from employee;

--3.soru
UPDATE employee
SET name = 'EEEE',
birthday = '1999-05-08',
email ='ebrchn@gmail.com'
WHERE id =3;

UPDATE employee
SET name = 'AAAAA'
WHERE id = 5;

UPDATE employee
SET birthday = '1999-01-04'
WHERE id = 4;

UPDATE employee
SET name = 'XXXX',
birthday = '1969-03-10'
WHERE id = 2;

UPDATE employee
SET email = 'data@.com'
WHERE id = 1;

select * from employee;


--4.soru
DELETE FROM employee
WHERE name ='AAAAA';

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE email = 'ebrchn@gmail.com';

DELETE FROM employee
WHERE id = 4;

DELETE FROM employee
WHERE name= 'XXXX';

select * from employee;









