create database SSDI;
use SSDI;

create table user_details(user_id INT(10) auto_increment, email_id varchar(50), 
first_name varchar(50), last_name varchar(50), password varchar(50),
 primary key(user_id));
 
 insert into user_details values(1,"triveni@uncc.edu","triveni","shetty","triv@123");
 insert into user_details values(2,"deepika@uncc.edu","deepika","maniyil","deep@123");
 insert into user_details values(3,"vivek@uncc.edu","vivek","ravi","vive@123");
 insert into user_details values(4,"mai@uncc.edu","mai","moftah","mai@123");
 
 select * from user_details;
 
 drop table genre;
 
 create table genre(genre_id INT(10) auto_increment, genre_name varchar(50), primary key(genre_id));
 
 insert into genre values(1,"Thriller");
 insert into genre values(2,"Action");
 insert into genre values(3,"Romance");
 insert into genre values(4,"Comedy");
 insert into genre values(5,"Horror");
 
 select * from genre;
 
 create table movie_details(movie_id INT(10) auto_increment,movie_name varchar(50), 
genre_id INT(10),
 primary key(movie_id), foreign key(genre_id) references genre(genre_id));
 
insert into movie_details values(1,"Titanic",3);
insert into movie_details values(2,"Hulk",2);
insert into movie_details values(3,"Deadpool",4);
insert into movie_details values(4,"Conjuring",5);
    
select * from movie_details;

create table home_experience(h_id INT(10) auto_increment,movie_id INT(10),link varchar(50),primary key(h_id),foreign key(movie_id) references movie_details(movie_id));

insert into home_experience values();
insert into home_experience values();
insert into home_experience values();
insert into home_experience values();
insert into home_experience values();

create table zipcode(zip INT(10), zip_name varchar(50), primary key(zip));

insert into zipcode values(28262,"charlotte");
insert into zipcode values(21228,"Baltimore");
insert into zipcode values(20022,"Washington DC");
insert into zipcode values(19109,"Philadelphia");

select * from zipcode;

create table theater(theater_id INT(10) auto_increment, theater_name varchar(50), zip INT(10), primary key(theater_id), foreign key(zip) references zipcode(zip));

insert into theater values(1,"CarolinaCinemas",28262);
insert into theater values(2,"RegalCinemas",28262);

insert into theater values(3,"ArenaStage",20022);
insert into theater values(4,"LincolnTheater",20022);

select * from theater;

create table movie_theater(movie_id INT(10), theater_id INT(10), from_date date, to_date date, 
primary key(movie_id,theater_id),
foreign key(movie_id) references movie_details(movie_id),foreign key(theater_id) references theater(theater_id));

insert into movie_theater values(1,1,'2016-01-01','2016-01-20');
insert into movie_theater values(1,2,'2016-01-01','2016-01-25');
insert into movie_theater values(1,3,'2016-01-01','2016-01-15');
insert into movie_theater values(2,1,'2016-01-10','2016-01-30');
insert into movie_theater values(2,3,'2016-01-15','2016-01-25');
insert into movie_theater values(3,1,'2016-02-01','2016-02-25');
insert into movie_theater values(3,3,'2016-02-01','2016-02-10');
insert into movie_theater values(3,4,'2016-02-01','2016-02-15');
insert into movie_theater values(4,1,'2016-03-01','2016-03-10');
insert into movie_theater values(4,4,'2016-03-01','2016-03-25');

select * from movie_theater;


create table user_movie_theater(umt_id INT(10) auto_increment, user_id INT(10), movie_id INT(10), theater_id INT(10), num_seats INT(10), cost float AS (num_seats*10.00),book_date date ,primary key(umt_id),
foreign key(user_id) references user_details(user_id),foreign key(movie_id) references movie_details(movie_id),foreign key(theater_id) references theater(theater_id));

insert into user_movie_theater values();

select * from user_movie_theater;

create table seat_booking(umt_id INT(10), seat_num varchar(10), primary key(umt_id,seat_num), foreign key(umt_id) references
user_movie_theater(umt_id));

select * from seat_booking;

create table seat_availability(seat_avaiid INT(20) auto_increment,theater_id INT(10), movie_id INT(10), seat_num varchar(10), booked varchar(50));
insert into seat_availability values(1,1,1,1,"NO");
insert into seat_availability values(2,2,1,1,"NO");
insert into seat_availability values(3,3,1,1,"NO");         
insert into seat_availability values(4,4,1,1,"NO");
insert into seat_availability values(5,1,2,1,"NO");
insert into seat_availability values(6,2,2,1,"NO");
insert into seat_availability values(7,3,2,1,"NO");
insert into seat_availability values(8,4,2,1,"NO");
insert into seat_availability values(9,2,3,1,"NO");
insert into seat_availability values(10,2,3,1,"NO");


