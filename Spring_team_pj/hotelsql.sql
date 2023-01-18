drop table HTLogin;
create table HTLogin (
    name        VARCHAR2(20) NOT NULL,
    email       VARCHAR2(20) NOT NULL,
    passw       VARCHAR2(20) NOT NULL,
    tel         VARCHAR2(13) NOT NULL,
    admin       VARCHAR2(2) DEFAULT 'n' NOT NULL,
    constraints team_email_pk PRIMARY KEY (email)
);
insert into HTLogin values ('관리자','admin@naver.com','1234','010-1234-5678', 'y');

drop table HTdate;
create table HTdate (
    renum NUMBER(6),
    email VARCHAR2(20), 
    cin DATE, 
    cout DATE,
    pep NUMBER(13)
);

select d.renum,h.region,h.hname,l.name,d.email,l.tel,d.cin,d.cout,d.pep
		from htdate d,htlogin l ,hoteltb h
		where l.email = d.email and h.renum=d.renum and d.renum = 2140;

drop table HTgb;
create table HTgb (
    num        number(5) NOT NULL,
    tit       VARCHAR2(100) NOT NULL,
    name       VARCHAR2(20) NOT NULL,
    tda         date,
    nayoung  VARCHAR2(1000) NOT NULL,
    cou      number(5)  NOT NULL
);

insert into htgb values(1, '제목','이름' ,to_date('22/11/22'),'내용',1);

commit;

select * from bbs;

delete from bbs where bbsid = 1;

SELECT
    d.renum,
    l.name,
    d.email,
    l.tel,
    d.cin,
    d.cout,
    d.pep
FROM
    htdate  d,
    htlogin l
WHERE
    l.email = d.email and
    d.renum = '5183';

SELECT
    first_name      이름,
    salary          급여,
    department_name 부서명
FROM
         employees
    JOIN departments ON employees.department_id = departments.department_id;


insert into htlogin values('admin', '1@1','1' ,'010-3333-3333','y');

commit;

insert into htdate values('11111', 'aaaa@naver.com','2022-05-03' ,'220607','3');

select * from htlogin where email='admin@naver.com';

select  * from htlogin;

delete from htlogin where name='황민';

commit;

SELECT num, tit, name, to_date(to_char(tda),'yyyy-mm-dd'), nayoung, cou
		FROM htgb;

		INSERT INTO HTdate
		VALUES (renumAssign.nextval,'d@d',to_date('22-05-12'),to_date('22-12-12'),4);

	UPDATE hoteltb 
	SET renum=(SELECT renum FROM htdate WHERE email='a@a') 
    WHERE hname='워커힐호텔' AND roomSize='더블룸' AND price=11000;
    

delete from htdate;

select  * from htdate;

commit;

update htdate set renum= renumAssign.nextval where email='a@a';

select * from hoteltb;

		SELECT renum, region, hname, roomsize, price
		FROM hoteltb
		where region='부산';

select * from htgb;

delete from htgb;

SELECT email from htlogin where email='admin@naver.com';

select d.renum,h.region,h.hname,l.name,d.email,l.tel,d.cin,d.cout,d.pep
from htdate d,htlogin l ,hoteltb h	
where l.email = d.email and h.renum=d.renum
and d.email = '1234@5678.com';


select passw from htlogin where email = '1234@5678';

DROP SEQUENCE renumAssign;
CREATE SEQUENCE renumAssign   -- 시퀀스명
    MINVALUE 1000   -- 최소값
    MAXVALUE 10000  -- 최대값
    INCREMENT BY 10 -- 증감값
    START WITH 1010 -- 시작값
    NOCACHE
    NOORDER
    NOCYCLE;

DROP SEQUENCE numAssign;
CREATE SEQUENCE numAssign   -- 시퀀스명
    MINVALUE 1   -- 최소값
    MAXVALUE 10000  -- 최대값
    INCREMENT BY 1 -- 증감값
    START WITH 1 -- 시작값
    NOCACHE
    NOORDER
    NOCYCLE;

drop table hoteltb;
create table hoteltb(
    renum NUMBER(6)  ,
    region varchar2(30) not null,
    hname varchar2(30) not null,
    roomsize varchar2(30) not null,
    price number(30) not null
);
INSERT INTO hoteltb VALUES (
    null,
    '서울',
    '워커힐호텔',
    '트윈룸',
    '94000'
);

INSERT INTO hoteltb VALUES (null,
    '서울',
    '워커힐호텔',
    '더블룸',
    '11000'
);

INSERT INTO hoteltb VALUES (null,
    '서울',
    '워커힐호텔',
    '스위트룸',
    '15000'
);

INSERT INTO hoteltb VALUES (null,
    '서울',
    '신라스테이호텔',
    '트윈룸',
    '98000'
);

INSERT INTO hoteltb VALUES (null,
    '서울',
    '신라스테이호텔',
    '더블룸',
    '11700'
);

INSERT INTO hoteltb VALUES (null,
    '서울',
    '신라스테이호텔',
    '스위트룸',
    '135000'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '세인트존스호텔',
    '트윈룸',
    '98800'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '세인트존스호텔',
    '더블룸',
    '128000'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '세인트존스호텔',
    '스위트룸',
    '145000'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '스카이베이호텔',
    '트윈룸',
    '99000'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '스카이베이호텔',
    '더블룸',
    '119000'
);

INSERT INTO hoteltb VALUES (null,
    '강원도',
    '스카이베이호텔',
    '스위트룸',
    '129000'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '롯데호텔',
    '트윈룸',
    '87900'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '롯데호텔',
    '더블룸',
    '107900'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '롯데호텔',
    '스위트룸',
    '139000'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '파라다이스호텔',
    '트윈룸',
    '98000'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '파라다이스호텔',
    '더블룸',
    '118000'
);

INSERT INTO hoteltb VALUES (null,
    '부산',
    '파라다이스호텔',
    '스위트룸',
    '148000'
);

SELECT
    *
FROM
    hoteltb;

COMMIT;

