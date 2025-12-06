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