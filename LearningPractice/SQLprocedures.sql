create PROCEDURE someP (out cnt integer)
begin
select hasit into cnt from babe where name = "Georgia";
end

create procedure getCount ()
begin
select 'hasit' from babe;
select 'id1' from book;
end