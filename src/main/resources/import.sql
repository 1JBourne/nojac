
INSERT INTO calendar VALUES(DEFAULT,'Uni Calendar', 'Professional') ;
INSERT INTO calendar VALUES(DEFAULT ,'My calendar', 'Personal') ;

INSERT INTO nj_event VALUES(DEFAULT,'Desc A',CURRENT_DATE, '12:00', '', CURRENT_DATE, '10:00', 'Lecture A', 1) ;
INSERT INTO nj_event VALUES(DEFAULT,'Desc B',CURRENT_DATE, '12:00', '', CURRENT_DATE, '10:00', 'Lecture B', 1) ;
INSERT INTO nj_event VALUES(DEFAULT,'Desc C',CURRENT_DATE, '12:00', '', CURRENT_DATE, '10:00', 'Lecture C', 1) ;
INSERT INTO nj_event VALUES(DEFAULT,'Desc D',CURRENT_DATE, '12:00', '', CURRENT_DATE, '10:00', 'Lecture D', 1) ;

INSERT INTO nj_user VALUES(DEFAULT,CURRENT_TIMESTAMP,'kostas@gmail.com','1234567890',NULL,'kostas');
INSERT INTO nj_user VALUES(DEFAULT,CURRENT_TIMESTAMP,'giannis@gmail.com','1236560890',NULL,'giannis');
INSERT INTO nj_user VALUES(DEFAULT,CURRENT_TIMESTAMP,'yorgos@gmail.com','1134467690',NULL,'yorgos');

INSERT INTO attendant VALUES (DEFAULT, 1);
INSERT INTO attendant VALUES (DEFAULT, 2);
INSERT INTO attendant VALUES (DEFAULT, 3);
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );
# INSERT INTO attendant VALUES (DEFAULT );

INSERT INTO event_attendant VALUES (1, 1);
INSERT INTO event_attendant VALUES (1, 2);
INSERT INTO event_attendant VALUES (1, 3);
# INSERT INTO event_attendant VALUES (1, 4);
# INSERT INTO event_attendant VALUES (2, 5);
# INSERT INTO event_attendant VALUES (2, 6);
# INSERT INTO event_attendant VALUES (2, 7);
# INSERT INTO event_attendant VALUES (2, 8);
# INSERT INTO event_attendant VALUES (3, 9);
# INSERT INTO event_attendant VALUES (3, 10);
# INSERT INTO event_attendant VALUES (3, 11);
# INSERT INTO event_attendant VALUES (3, 12);