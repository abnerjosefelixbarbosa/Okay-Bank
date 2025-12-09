CREATE TABLE IF NOT EXISTS EMPLOYEE_TB (
    id VARCHAR NOT NULL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    salary NUMERIC(30,2) NOT NULL,
    phone VARCHAR(30) NOT NULL,
    employee_type INT NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(name, email, phone),
    CHECK(employee_type BETWEEN 0 AND 0)
);

CREATE TABLE IF NOT EXISTS CUSTOMER_TB (
    id VARCHAR NOT NULL,
    name VARCHAR(100) NOT NULL,
    birth_date Date NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone VARCHAR(30) NOT NULL,
    password VARCHAR(8) NOT NULL,
    customer_type INT NOT NULL,
    document VARCHAR(14) NOT NULL,
    address_zip_code VARCHAR(15) NOT NULL,
    address_name VARCHAR(30) NOT NULL,
    address_district VARCHAR(30) NOT NULL,
    address_city VARCHAR(30) NOT NULL,
    address_state VARCHAR(30) NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(name, email, phone, password, document),
    CHECK(customer_type BETWEEN 0 AND 1)
);

CREATE TABLE IF NOT EXISTS BANK_TB (
    id VARCHAR NOT NULL,
    number VARCHAR(4) NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(number)
);

CREATE TABLE IF NOT EXISTS AGENCY_TB (
    id VARCHAR NOT NULL,
    number VARCHAR(5) NOT NULL,
    bank_id VARCHAR NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(number),
    FOREIGN KEY(bank_id) REFERENCES BANK_TB(id) 
);

CREATE TABLE IF NOT EXISTS ACCOUNT_TB (
    id VARCHAR NOT NULL,
    password VARCHAR(6) NOT NULL,
    number VARCHAR(6) NOT NULL,
    amount NUMERIC(30,2) NOT NULL,
    employee_id VARCHAR NOT NULL,
    customer_id VARCHAR NOT NULL,
    agency_id VARCHAR NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(password, number),
    FOREIGN KEY(employee_id) REFERENCES EMPLOYEE_TB(id),
    FOREIGN KEY(customer_id ) REFERENCES CUSTOMER_TB(id),
    FOREIGN KEY(agency_id) REFERENCES AGENCY_TB(id)  
);

CREATE TABLE IF NOT EXISTS CARD_TB (
    id VARCHAR NOT NULL,
    cvv VARCHAR(3) NOT NULL,
    number VARCHAR(16) NOT NULL,
    expiration_date DATE NOT NULL,
    account_id VARCHAR NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(cvv, number, account_id),
    FOREIGN KEY(account_id) REFERENCES ACCOUNT_TB(id)
);