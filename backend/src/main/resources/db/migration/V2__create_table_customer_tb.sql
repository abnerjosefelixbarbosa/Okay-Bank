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
