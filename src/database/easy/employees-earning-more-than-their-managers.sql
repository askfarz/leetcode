SELECT emp.name as Employee
FROM Employee emp,
     Employee man
WHERE emp.id = man.managerId
  and emp.salary > man.salary;
