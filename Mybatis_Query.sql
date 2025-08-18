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
     )