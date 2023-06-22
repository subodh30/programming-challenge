CREATE TABLE movement (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          account_or_company VARCHAR(255),
                          new_movementreason VARCHAR(255),
                          new_species VARCHAR(255),
                          new_originaddress VARCHAR(255),
                          new_origincity VARCHAR(255),
                          new_originname VARCHAR(255),
                          new_originpostalcode VARCHAR(255),
                          new_originpremid VARCHAR(255),
                          new_originstate VARCHAR(255),
                          new_destinationaddress VARCHAR(255),
                          new_destinationcity VARCHAR(255),
                          new_destinationname VARCHAR(255),
                          new_destinationpostalcode VARCHAR(255),
                          new_destinationpremid VARCHAR(255),
                          new_destinationstate VARCHAR(255),
                          origin_Lat FLOAT,
                          origin_Lon FLOAT,
                          destination_Lat FLOAT,
                          destination_Lon FLOAT,
                          new_numitemsmoved INT,
                          new_shipmentsstartdate DATE
);

CREATE TABLE population (
                            premiseid VARCHAR(255),
                            total_animal INT
);
