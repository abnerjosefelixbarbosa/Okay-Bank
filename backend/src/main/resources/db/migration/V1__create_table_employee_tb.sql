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