select * from seat_availability;


changes made


drop table user_details
drop table seat_booking
  
  drop table seat_availability
  
  create table user_details( email_id varchar(50), 
first_name varchar(50), last_name varchar(50), password varchar(50),
 primary key(email_id));
 
 insert into user_details values("triveni@uncc.edu","triveni","shetty","triv@123");
 insert into user_details values("deepika@uncc.edu","deepika","maniyil","deep@123");
 insert into user_details values("vivek@uncc.edu","vivek","ravi","vive@123");
 insert into user_details values("mai@uncc.edu","mai","moftah","mai@123");
 
 create table user_movie_theater(umt_id INT(10) auto_increment, email_id varchar(50), movie_id INT(10), theater_id INT(10), seat_num varchar(50),num_seats INT(10), cost double, date date, primary key(umt_id),
foreign key(email_id) references user_details(email_id),foreign key(movie_id) references movie_details(movie_id),foreign key(theater_id) references theater(theater_id));


  
  
  


create table seat_availability(seat_avaiid INT(20) auto_increment,theater_id INT(10), movie_id INT(10), seat_num varchar(50), booked varchar(50), primary key (seat_avaiid));

 insert into seat_availability values(1,1,1,"Row1Seat1","NO");
insert into seat_availability values(2,1,1,"Row1Seat2","NO");
insert into seat_availability values(3,1,1,"Row1Seat3","NO");
insert into seat_availability values(4,1,1,"Row1Seat4","NO");
insert into seat_availability values(5,1,1,"Row1Seat5","NO");
insert into seat_availability values(6,1,1,"Row2Seat1","NO");
insert into seat_availability values(7,1,1,"Row2Seat2","NO");
insert into seat_availability values(8,1,1,"Row2Seat3","NO");
insert into seat_availability values(9,1,1,"Row2Seat4","NO");
insert into seat_availability values(10,1,1,"Row2Seat5","NO");
insert into seat_availability values(11,1,1,"Row3Seat1","NO");
insert into seat_availability values(12,1,1,"Row3Seat2","NO");
insert into seat_availability values(13,1,1,"Row3Seat3","NO");
insert into seat_availability values(14,1,1,"Row3Seat4","NO");
insert into seat_availability values(15,1,1,"Row3Seat5","NO");
insert into seat_availability values(16,1,1,"Row4Seat1","NO");
insert into seat_availability values(17,1,1,"Row4Seat2","NO");
insert into seat_availability values(18,1,1,"Row4Seat3","NO");
insert into seat_availability values(19,1,1,"Row4Seat4","NO");
insert into seat_availability values(20,1,1,"Row4Seat5","NO");


insert into seat_availability values(1,1,2,"Row1Seat1","NO");
insert into seat_availability values(2,1,2,"Row1Seat2","NO");
insert into seat_availability values(3,1,2,"Row1Seat3","NO");
insert into seat_availability values(4,1,2,"Row1Seat4","NO");
insert into seat_availability values(5,1,2,"Row1Seat5","NO");
insert into seat_availability values(6,1,2,"Row2Seat1","NO");
insert into seat_availability values(7,1,2,"Row2Seat2","NO");
insert into seat_availability values(8,1,2,"Row2Seat3","NO");
insert into seat_availability values(9,1,2,"Row2Seat4","NO");
insert into seat_availability values(10,1,2,"Row2Seat5","NO");
insert into seat_availability values(11,1,2,"Row3Seat1","NO");
insert into seat_availability values(12,1,2,"Row3Seat2","NO");
insert into seat_availability values(13,1,2,"Row3Seat3","NO");
insert into seat_availability values(14,1,2,"Row3Seat4","NO");
insert into seat_availability values(15,1,2,"Row3Seat5","NO");
insert into seat_availability values(16,1,2,"Row4Seat1","NO");
insert into seat_availability values(17,1,2,"Row4Seat2","NO");
insert into seat_availability values(18,1,2,"Row4Seat3","NO");
insert into seat_availability values(19,1,2,"Row4Seat4","NO");
insert into seat_availability values(20,1,2,"Row4Seat5","NO");

   
   
