-- 코드를 입력하세요
--자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금
select ROUND(AVG(DAILY_FEE),0) AVERAGE_FEE  from CAR_RENTAL_COMPANY_CAR 
GROUP BY CAR_TYPE
HAVING CAR_TYPE = 'SUV';