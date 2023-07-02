# postrofit

"지하철 보관함을 어떻게하면 잘 쓸수있을까?" 라는 물음으로 시작한 프로젝트 입니다.

지하철 보관함을 기점으로 사람들이 택배를 맡길 수 있습니다. 

맡긴 택배를 지하철을 이용하는 사람들이 다른 역으로 옮깁니다.

옮겨진 택배를 수령자가 수형하는 형태의 서비스입니다.

## 💻 서비스 화면 구성



## 📋 백엔드 기능 정보 list

+ Order
 + 역에서 빈 보관함 갯수 조회 기능
 + 특정 역의 보관함 상태리스트 조회 기능
 + 택배 맡기는데 드는 비용 조회 기능
 + 보관함 위치, 비밀번호 조회 기능
 + 주문 등록 기능
+ Delivery
 + 배달 가능한 order 수 요청 기능
 + 보관함 정보 list 반환 기능
 + 택배 사이즈별 예상 수익 조회 기능
 + 배달할 오더 정보조회 기능
 + 배달 등록 기능
 + 도착역 보관함 비밀번호 조회 기능
 + 출발역 보관함 비밀번호 조회 기능
+ Store
 + 역에서 빈 보관함 갯수 조회 기능
 + 특정 역의 보관함 상태리스트 조회 기능
 + 보관함 사이별 비용 조회 기능
 + 보관함 비밀번호 조회 기능
 + 보관 등록 기능
+ User
 + 현재 진행중인 보관 메타 정보 조회 기능
 + 보관 정보 조회 기능
 + 이용 내역 메타 정보 조회 기능
   + 데이터는 날짜순서로 정렬됨
 + 이용 내역 전체 정보 조회 기능

## 🧳 API 문서

https://postrofit.gitbook.io/postrofit-api-docs/reference/api-reference

## 🔨 백엔드 구조

 Eureka Discovery - client 구조를 기반으로 개발하였습니다.
 
 Client 중 하나를 Api-gateway로써 역할을 부여하고 모든 요청이 api-gateway를 통과하여 요청하게 하였습니다. (로드밸런싱도 수행)
 
 Client는 현재 Backend-service 하나 밖에 없지만 상항에 맞추어 역할을 분리해나갈 예정입니다.
 
 역할이 분리된다면 서버간의 통신을 Zookeeper-Kafka를 통한 이벤트 스트림으로 처리할 예정입니다.

## 💾 데이터베이스

현재는 데모버전을 개발중이기 때문에 서버가 뜨면 테스트 데이터가 메모리 디비에 저장이 됩니다. 따라서 서버간의 데이터가 다를 수 있습니다.

## 📕 기술 스택
### 백엔드
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)
![MariaDB Badge](https://img.shields.io/badge/MariaDB-003545?logo=mariadb&logoColor=fff&style=flat)






