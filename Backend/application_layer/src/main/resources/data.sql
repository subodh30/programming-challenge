INSERT INTO Location (premId, name, address, city, state, postcode, latitude, longitude)
VALUES
    ('376DQUF', 'my_farm_name_B', '163, fake Street', 'Carthage', 'IL', '62321', 42.04312, -94.73784),
    ('088WKFT', 'my_farm_name_C', '677, fake Street', 'Edison', 'NE', '68936', 41.99145, -103.34611),
    ('225ZGAJ', 'my_farm_name_J', '154, fake Street', 'Bethany', 'MO', '64424', 41.90538, -97.56184),
    ('180UCBY', 'my_farm_name_B', '707, fake Street', 'Clay Center', 'NE', '68933', 42.10786, -101.59227),
    ('582PHBR', 'my_farm_name_E', '217, fake Street', 'Albion', 'IN', '46701', 42.97002, -88.94877),
    ('360FDCZ', 'my_farm_name_I', '308, fake Street', 'Hampton', 'IA', '50441', 44.33265, -96.68334),
    ('733DTME', 'my_farm_name_C', '026, fake Street', 'Shelby', 'IA', '51570', 43.07102, -99.01941),
    ('715ELOH', 'my_farm_name_H', '813, fake Street', 'Edison', 'NE', '68936', 41.87143, -103.33981),
    ('325UDIW', 'my_farm_name_B', '582, fake Street', 'Pittsfield', 'IL', '62363', 41.0829, -94.3104),
    ('671HMJV', 'my_farm_name_J', '501, fake Street', 'Leopold', 'IN', '47551', 39.67177, -90.09549),
    ('778EYUX', 'my_farm_name_L', '743, fake Street', 'Sheffield', 'IA', '50475', 46.38174, -92.14026),
    ('464KBIF', 'my_farm_name_R', '733, fake Street', 'Sac City', 'IA', '50583', 46.07227, -93.91527),
    ('477EDVX', 'my_farm_name_K', '028, fake Street', 'Battle Creek', 'IA', '51006', 45.88508, -94.49498),
    ('611ULSK', 'my_farm_name_M', '112, fake Street', 'Havelock', 'IA', '50574', 46.36619, -93.63721),
    ('027RDXY', 'my_farm_name_S', '012, fake Street', 'Wawaka', 'IN', '46794', 45.03986, -84.37985),
    ('220FAPG', 'my_farm_name_S', '834, fake Street', 'Fonda', 'IA', '50540', 46.22264, -93.76849),
    ('554DGRT', 'my_farm_name_O', '058, fake Street', 'Ute', 'IA', '51060', 45.53324, -94.59197),
    ('853OBOV', 'my_farm_name_R', '550, fake Street', 'Edison', 'NE', '68936', 43.80099, -98.72475),
    ('453YIAE', 'my_farm_name_Q', '846, fake Street', 'Altona', 'IL', '61414', 44.67619, -89.01749),
    ('730AOYL', 'my_farm_name_T', '613, fake Street', 'Flat Rock', 'IL', '62427', 42.391528, -86.477042);

INSERT INTO Movement (origin_premId, destination_premId, account_or_company, new_movementreason, new_species, new_numitemsmoved, new_shipmentsstartdate)
VALUES
    ('376DQUF', '778EYUX', 'Mypigcompany', 'FINISH TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('088WKFT', '464KBIF', 'Mypigcompany', 'SOW TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('225ZGAJ', '477EDVX', 'Mypigcompany', 'SOW TO NURSERY', 'Swine', 1000, '2018-04-11'),
    ('180UCBY', '611ULSK', 'Mypigcompany', 'WTF TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('582PHBR', '027RDXY', 'Mypigcompany', 'WTF TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('360FDCZ', '220FAPG', 'Mypigcompany', 'FINISH TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('733DTME', '554DGRT', 'Mypigcompany', 'WTF TO FINISH', 'Swine', 1000, '2018-04-11'),
    ('715ELOH', '853OBOV', 'Mypigcompany', 'SOW TO NURSERY', 'Swine', 1000, '2018-04-11'),
    ('325UDIW', '453YIAE', 'Mypigcompany', 'SOW TO WTF', 'Swine', 1000, '2018-04-11'),
    ('671HMJV', '730AOYL', 'Mypigcompany', 'SOW TO FINISH', 'Swine', 1000, '2018-04-11');



INSERT INTO Population (premiseid, total_animal) VALUES ('376DQUF', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('088WKFT', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('225ZGAJ', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('180UCBY', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('582PHBR', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('360FDCZ', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('733DTME', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('715ELOH', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('325UDIW', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('671HMJV', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('778EYUX', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('464KBIF', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('477EDVX', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('611ULSK', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('027RDXY', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('220FAPG', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('554DGRT', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('853OBOV', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('453YIAE', 1000);
INSERT INTO Population (premiseid, total_animal) VALUES ('730AOYL', 1000);
