-- create department table
create table dep(
depno number,
depname varchar2(50)
)

-- insert dummy data
insert into dep(depno,depname) values (1,'departmentA')
insert into dep(depno,depname) values (2,'departmentB')

-- query 等值连接
select e.ename,d.depno
from emp e,dep d
where e.depno = d.depno;

-- create table salgrade
create table salgrade(
grade number,
losal number,
hisal number
)

-- 不等值连接
select e.empno,e.ename,e.sal,s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

-- 外连接
select d.deptno,d.dname,count(e.empno)
from dept d, emp e
where d.deptno = e.depno(+)-- 右边有加号，等号左边所代表的表依然被包含，叫做左连接
group by d.deptno,d.dname

-- 修改列名
alter table emp rename column depno to deptno;

-- 自连接： 通过表的别名 不适合操作太大的表，笛卡尔积列太大
select e.ename||'的老板是'|| b.ename
from emp e, emp b
where e.mgr = b.empno
-- 层次查询，伪列

-- 子查询
-- where, select, from ,having 后面都可以放子查询， group by 后面不可以放
/**
可以不是同一张表，只要查询返回的结果主查询可以使用就可以
一般不在子查询中使用Order by
如果多表查询和子查询都可以实现，我们尽量选择多表查询
 */