insert into seat_availability values(151,4,3,"Row1Seat1","NO");
insert into seat_availability values(152,4,3,"Row1Seat2","NO");
insert into seat_availability values(153,4,3,"Row1Seat3","NO");
insert into seat_availability values(154,4,3,"Row1Seat4","NO");
insert into seat_availability values(155,4,3,"Row1Seat5","NO");
insert into seat_availability values(156,4,3,"Row2Seat1","NO");
insert into seat_availability values(157,4,3,"Row2Seat2","NO");
insert into seat_availability values(158,4,3,"Row2Seat3","NO");
insert into seat_availability values(159,4,3,"Row2Seat4","NO");
insert into seat_availability values(160,4,3,"Row2Seat5","NO");
insert into seat_availability values(161,4,3,"Row3Seat1","NO");
insert into seat_availability values(162,4,3,"Row3Seat2","NO");
insert into seat_availability values(163,4,3,"Row3Seat3","NO");
insert into seat_availability values(164,4,3,"Row3Seat4","NO");
insert into seat_availability values(165,4,3,"Row3Seat5","NO");
insert into seat_availability values(166,4,3,"Row4Seat1","NO");
insert into seat_availability values(167,4,3,"Row4Seat2","NO");
insert into seat_availability values(168,4,3,"Row4Seat3","NO");
insert into seat_availability values(169,4,3,"Row4Seat4","NO");
insert into seat_availability values(170,4,3,"Row4Seat5","NO");
  
  
  ALTER TABLE user_movie_theater add seat_num VARCHAR(50)
  
  ALTER TABLE seat_availability ADD FOREIGN KEY (seat_num) REFERENCES user_movie_theater(seat_num)
  
  select seat_num from seat_availability where booked = "NO"
  
DELIMITER $$
  create trigger seat_availablity_update
  After Insert on user_movie_theater
  For each row
  BEGIN
  
  set SQL_SAFE_UPDATES=0;
  update seat_availability a inner join user_movie_theater b on a.movie_id=b.movie_id
  and a.theater_id=b.theater_id and a.seat_num=b.seat_num
  set a.booked='yes';
  
  
  delete from Ticketcalculation;
  insert into  Ticketcalculation(email_id,movie_id,theater_id,num_seats) 
  select distinct email_id,movie_id,theater_id,count(*) as num from user_movie_theater 
   group by umt_id,email_id,movie_id,theater_id,;
  
  update Ticketcalculation set cost=num_seats*10;
  
  END$$
  DELIMITER ;
  
  
  create table Ticketcalculation(email_id varchar(50),movie_id INT(10), theater_id INT(10), num_seats INT(29),cost DOUBLE);
  ***************************************
  
  DELIMITER $$
  create trigger seat_availablity_change
  After DELETE on user_movie_theater
  For each row
  BEGIN
  
  set SQL_SAFE_UPDATES=0;
  update seat_availability a left outer join user_movie_theater b on a.movie_id=b.movie_id
  and a.theater_id=b.theater_id and a.seat_num=b.seat_num
  where b.movie_id is null
  set a.booked='no';
   
   END$$
  DELIMITER ;
  
  update seat_availability set booked="No" where  booked ="Yes"
  
   ALTER TABLE user_movie_theater
DROP COLUMN cost
  
  
  
   insert into seat_availability values(23,1,2,"Row1Seat3","NO");
insert into seat_availability values(24,1,2,"Row1Seat4","NO");
insert into seat_availability values(25,1,2,"Row1Seat5","NO");
insert into seat_availability values(26,1,2,"Row2Seat1","NO");
insert into seat_availability values(27,1,2,"Row2Seat2","NO");
insert into seat_availability values(28,1,2,"Row2Seat3","NO");
insert into seat_availability values(29,1,2,"Row2Seat4","NO");
insert into seat_availability values(30,1,2,"Row2Seat5","NO");
insert into seat_availability values(31,1,2,"Row3Seat1","NO");
insert into seat_availability values(32,1,2,"Row3Seat2","NO");
insert into seat_availability values(33,1,2,"Row3Seat3","NO");
insert into seat_availability values(34,1,2,"Row3Seat4","NO");
insert into seat_availability values(35,1,2,"Row3Seat5","NO");
insert into seat_availability values(36,1,2,"Row4Seat1","NO");
insert into seat_availability values(37,1,2,"Row4Seat2","NO");
insert into seat_availability values(38,1,2,"Row4Seat3","NO");
insert into seat_availability values(39,1,2,"Row4Seat4","NO");
insert into seat_availability values(40,1,2,"Row4Seat5","NO");
  
  insert into seat_availability values(61,2,1,"Row1Seat1","NO");
