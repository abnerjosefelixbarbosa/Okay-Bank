CREATE TABLE EMPLOYEE_TB (
    id VARCHAR NOT NULL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    salary NUMERIC(30,2) NOT NULL,
    phone VARCHAR(30) NOT NULL,
    employee_type INT NOT NULL,
    CONSTRAINT pk_id_employee_tb PRIMARY KEY(id),
    CONSTRAINT unique_name_email_phone_employee_tb UNIQUE(name, email, phone),
    CONSTRAINT check_employee_type_employee_tb CHECK(employee_type BETWEEN 0 AND 0)
);