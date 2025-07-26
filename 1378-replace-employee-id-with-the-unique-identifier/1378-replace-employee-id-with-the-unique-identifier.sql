# Write your MySQL query statement below

# LEFT JOIN BCOZ WE NEED ALL NAMES OF EMPLOYEE TABLE, EVEN IF THERE IS NO UNIQUE ID, WE ARE USING NULL

select a.unique_id, b.name from
employees b LEFT JOIN EmployeeUNI a
on a.id=b.id;
