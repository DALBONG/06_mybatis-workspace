insert 
  into member
    (
       user_no
     , user_id
     , user_pwd
     , user_name
     , email
     , birthday
     , gender
     , phone
     , address
     )
  values
    (
       seq_uno.nextval
     , ?
     , ?
     , ?
     , ?
     , ?
     , ?
     , ?
     , ?
     );
     
     
select
       user_no
     , user_id
     , user_pwd
     , user_name
     , email
     , birthday
     , gender
     , phone
     , address
     , enroll_date
     , modify_date
     , status
  from member
 where user_id = 'admin'
   and user_pwd = '1234'
   and status = '?';
   
select 
       count(*)
  from board
 where status = 'Y' ;
 
select 
       board_no
     , board_title
     , user_id
     , count
     , create_date
  from board b 
  join member on (board_writer = user_no)
 where b.status = 'Y'
 order 
    by board_no desc ;


    update board
  	   set count = count + 1
  	 where board_no = ? 
  	   and status = 'Y' ;
       
       
select 
       board_no
     , board_title
     , user_id
     , count
     , create_date
     , board_content
  from board b 
  join member on (board_writer = user_no)
 where b.status = 'Y'
   and board_no = ? ;
   
select
       reply_no
     , user_id
     , reply_content
     , create_date
  from reply r
  join member on (reply_writer = user_no)
 where r.status = 'Y' 
   and r.ref_bno = ? 
 order 
    by reply_no desc ;


select 
       count(*)
  from board b
  join member on (board_writer = user_no)
 where b.status = 'Y'
   --and user_id like '%' || 'ad' || '%' -- 작성자로 ad 키워드 검색
   --and board_title like '%' || '다' || '%' -- 제목으로 '다' 키워드 검색
   --and board_content like '%' || '안녕' || '%' -- 내용으로 '안녕'키워드 검색 
    like '%' || 'keyword' || '%'
   
   