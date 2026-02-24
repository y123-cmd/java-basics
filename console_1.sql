USE payment_db;

DROP TABLE IF EXISTS payments;

CREATE TABLE payments(
                         payments_id VARCHAR(20) PRIMARY KEY,
                         customer_name VARCHAR(100) NOT NULL,
                         amount DOUBLE NOT NULL,
                         payment_type VARCHAR(50),
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM payments;

ALTER TABLE payments
MODIFY payment_type ENUM('PAYPAL','CREDIT_CARD')NOT NULL
