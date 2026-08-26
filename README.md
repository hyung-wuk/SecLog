# SecLog

정보보안 학습 내용을 기록하고 관리하기 위한 Spring Boot 기반 REST API 프로젝트입니다.

## 프로젝트를 시작한 이유

Spring Boot와 JPA를 실제 프로젝트에 적용해보기 위해 개발했습니다.

## 기술 스택

- Java

- Spring Boot

- Spring Data JPA

- MySQL

- Swagger

- Maven

## 주요 기능

- 학습 기록 생성

- 전체 학습 기록 조회

- PK 기반 단건 조회

- PUT 전체 수정

- PATCH 부분 수정

- 학습 기록 삭제

- 입력값 Validation

- 전역 예외 처리

## API

| Method | URL | 기능 |

|---|---|---|

| POST | /api/studies | 학습 기록 생성 |

| GET | /api/studies | 전체 조회 |

| GET | /api/studies/{id} | 단건 조회 |

| PUT | /api/studies/{id} | 전체 수정 |

| PATCH | /api/studies/{id} | 부분 수정 |

| DELETE | /api/studies/{id} | 삭제 |
