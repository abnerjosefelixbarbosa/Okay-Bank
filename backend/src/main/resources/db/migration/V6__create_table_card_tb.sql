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