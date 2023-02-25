-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into Computador (id, nome, pecas, perifericos, valor, estoque) values(nextval('hibernate_sequence'), 'Low desktop', 'processador i3 10105, placa mae LGA 1200, Memoria RAM 8gb DDR4, fonte 500w, placa de video gtx 1050ti', 'kit mouse, teclado e headset Redragon, monitor full hd', 3500, 30);
insert into Computador (id, nome, pecas, perifericos, valor, estoque) values(nextval('hibernate_sequence'), 'Medium desktop', 'processador i5 12400F, placa mae LGA 1700, Memoria RAM 16gb DDR4, fonte 600w, placa de video rtx 2060', 'kit mouse, teclado e headset Redragon, monitor full hd', 7000, 30);
insert into Computador (id, nome, pecas, perifericos, valor, estoque) values(nextval('hibernate_sequence'), 'High desktop', 'processador i9 13900k, placa mae LGA 1700, Memoria RAM 32gb DDR5, fonte 1200w, placa de video rtx 4090ti', 'kit mouse, teclado e headset Redragon, monitor 4k', 18000, 30);