insert into seat_availability values(62,2,1,"Row1Seat2","NO");
insert into seat_availability values(63,2,1,"Row1Seat3","NO");
insert into seat_availability values(64,2,1,"Row1Seat4","NO");
insert into seat_availability values(65,2,1,"Row1Seat5","NO");
insert into seat_availability values(66,2,1,"Row2Seat1","NO");
insert into seat_availability values(67,2,1,"Row2Seat2","NO");
insert into seat_availability values(68,2,1,"Row2Seat3","NO");
insert into seat_availability values(69,2,1,"Row2Seat4","NO");
insert into seat_availability values(70,2,1,"Row2Seat5","NO");
insert into seat_availability values(71,2,1,"Row3Seat1","NO");
insert into seat_availability values(72,2,1,"Row3Seat2","NO");
insert into seat_availability values(73,2,1,"Row3Seat3","NO");
insert into seat_availability values(74,2,1,"Row3Seat4","NO");
insert into seat_availability values(75,2,1,"Row3Seat5","NO");
insert into seat_availability values(76,2,1,"Row4Seat1","NO");
insert into seat_availability values(77,2,1,"Row4Seat2","NO");
insert into seat_availability values(78,2,1,"Row4Seat3","NO");
insert into seat_availability values(79,2,1,"Row4Seat4","NO");
insert into seat_availability values(80,2,1,"Row4Seat5","NO");
  
  insert into seat_availability values(91,3,3,"Row1Seat1","NO");
insert into seat_availability values(92,3,3,"Row1Seat2","NO");
insert into seat_availability values(93,3,3,"Row1Seat3","NO");
insert into seat_availability values(94,3,3,"Row1Seat4","NO");
insert into seat_availability values(95,3,3,"Row1Seat5","NO");
insert into seat_availability values(96,3,3,"Row2Seat1","NO");
insert into seat_availability values(97,3,3,"Row2Seat2","NO");
insert into seat_availability values(98,3,3,"Row2Seat3","NO");
insert into seat_availability values(99,3,3,"Row2Seat4","NO");
insert into seat_availability values(100,3,3,"Row2Seat5","NO");
insert into seat_availability values(101,3,3,"Row3Seat1","NO");
insert into seat_availability values(102,3,3,"Row3Seat2","NO");
insert into seat_availability values(103,3,3,"Row3Seat3","NO");
insert into seat_availability values(104,3,3,"Row3Seat4","NO");
insert into seat_availability values(105,3,3,"Row3Seat5","NO");
insert into seat_availability values(106,3,3,"Row4Seat1","NO");
insert into seat_availability values(107,3,3,"Row4Seat2","NO");
insert into seat_availability values(108,3,3,"Row4Seat3","NO");
insert into seat_availability values(109,3,3,"Row4Seat4","NO");
insert into seat_availability values(110,3,3,"Row4Seat5","NO");
  
  
  insert into seat_availability values(111,3,4,"Row1Seat1","NO");
insert into seat_availability values(112,3,4,"Row1Seat2","NO");
insert into seat_availability values(113,3,4,"Row1Seat3","NO");
insert into seat_availability values(114,3,4,"Row1Seat4","NO");
insert into seat_availability values(115,3,4,"Row1Seat5","NO");
insert into seat_availability values(116,3,4,"Row2Seat1","NO");
insert into seat_availability values(117,3,4,"Row2Seat2","NO");
insert into seat_availability values(118,3,4,"Row2Seat3","NO");
insert into seat_availability values(119,3,4,"Row2Seat4","NO");
insert into seat_availability values(120,3,4,"Row2Seat5","NO");
insert into seat_availability values(121,3,4,"Row3Seat1","NO");
insert into seat_availability values(122,3,4,"Row3Seat2","NO");
insert into seat_availability values(123,3,4,"Row3Seat3","NO");
insert into seat_availability values(124,3,4,"Row3Seat4","NO");
insert into seat_availability values(125,3,4,"Row3Seat5","NO");
insert into seat_availability values(126,3,4,"Row4Seat1","NO");
insert into seat_availability values(127,3,4,"Row4Seat2","NO");
insert into seat_availability values(128,3,4,"Row4Seat3","NO");
insert into seat_availability values(129,3,4,"Row4Seat4","NO");
insert into seat_availability values(130,3,4,"Row4Seat5","NO");
  
  
  insert into seat_availability values(41,2,2,"Row1Seat1","NO");
