# Algorithm
## SWEA

| 날짜     | 풀이| 정리              |
| -------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------- |
| 23/01/15 | [2072\_홀수만\_더하기](https://github.com/yujinSon/study/blob/7c8ac834ece9862e773e99409fed2eaeea741977/Algorithm/230115/Solution_2072_%ED%99%80%EC%88%98%EB%A7%8C_%EB%8D%94%ED%95%98%EA%B8%B0_D1.java)<br>[2071\_평균값구하기](https://github.com/yujinSon/study/blob/7c8ac834ece9862e773e99409fed2eaeea741977/Algorithm/230115/Solution_2071_%ED%8F%89%EA%B7%A0%EA%B0%92%EA%B5%AC%ED%95%98%EA%B8%B0_D1.java) | [소수점](#소수점) |
|23/01/17|[2063_중간값_찾기](https://github.com/yujinSon/study/blob/d3dfa1ecbafb56ad5519241d577afd2c75eec9b6/Algorithm/230117/Solution_2063_%EC%A4%91%EA%B0%84%EA%B0%92_%EC%B0%BE%EA%B8%B0.java)<br>[2068_최대수_구하기](https://github.com/yujinSon/study/blob/d3dfa1ecbafb56ad5519241d577afd2c75eec9b6/Algorithm/230117/Solution_2068_%EC%B5%9C%EB%8C%80%EC%88%98_%EA%B5%AC%ED%95%98%EA%B8%B0.java)<br>[2070_큰놈_작은놈_같은놈](https://github.com/yujinSon/study/blob/d3dfa1ecbafb56ad5519241d577afd2c75eec9b6/Algorithm/230117/Solution_2070_%ED%81%B0%EB%86%88_%EC%9E%91%EC%9D%80%EB%86%88_%EA%B0%99%EC%9D%80%EB%86%88.java)||

## 이론정리

### 소수점

#### Math를 사용할 경우

Math.ceil() : 올림<br>
Math.floor() : 내림<br>
Math.round() : 소수 첫 번째 자리에서 반올림.<br>

```
double pie = 3.14159265358979;
System.out.println(Math.round(pie)); //결과 : 3
System.out.println(Math.round(pie*100); //결과 : 314
System.out.println(Math.round((pie*100)/100.0); //결과 : 3.14
```

소수 세 번째자리에서 반올림 하려면 100을 곱한 값에 100.0으로 나눠주면 된다.

#### String을 사용할 경우

String.format() : 출력할 형식을 지정

```
double pie = 3.14159265358979;
double money = 4424.243423;
System.out.println(String.format("%.2f", pie)); //결과 : 3.14
System.out.println(String.format("%.3f", pie)); //결과 : 3.142
System.out.println(String.format("%,.3f", money)); //결과 : 4,424.243
```

%다음에 붙는<br>
숫자 : 숫자+1한 소수점 자리를 반올림한다.<br>
, : 자동으로 세 자리마다 ,를 붙여준다.