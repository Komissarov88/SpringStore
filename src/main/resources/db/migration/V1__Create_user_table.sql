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

insert into public.product (title, cost) values ('product 1', 1);
insert into public.product (title, cost) values ('product 2', 2);
insert into public.product (title, cost) values ('product 3', 3);
insert into public.product (title, cost) values ('product 4', 4);
insert into public.product (title, cost) values ('product 5', 5);
insert into public.product (title, cost) values ('product 6', 6);
insert into public.product (title, cost) values ('product 7', 7);
insert into public.product (title, cost) values ('product 8', 8);
insert into public.product (title, cost) values ('product 9', 9);
insert into public.product (title, cost) values ('product 10', 10);
insert into public.product (title, cost) values ('product 11', 11);
insert into public.product (title, cost) values ('product 12', 12);
insert into public.product (title, cost) values ('product 13', 13);
insert into public.product (title, cost) values ('product 14', 14);
insert into public.product (title, cost) values ('product 15', 15);
insert into public.product (title, cost) values ('product 16', 16);
insert into public.product (title, cost) values ('product 17', 17);
insert into public.product (title, cost) values ('product 18', 18);
insert into public.product (title, cost) values ('product 19', 19);
insert into public.product (title, cost) values ('product 20', 20);