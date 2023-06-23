CREATE TABLE Location (
                          premId VARCHAR(255),
                          name VARCHAR(255),
                          address VARCHAR(255),
                          city VARCHAR(255),
                          state VARCHAR(255),
                          postcode VARCHAR(255),
                          latitude DECIMAL(9,6),
                          longitude DECIMAL(9,6)

);

CREATE TABLE Movement (
                          origin_premId VARCHAR(255),
                          destination_premId VARCHAR(255),
                          account_or_company VARCHAR(255),
                          new_movementreason VARCHAR(255),
                          new_species VARCHAR(255),
                          new_numitemsmoved INT,
                          new_shipmentsstartdate DATE
);

CREATE TABLE Population (
                            premiseid VARCHAR(255),
                            total_animal INT
);
