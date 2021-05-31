CREATE TABLE public.product
(
    id    serial,
    title character varying(155) NOT NULL,
    cost  numeric(6, 4)          NOT NULL,
    PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
        );