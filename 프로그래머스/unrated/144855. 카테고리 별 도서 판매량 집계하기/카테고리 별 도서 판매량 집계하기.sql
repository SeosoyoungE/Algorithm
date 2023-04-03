-- 코드를 입력하세요
-- select * from BOOK where YEAR(SALES_DATE)=2022 and month(SALES_DATE)=1;
 SELECT CATEGORY, sum(sales)
 from BOOK b
 join BOOK_SALES s on b.book_id=s.book_id
 where YEAR(SALES_DATE)=2022 and month(SALES_DATE)=1 and 
 (CATEGORY,s.BOOK_ID,SALES_DATE,SALES) in (select CATEGORY,s.BOOK_ID,SALES_DATE,SALES from BOOK b
 join BOOK_SALES s on b.book_id=s.book_id where YEAR(SALES_DATE)=2022 and month(SALES_DATE)=1 group by b.Book_id) group by CATEGORY order by category;