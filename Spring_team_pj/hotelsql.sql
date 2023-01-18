drop table HTLogin;
create table HTLogin (
    name        VARCHAR2(20) NOT NULL,
    email       VARCHAR2(20) NOT NULL,
    passw       VARCHAR2(20) NOT NULL,
    tel         VARCHAR2(13) NOT NULL,
    admin       VARCHAR2(2) DEFAULT 'n' NOT NULL,
    constraints team_email_pk PRIMARY KEY (email)
);
insert into HTLogin values ('������','admin@naver.com','1234','010-1234-5678', 'y');

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

insert into htgb values(1, '����','�̸�' ,to_date('22/11/22'),'����',1);

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
    first_name      �̸�,
    salary          �޿�,
    department_name �μ���
FROM
         employees
    JOIN departments ON employees.department_id = departments.department_id;


insert into htlogin values('admin', '1@1','1' ,'010-3333-3333','y');

commit;

insert into htdate values('11111', 'aaaa@naver.com','2022-05-03' ,'220607','3');

select * from htlogin where email='admin@naver.com';

select  * from htlogin;

delete from htlogin where name='Ȳ��';

commit;

SELECT num, tit, name, to_date(to_char(tda),'yyyy-mm-dd'), nayoung, cou
		FROM htgb;

		INSERT INTO HTdate
		VALUES (renumAssign.nextval,'d@d',to_date('22-05-12'),to_date('22-12-12'),4);

	UPDATE hoteltb 
	SET renum=(SELECT renum FROM htdate WHERE email='a@a') 
    WHERE hname='��Ŀ��ȣ��' AND roomSize='�����' AND price=11000;
    

delete from htdate;

select  * from htdate;

commit;

update htdate set renum= renumAssign.nextval where email='a@a';

select * from hoteltb;

		SELECT renum, region, hname, roomsize, price
		FROM hoteltb
		where region='�λ�';

select * from htgb;

delete from htgb;

SELECT email from htlogin where email='admin@naver.com';

select d.renum,h.region,h.hname,l.name,d.email,l.tel,d.cin,d.cout,d.pep
from htdate d,htlogin l ,hoteltb h	
where l.email = d.email and h.renum=d.renum
and d.email = '1234@5678.com';


select passw from htlogin where email = '1234@5678';

DROP SEQUENCE renumAssign;
CREATE SEQUENCE renumAssign   -- ��������
    MINVALUE 1000   -- �ּҰ�
    MAXVALUE 10000  -- �ִ밪
    INCREMENT BY 10 -- ������
    START WITH 1010 -- ���۰�
    NOCACHE
    NOORDER
    NOCYCLE;

DROP SEQUENCE numAssign;
CREATE SEQUENCE numAssign   -- ��������
    MINVALUE 1   -- �ּҰ�
    MAXVALUE 10000  -- �ִ밪
    INCREMENT BY 1 -- ������
    START WITH 1 -- ���۰�
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
    '����',
    '��Ŀ��ȣ��',
    'Ʈ����',
    '94000'
);

INSERT INTO hoteltb VALUES (null,
    '����',
    '��Ŀ��ȣ��',
    '�����',
    '11000'
);

INSERT INTO hoteltb VALUES (null,
    '����',
    '��Ŀ��ȣ��',
    '����Ʈ��',
    '15000'
);

INSERT INTO hoteltb VALUES (null,
    '����',
    '�Ŷ�����ȣ��',
    'Ʈ����',
    '98000'
);

INSERT INTO hoteltb VALUES (null,
    '����',
    '�Ŷ�����ȣ��',
    '�����',
    '11700'
);

INSERT INTO hoteltb VALUES (null,
    '����',
    '�Ŷ�����ȣ��',
    '����Ʈ��',
    '135000'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '����Ʈ����ȣ��',
    'Ʈ����',
    '98800'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '����Ʈ����ȣ��',
    '�����',
    '128000'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '����Ʈ����ȣ��',
    '����Ʈ��',
    '145000'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '��ī�̺���ȣ��',
    'Ʈ����',
    '99000'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '��ī�̺���ȣ��',
    '�����',
    '119000'
);

INSERT INTO hoteltb VALUES (null,
    '������',
    '��ī�̺���ȣ��',
    '����Ʈ��',
    '129000'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ե�ȣ��',
    'Ʈ����',
    '87900'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ե�ȣ��',
    '�����',
    '107900'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ե�ȣ��',
    '����Ʈ��',
    '139000'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ķ���̽�ȣ��',
    'Ʈ����',
    '98000'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ķ���̽�ȣ��',
    '�����',
    '118000'
);

INSERT INTO hoteltb VALUES (null,
    '�λ�',
    '�Ķ���̽�ȣ��',
    '����Ʈ��',
    '148000'
);

SELECT
    *
FROM
    hoteltb;

COMMIT;