insert into seat_availability values(42,2,2,"Row1Seat2","NO");
insert into seat_availability values(43,2,2,"Row1Seat3","NO");
insert into seat_availability values(44,2,2,"Row1Seat4","NO");
insert into seat_availability values(45,2,2,"Row1Seat5","NO");
insert into seat_availability values(46,2,2,"Row2Seat1","NO");
insert into seat_availability values(47,2,2,"Row2Seat2","NO");
insert into seat_availability values(48,2,2,"Row2Seat3","NO");
insert into seat_availability values(49,2,2,"Row2Seat4","NO");
insert into seat_availability values(50,2,2,"Row2Seat5","NO");
insert into seat_availability values(51,2,2,"Row3Seat1","NO");
insert into seat_availability values(52,2,2,"Row3Seat2","NO");
insert into seat_availability values(53,2,2,"Row3Seat3","NO");
insert into seat_availability values(54,2,2,"Row3Seat4","NO");
insert into seat_availability values(55,2,2,"Row3Seat5","NO");
insert into seat_availability values(56,2,2,"Row4Seat1","NO");
insert into seat_availability values(57,2,2,"Row4Seat2","NO");
insert into seat_availability values(58,2,2,"Row4Seat3","NO");
insert into seat_availability values(59,2,2,"Row4Seat4","NO");
insert into seat_availability values(60,2,2,"Row4Seat5","NO");
  
  insert into seat_availability values(131,4,4,"Row1Seat1","NO");
insert into seat_availability values(132,4,4,"Row1Seat2","NO");
insert into seat_availability values(133,4,4,"Row1Seat3","NO");
insert into seat_availability values(134,4,4,"Row1Seat4","NO");
insert into seat_availability values(135,4,4,"Row1Seat5","NO");
insert into seat_availability values(136,4,4,"Row2Seat1","NO");
insert into seat_availability values(137,4,4,"Row2Seat2","NO");
insert into seat_availability values(138,4,4,"Row2Seat3","NO");
insert into seat_availability values(139,4,4,"Row2Seat4","NO");
insert into seat_availability values(140,4,4,"Row2Seat5","NO");
insert into seat_availability values(141,4,4,"Row3Seat1","NO");
insert into seat_availability values(142,4,4,"Row3Seat2","NO");
insert into seat_availability values(143,4,4,"Row3Seat3","NO");
insert into seat_availability values(144,4,4,"Row3Seat4","NO");
insert into seat_availability values(145,4,4,"Row3Seat5","NO");
insert into seat_availability values(146,4,4,"Row4Seat1","NO");
insert into seat_availability values(147,4,4,"Row4Seat2","NO");
insert into seat_availability values(148,4,4,"Row4Seat3","NO");
insert into seat_availability values(149,4,4,"Row4Seat4","NO");
insert into seat_availability values(150,4,4,"Row4Seat5","NO");


insert into seat_availability values(151,4,3,"Row1Seat1","NO");
insert into seat_availability values(152,4,3,"Row1Seat2","NO");
insert into seat_availability values(153,4,3,"Row1Seat3","NO");
insert into seat_availability values(154,4,3,"Row1Seat4","NO");
insert into seat_availability values(155,4,3,"Row1Seat5","NO");
insert into seat_availability values(156,4,3,"Row2Seat1","NO");
insert into seat_availability values(157,4,3,"Row2Seat2","NO");
insert into seat_availability values(158,4,3,"Row2Seat3","NO");
insert into seat_availability values(159,4,3,"Row2Seat4","NO");
insert into seat_availability values(160,4,3,"Row2Seat5","NO");
insert into seat_availability values(161,4,3,"Row3Seat1","NO");
insert into seat_availability values(162,4,3,"Row3Seat2","NO");
insert into seat_availability values(163,4,3,"Row3Seat3","NO");
insert into seat_availability values(164,4,3,"Row3Seat4","NO");
insert into seat_availability values(165,4,3,"Row3Seat5","NO");
insert into seat_availability values(166,4,3,"Row4Seat1","NO");
insert into seat_availability values(167,4,3,"Row4Seat2","NO");
insert into seat_availability values(168,4,3,"Row4Seat3","NO");
insert into seat_availability values(169,4,3,"Row4Seat4","NO");
insert into seat_availability values(170,4,3,"Row4Seat5","NO");
  