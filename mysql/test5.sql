/*
### Q1.

전화번호가 010으로 시작하는 직원의 직원명과 전화번호를 다음과 같이 출력하세요.
PHONE LIKE '010________'
PHONE LIKE '%010%'
EMP_NAME, PHONE
CONCAT_WS('-', SUBSTRING(PHONE, 1,3), SUBSTRING(PHONE, 4,4), SUBSTRING(PHONE, 8,4)) AS PHONE
*/
SELECT
	EMP_NAME, 
    CONCAT_WS('-', SUBSTRING(PHONE, 1,3), SUBSTRING(PHONE, 4,4), SUBSTRING(PHONE, 8,4)) AS PHONE
FROM
	employee
WHERE
	PHONE LIKE '010________';

/*
### Q2.

근속 일수가 20년 이상인 직원의 직원명, 입사일, 급여를 다음과 같이 출력하세요.
HIRE_DATE
EMP_NAME as 직원명, HIRE_DATE as 입사일, SALARY as 급여
단, 입사한 순서대로 출력하고 입사일이 같으면 급여가 높은 순서로 출력되도록 하세요.
*/
    
SELECT * FROM employee.employee;
SELECT date_add(HIRE_DATE,INTERVAL -20 YEAR), DATEDIFF(HIRE_DATE,CURDATE()) FROM employee.employee;