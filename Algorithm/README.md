# Algorithm

<details><summary><b>SWEA</b></summary>

| 날짜     | 풀이                                                                                                                                                                                                                                                                                                                                                                                                                | 정리              |
| -------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------- |
| 23/01/15 | [2072*홀수만*더하기\_D1](https://github.com/yujinSon/study/blob/7c8ac834ece9862e773e99409fed2eaeea741977/Algorithm/230115/Solution_2072_%ED%99%80%EC%88%98%EB%A7%8C_%EB%8D%94%ED%95%98%EA%B8%B0_D1.java)<br>[2071\_평균값구하기\_D1](https://github.com/yujinSon/study/blob/7c8ac834ece9862e773e99409fed2eaeea741977/Algorithm/230115/Solution_2071_%ED%8F%89%EA%B7%A0%EA%B0%92%EA%B5%AC%ED%95%98%EA%B8%B0_D1.java) | [소수점](#소수점) |

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

</details>

<details><summary><b>백준</b><summary>

</details>
