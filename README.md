# postrofit

<div align="center">
  <img src="https://github.com/RDDcat/postrofit/assets/55569476/f5ed9d98-8d78-4a48-b78e-db531e4a6078"/>
</div>
<br><br>

"지하철 보관함을 어떻게하면 잘 쓸수있을까?" 라는 물음으로 시작한 프로젝트 입니다.

지하철 보관함을 기점으로 한 역에서 다른 역으로 택배를 이동시키는 서비스 입니다.

지하철 보관함을 기점으로 사람들이 택배를 맡길 수 있습니다. 

맡겨진 택배를 지하철을 이용하는 불특정한 사용자들이 배달 비용을 받고 다른 역으로 옮깁니다.

옮겨진 택배를 수령자가 수형하는 형태의 서비스입니다.


### 📍 POSTROFIT의 주요 기능은 다음과 같습니다.

+ 보관할게요: 물건 보관
+ 맡길게요: 택배 맡기기 서비스
+ 옮길게요: 택배 옮기기 서비스

<br>

## 💻 서비스 화면 구성
#### 페이지의 자세한 설명은 프론트엔드 readme 파일 참조
|  |  |  |  |
| --- | --- | --- | --- |
| ![loading](https://github.com/RDDcat/postrofit/assets/55569476/a7d61fa0-2a08-4db2-b059-3f7b5008a4f0) | ![main](https://github.com/RDDcat/postrofit/assets/55569476/ec90007f-7b49-43f0-9a10-aeb7997a1de6) | ![main1](https://github.com/RDDcat/postrofit/assets/55569476/bc96eb0e-054e-4d59-a419-a884d55ab4d8) | ![main2](https://github.com/RDDcat/postrofit/assets/55569476/57988bdf-4f0b-4588-8913-1025b6014479) |
| ![store2](https://github.com/RDDcat/postrofit/assets/55569476/8e8b1b54-7b41-4323-928e-b9e9de50e7ba) | ![order1](https://github.com/RDDcat/postrofit/assets/55569476/0c644120-45a1-4f5d-adb5-688965cbe9f0) | ![delivery2](https://github.com/RDDcat/postrofit/assets/55569476/6b08e456-3351-4dab-9ef4-88b49c24e497) | ![user](https://github.com/RDDcat/postrofit/assets/55569476/93ccdde6-bdd3-4c07-9938-edaed72990c2) |
| ![user_history2](https://github.com/RDDcat/postrofit/assets/55569476/c8c10f1a-3566-4933-91bb-7bc2eef8ad07) |  |  |  |

<br>

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

<br>

## 🧳 API 문서

https://postrofit.gitbook.io/postrofit-api-docs/reference/api-reference

## 🔨 백엔드 구조

 Eureka Discovery - client 구조를 기반으로 개발하였습니다.
 
 Client 중 하나를 Api-gateway로써 역할을 부여하고 모든 요청이 api-gateway를 통과하여 요청하게 하였습니다. (로드밸런싱도 수행)
 
 Client는 현재 Backend-service 하나 밖에 없지만 상항에 맞추어 역할을 분리해나갈 예정입니다.
 
 역할이 분리된다면 서버간의 통신을 Zookeeper-Kafka를 통한 이벤트 스트림으로 처리할 예정입니다.

<br>

## 💾 데이터베이스

현재는 데모버전을 개발중이기 때문에 서버가 뜨면 테스트 데이터가 메모리 디비에 저장이 됩니다. 따라서 서버간의 데이터가 다를 수 있습니다.

<br>

## 📕 기술 스택
### 백엔드
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)
![MariaDB Badge](https://img.shields.io/badge/MariaDB-003545?logo=mariadb&logoColor=fff&style=flat)






