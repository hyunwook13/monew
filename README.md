# Monew
세상의 모든 뉴스

---

### 팀원 구성  
- 서경원 ([Github](https://github.com/SeoGyeongWon))  
- 정진혁 (개인 Github 링크)  
- 이치호 (개인 Github 링크)  
- 박지훈 (개인 Github 링크)  
- 이현욱 (개인 Github 링크)

---

### 프로젝트 소개  
코드잇 스프린트 백엔드 과정 중급 프로젝트  
프로젝트 기간: 2025.11.21 ~ 2025.12.12

---

## 기술 스택  
- **Backend**: Spring Boot, Spring Data JPA  
- **Database**: Postgresql  
- **공통 Tool**: Git & Github, Discord, Notion

---

### 팀원별 구현 기능 상세  
**이현욱**
- 학생 시간 정보 관리 API  
- 실시간 접속 현황 API  
- 개인정보 수정/탈퇴 API  
- 공용 Modal API
  
**서경원**
- 소셜 로그인 API  
  - Google OAuth 2.0 기반 로그인  
  - 로그인 후 추가 정보 입력 API  
- 회원 추가 정보 입력 API  
  - 관리자/학생 조건부 입력 처리  

**정진혁**  
- 회원별 권한 관리 (Spring Security)  
- 관리자/사용자 구분 라우팅  
- 반응형 레이아웃 API 개발  

**이치호** 
- 수강생 정보 관리 API  
  - 학생 정보 CRUD  
  - 수강 정보 조회 API  
- 공용 Button API  

**박지훈**  
- 관리자 API  
  - @PathVariable 기반 동적 라우팅  
  - 학생 정보 수정(PATCH), 삭제(DELETE)  
- 학생 정보 CRUD  
- 회원 관리 슬라이더(Carousel) API  


---

### 구현 홈페이지  
[https://www.codeit.kr/](http://15.164.173.253/)

---

### 프로젝트 발표 자료  

- [(3팀_모뉴 개별 발표 자료)](https://file.notion.so/f/f/a29b669d-e680-438e-b18c-08888fc54a21/18602c25-53b5-4534-8135-4c8c065dd6b8/3%E1%84%90%E1%85%B5%E1%86%B7_%E1%84%86%E1%85%A9%E1%84%82%E1%85%B2_%E1%84%80%E1%85%A2%E1%84%87%E1%85%A7%E1%86%AF_%E1%84%87%E1%85%A1%E1%86%AF%E1%84%91%E1%85%AD%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD.pdf?table=block&id=2c36fd22-8e8d-808e-87bc-f34e3c806b3f&spaceId=a29b669d-e680-438e-b18c-08888fc54a21&expirationTimestamp=1765555200000&signature=2ZogsVN3Gd3I42eoNwIrCQlE27sbDOHUbt8WVSHSA1M&downloadName=3%E1%84%90%E1%85%B5%E1%86%B7_%E1%84%86%E1%85%A9%E1%84%82%E1%85%B2_%E1%84%80%E1%85%A2%E1%84%87%E1%85%A7%E1%86%AF+%E1%84%87%E1%85%A1%E1%86%AF%E1%84%91%E1%85%AD%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD.pdf)

- [(3팀_모뉴_통합 발표 자료)](https://file.notion.so/f/f/a29b669d-e680-438e-b18c-08888fc54a21/e558f562-4293-4c2c-83aa-77ae0f11565b/3%E1%84%90%E1%85%B5%E1%86%B7_%E1%84%86%E1%85%A9%E1%84%82%E1%85%B2_%E1%84%90%E1%85%A9%E1%86%BC%E1%84%92%E1%85%A1%E1%86%B8_%E1%84%87%E1%85%A1%E1%86%AF%E1%84%91%E1%85%AD_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD.pdf?table=block&id=2c36fd22-8e8d-808e-87bc-f34e3c806b3f&spaceId=a29b669d-e680-438e-b18c-08888fc54a21&expirationTimestamp=1765555200000&signature=Mb_RwovmqaYPXLr3XnTzm9zd2zdX6qKoL26XqvT-otM&downloadName=3%E1%84%90%E1%85%B5%E1%86%B7_%E1%84%86%E1%85%A9%E1%84%82%E1%85%B2_%E1%84%90%E1%85%A9%E1%86%BC%E1%84%92%E1%85%A1%E1%86%B8+%E1%84%87%E1%85%A1%E1%86%AF%E1%84%91%E1%85%AD+%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD.pdf)

- [(3팀_모뉴_시연 영상)](https://drive.google.com/file/d/1wUmaIYFbRFfkYX4RzdGT0XubJW7aSWac/view)


---

## 파일 구조  
```
📦 
├─ .dockerignore
├─ .env.template
├─ .gitattributes
├─ .github
│  ├─ ISSUE_TEMPLATE
│  │  ├─ todo-템플릿.md
│  │  ├─ 기능-요구사항-템플릿.md
│  │  └─ 세부-기능-요구사항-템플릿.md
│  ├─ PULL_REQUEST_TEMPLATE.md
│  └─ workflows
│     ├─ aws-connection-test.yml
│     └─ deploy.yml
├─ .gitignore
├─ .logs
│  ├─ application-error.log
│  └─ application.log
├─ Dockerfile
├─ README.md
├─ build.gradle
├─ build
│  ├─ classes
│  │  └─ java
│  │     ├─ main
│  │     │  └─ com
│  │     │     └─ team03
│  │     │        └─ monew
│  │     │           ├─ MonewApplication.class
│  │     │           ├─ article
│  │     │           │  ├─ config
│  │     │           │  │  └─ ArticleQuerydslConfig.class
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ Article$ArticleBuilder.class
│  │     │           │  │  ├─ Article.class
│  │     │           │  │  ├─ ArticleSourceType.class
│  │     │           │  │  ├─ QArticle.class
│  │     │           │  │  └─ package-info.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ ArticleCreateRequest.class
│  │     │           │  │  ├─ ArticleDeleteRequest.class
│  │     │           │  │  ├─ ArticleDto.class
│  │     │           │  │  ├─ ArticleResponseDto.class
│  │     │           │  │  └─ CursorPageResponseArticleDto.class
│  │     │           │  ├─ exception
│  │     │           │  │  └─ ArticleErrorCode.class
│  │     │           │  ├─ repository
│  │     │           │  │  ├─ ArticleQueryRepository.class
│  │     │           │  │  ├─ ArticleQueryRepositoryImpl.class
│  │     │           │  │  └─ ArticleRepository.class
│  │     │           │  └─ service
│  │     │           │     ├─ ArticleService.class
│  │     │           │     └─ BasicArticleService.class
│  │     │           ├─ articleCollect
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ ArticlesFeed.class
│  │     │           │  │  ├─ FetchedArticles$FetchedArticlesBuilder.class
│  │     │           │  │  ├─ FetchedArticles.class
│  │     │           │  │  └─ FilteredArticlesTask.class
│  │     │           │  ├─ event
│  │     │           │  │  ├─ ArticlesCollectedEvent.class
│  │     │           │  │  └─ ArticlesNotificationBatchAggregator.class
│  │     │           │  ├─ exception
│  │     │           │  │  ├─ RssFetchException.class
│  │     │           │  │  └─ RssParserNotFoundException.class
│  │     │           │  ├─ infrastructure
│  │     │           │  │  ├─ client
│  │     │           │  │  │  ├─ HttpConfig.class
│  │     │           │  │  │  ├─ HttpRssClient.class
│  │     │           │  │  │  └─ RssClient.class
│  │     │           │  │  ├─ parser
│  │     │           │  │  │  ├─ ChosunRssParser.class
│  │     │           │  │  │  ├─ HankyungRssParser.class
│  │     │           │  │  │  ├─ RssParser.class
│  │     │           │  │  │  ├─ StaxRssParser.class
│  │     │           │  │  │  └─ YonhapRssParser.class
│  │     │           │  │  └─ queue
│  │     │           │  │     ├─ ArticlesQueue.class
│  │     │           │  │     └─ InMemoryArticlesQueue.class
│  │     │           │  ├─ mapper
│  │     │           │  │  └─ ArticlesMapper.class
│  │     │           │  ├─ scheduler
│  │     │           │  │  └─ ArticlesRssScheduler.class
│  │     │           │  └─ service
│  │     │           │     ├─ ArticlesCollectService.class
│  │     │           │     ├─ ArticlesConsumeService.class
│  │     │           │     ├─ CollectService.class
│  │     │           │     └─ KeywordFilterService.class
│  │     │           ├─ articleviews
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ ArticleViews.class
│  │     │           │  │  └─ QArticleViews.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ ArticleViewDto.class
│  │     │           │  │  └─ ArticleViewsActivityDto.class
│  │     │           │  ├─ repository
│  │     │           │  │  └─ ArticleViewsRepository.class
│  │     │           │  └─ service
│  │     │           │     ├─ ArticleViewsService.class
│  │     │           │     └─ BasicArticleViewsService.class
│  │     │           ├─ comment
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ Comment.class
│  │     │           │  │  └─ QComment.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ CommentActivityDto.class
│  │     │           │  │  ├─ CommentDto.class
│  │     │           │  │  ├─ CommentRegisterRequest.class
│  │     │           │  │  ├─ CommentUpdateRequest.class
│  │     │           │  │  ├─ CommentUserIdRequest.class
│  │     │           │  │  ├─ CursorPageRequestCommentDto$CursorPageRequestCommentDtoBuilder.class
│  │     │           │  │  ├─ CursorPageRequestCommentDto.class
│  │     │           │  │  └─ CursorPageResponseCommentDto.class
│  │     │           │  ├─ repository
│  │     │           │  │  ├─ CommentRepository.class
│  │     │           │  │  ├─ CommentRepositoryCustom.class
│  │     │           │  │  └─ CommentRepositoryCustomImpl.class
│  │     │           │  └─ service
│  │     │           │     ├─ BasicCommentService.class
│  │     │           │     └─ CommentService.class
│  │     │           ├─ commentlike
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ CommentLike.class
│  │     │           │  │  └─ QCommentLike.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ CommentLikeActivityDto.class
│  │     │           │  │  └─ CommentLikeDto.class
│  │     │           │  ├─ repository
│  │     │           │  │  └─ CommentLikeRepository.class
│  │     │           │  └─ service
│  │     │           │     ├─ BasicCommentLikeService.class
│  │     │           │     └─ CommentLikeService.class
│  │     │           ├─ common
│  │     │           │  ├─ Common.class
│  │     │           │  ├─ customerror
│  │     │           │  │  ├─ ErrorCode.class
│  │     │           │  │  ├─ ErrorResponse.class
│  │     │           │  │  ├─ GlobalExceptionHandler.class
│  │     │           │  │  └─ MonewException.class
│  │     │           │  └─ logging
│  │     │           │     └─ LogFilter.class
│  │     │           ├─ interest
│  │     │           │  ├─ controller
│  │     │           │  │  └─ InterestController.class
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ Interest$InterestBuilder.class
│  │     │           │  │  ├─ Interest.class
│  │     │           │  │  └─ QInterest.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ CursorPageResponseInterestDto$CursorPageResponseInterestDtoBuilder.class
│  │     │           │  │  ├─ CursorPageResponseInterestDto.class
│  │     │           │  │  ├─ CursorPagingInfo.class
│  │     │           │  │  ├─ InterestDto$InterestDtoBuilder.class
│  │     │           │  │  ├─ InterestDto.class
│  │     │           │  │  ├─ InterestRegisterRequest.class
│  │     │           │  │  ├─ InterestSearchRequest$InterestSearchRequestBuilder.class
│  │     │           │  │  ├─ InterestSearchRequest.class
│  │     │           │  │  └─ InterestUpdateRequest.class
│  │     │           │  ├─ exception
│  │     │           │  │  ├─ DuplicateInterestNameException.class
│  │     │           │  │  ├─ InterestErrorCode.class
│  │     │           │  │  └─ InterestsNotFoundException.class
│  │     │           │  ├─ mapper
│  │     │           │  │  ├─ InterestMapper.class
│  │     │           │  │  └─ InterestMapperImpl.class
│  │     │           │  ├─ repository
│  │     │           │  │  ├─ InterestRepository.class
│  │     │           │  │  ├─ InterestRepositoryCustom.class
│  │     │           │  │  └─ InterestRepositoryCustomImpl.class
│  │     │           │  ├─ service
│  │     │           │  │  ├─ BasicInterestService.class
│  │     │           │  │  └─ InterestService.class
│  │     │           │  └─ util
│  │     │           │     └─ SimilarityCheck.class
│  │     │           ├─ notification
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ NoticeResourceType.class
│  │     │           │  │  ├─ Notification.class
│  │     │           │  │  └─ QNotification.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ CursorPageResponseNotificationDto.class
│  │     │           │  │  ├─ NotificationAllCheckDto.class
│  │     │           │  │  ├─ NotificationCheckDto.class
│  │     │           │  │  ├─ NotificationCreateDto$NotificationCreateDtoBuilder.class
│  │     │           │  │  ├─ NotificationCreateDto.class
│  │     │           │  │  └─ NotificationDto.class
│  │     │           │  ├─ event
│  │     │           │  │  └─ NotificationEventHandler.class
│  │     │           │  ├─ repository
│  │     │           │  │  ├─ NotificationRepository.class
│  │     │           │  │  ├─ NotificationRepositoryCustom.class
│  │     │           │  │  └─ NotificationRepositoryCustomImpl.class
│  │     │           │  ├─ scheduler
│  │     │           │  │  └─ NotificationScheduler.class
│  │     │           │  └─ service
│  │     │           │     ├─ BasicNotificationService.class
│  │     │           │     └─ NotificationService.class
│  │     │           ├─ subscribe
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ QSubscribe.class
│  │     │           │  │  ├─ Subscribe$SubscribeBuilder.class
│  │     │           │  │  └─ Subscribe.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ SubscribeDto$SubscribeDtoBuilder.class
│  │     │           │  │  └─ SubscribeDto.class
│  │     │           │  ├─ exception
│  │     │           │  │  ├─ SubscribeErrorCode.class
│  │     │           │  │  └─ SubscriptionNotFoundException.class
│  │     │           │  ├─ mapper
│  │     │           │  │  ├─ SubscribeMapper.class
│  │     │           │  │  └─ SubscribeMapperImpl.class
│  │     │           │  ├─ repository
│  │     │           │  │  └─ SubscribeRepository.class
│  │     │           │  └─ service
│  │     │           │     ├─ BasicSubscribeService.class
│  │     │           │     └─ SubscribeService.class
│  │     │           ├─ user
│  │     │           │  ├─ controller
│  │     │           │  │  └─ UserController.class
│  │     │           │  ├─ domain
│  │     │           │  │  ├─ QUser.class
│  │     │           │  │  ├─ User$UserBuilder.class
│  │     │           │  │  └─ User.class
│  │     │           │  ├─ dto
│  │     │           │  │  ├─ UserActivityDto.class
│  │     │           │  │  ├─ UserDto.class
│  │     │           │  │  ├─ UserLoginRequest.class
│  │     │           │  │  ├─ UserLoginResponse.class
│  │     │           │  │  ├─ UserRegisterRequest.class
│  │     │           │  │  └─ UserUpdateRequest.class
│  │     │           │  ├─ exception
│  │     │           │  │  ├─ BusinessException.class
│  │     │           │  │  ├─ DuplicateEmailException.class
│  │     │           │  │  ├─ DuplicateNicknameException.class
│  │     │           │  │  ├─ InvalidPasswordException.class
│  │     │           │  │  ├─ UserErrorCode.class
│  │     │           │  │  └─ UserNotFoundException.class
│  │     │           │  ├─ filter
│  │     │           │  │  └─ AuthenticationFilter.class
│  │     │           │  ├─ mapper
│  │     │           │  │  ├─ UserMapper.class
│  │     │           │  │  └─ UserMapperImpl.class
│  │     │           │  ├─ repository
│  │     │           │  │  └─ UserRepository.class
│  │     │           │  ├─ scheduler
│  │     │           │  │  └─ UserDeletionScheduler.class
│  │     │           │  └─ service
│  │     │           │     ├─ BasicUserService.class
│  │     │           │     └─ UserService.class
│  │     │           └─ web
│  │     │              └─ controller
│  │     │                 ├─ ArticleController.class
│  │     │                 ├─ ArticleViewController.class
│  │     │                 ├─ CommentController.class
│  │     │                 ├─ InterestController.class
│  │     │                 ├─ NotificationController.class
│  │     │                 ├─ UserActivitiesController.class
│  │     │                 └─ api
│  │     │                    ├─ ArticleApi.class
│  │     │                    ├─ ArticleViewApi.class
│  │     │                    └─ InterestApi.class
│  │     └─ test
│  │        └─ com
│  │           └─ team03
│  │              └─ monew
│  │                 ├─ MonewApplicationTests.class
│  │                 ├─ article
│  │                 │  ├─ config
│  │                 │  │  └─ JpaQueryFactoryTestConfig.class
│  │                 │  ├─ fixture
│  │                 │  │  └─ ArticleFixture.class
│  │                 │  ├─ repository
│  │                 │  │  └─ ArticleQueryRepositoryTest.class
│  │                 │  └─ service
│  │                 │     ├─ ArticleCreateTest.class
│  │                 │     ├─ ArticleDeleteTest.class
│  │                 │     └─ ArticleFindDetailTest.class
│  │                 ├─ articleCollect
│  │                 │  ├─ event
│  │                 │  │  └─ ArticlesNotificationBatchAggregatorTest.class
│  │                 │  ├─ infrastructure
│  │                 │  │  ├─ client
│  │                 │  │  │  └─ HttpRssClientTest.class
│  │                 │  │  └─ parser
│  │                 │  │     ├─ ChosunRssParserTest.class
│  │                 │  │     ├─ HankyungRssParserTest.class
│  │                 │  │     └─ YonhapRssParserTest.class
│  │                 │  └─ service
│  │                 │     ├─ ArticlesCollectServiceTest.class
│  │                 │     ├─ ArticlesConsumeServiceTest.class
│  │                 │     └─ KeywordFilterServiceTest.class
│  │                 ├─ articleviews
│  │                 │  └─ service
│  │                 │     └─ ViewCountTest.class
│  │                 ├─ interest
│  │                 │  ├─ Fixture
│  │                 │  │  └─ InterestFixture.class
│  │                 │  ├─ controller
│  │                 │  │  ├─ InterestCreateTest.class
│  │                 │  │  ├─ InterestDeleteTest.class
│  │                 │  │  ├─ InterestListTest.class
│  │                 │  │  └─ InterestUpdateTest.class
│  │                 │  ├─ repository
│  │                 │  │  └─ InterestRepositoryTest.class
│  │                 │  └─ service
│  │                 │     ├─ InterestCreateTest.class
│  │                 │     ├─ InterestDeleteTest.class
│  │                 │     ├─ InterestListTest.class
│  │                 │     └─ InterestUpdateTest.class
│  │                 ├─ subscribe
│  │                 │  ├─ controller
│  │                 │  │  ├─ SubscribeCreateTest.class
│  │                 │  │  └─ SubscribeDeleteTest.class
│  │                 │  ├─ fixture
│  │                 │  │  └─ SubscribeFixture.class
│  │                 │  ├─ repository
│  │                 │  │  └─ SubscribeRepositoryTest.class
│  │                 │  └─ service
│  │                 │     ├─ SubscribeCreateTest.class
│  │                 │     └─ SubscribeDeleteTest.class
│  │                 └─ user
│  │                    ├─ controller
│  │                    │  └─ UserControllerTest.class
│  │                    ├─ domain
│  │                    │  ├─ UserRepositoryTest.class
│  │                    │  └─ UserTest.class
│  │                    └─ service
│  │                       └─ UserServiceTest.class
│  ├─ generated
│  │  └─ sources
│  │     └─ annotationProcessor
│  │        └─ java
│  │           └─ main
│  │              └─ com
│  │                 └─ team03
│  │                    └─ monew
│  │                       ├─ article
│  │                       │  └─ domain
│  │                       │     └─ QArticle.java
│  │                       ├─ articleviews
│  │                       │  └─ domain
│  │                       │     └─ QArticleViews.java
│  │                       ├─ comment
│  │                       │  └─ domain
│  │                       │     └─ QComment.java
│  │                       ├─ commentlike
│  │                       │  └─ domain
│  │                       │     └─ QCommentLike.java
│  │                       ├─ interest
│  │                       │  ├─ domain
│  │                       │  │  └─ QInterest.java
│  │                       │  └─ mapper
│  │                       │     └─ InterestMapperImpl.java
│  │                       ├─ notification
│  │                       │  └─ domain
│  │                       │     └─ QNotification.java
│  │                       ├─ subscribe
│  │                       │  ├─ domain
│  │                       │  │  └─ QSubscribe.java
│  │                       │  └─ mapper
│  │                       │     └─ SubscribeMapperImpl.java
│  │                       └─ user
│  │                          ├─ domain
│  │                          │  └─ QUser.java
│  │                          └─ mapper
│  │                             └─ UserMapperImpl.java
│  ├─ libs
│  │  ├─ monew-0.0.1-SNAPSHOT-plain.jar
│  │  └─ monew-0.0.1-SNAPSHOT.jar
│  ├─ reports
│  │  └─ tests
│  │     └─ test
│  │        ├─ classes
│  │        │  ├─ com.team03.monew.MonewApplicationTests.html
│  │        │  ├─ com.team03.monew.article.repository.ArticleQueryRepositoryTest.html
│  │        │  ├─ com.team03.monew.article.service.ArticleCreateTest.html
│  │        │  ├─ com.team03.monew.article.service.ArticleDeleteTest.html
│  │        │  ├─ com.team03.monew.article.service.ArticleFindDetailTest.html
│  │        │  ├─ com.team03.monew.articleCollect.event.ArticlesNotificationBatchAggregatorTest.html
│  │        │  ├─ com.team03.monew.articleCollect.infrastructure.client.HttpRssClientTest.html
│  │        │  ├─ com.team03.monew.articleCollect.infrastructure.parser.ChosunRssParserTest.html
│  │        │  ├─ com.team03.monew.articleCollect.infrastructure.parser.HankyungRssParserTest.html
│  │        │  ├─ com.team03.monew.articleCollect.infrastructure.parser.YonhapRssParserTest.html
│  │        │  ├─ com.team03.monew.articleCollect.service.ArticlesCollectServiceTest.html
│  │        │  ├─ com.team03.monew.articleCollect.service.ArticlesConsumeServiceTest.html
│  │        │  ├─ com.team03.monew.articleCollect.service.KeywordFilterServiceTest.html
│  │        │  ├─ com.team03.monew.articleviews.service.ViewCountTest.html
│  │        │  ├─ com.team03.monew.interest.controller.InterestCreateTest.html
│  │        │  ├─ com.team03.monew.interest.controller.InterestDeleteTest.html
│  │        │  ├─ com.team03.monew.interest.controller.InterestListTest.html
│  │        │  ├─ com.team03.monew.interest.controller.InterestUpdateTest.html
│  │        │  ├─ com.team03.monew.interest.repository.InterestRepositoryTest.html
│  │        │  ├─ com.team03.monew.interest.service.InterestCreateTest.html
│  │        │  ├─ com.team03.monew.interest.service.InterestDeleteTest.html
│  │        │  ├─ com.team03.monew.interest.service.InterestListTest.html
│  │        │  ├─ com.team03.monew.interest.service.InterestUpdateTest.html
│  │        │  ├─ com.team03.monew.subscribe.controller.SubscribeCreateTest.html
│  │        │  ├─ com.team03.monew.subscribe.controller.SubscribeDeleteTest.html
│  │        │  ├─ com.team03.monew.subscribe.service.SubscribeCreateTest.html
│  │        │  ├─ com.team03.monew.subscribe.service.SubscribeDeleteTest.html
│  │        │  ├─ com.team03.monew.user.controller.UserControllerTest.html
│  │        │  ├─ com.team03.monew.user.domain.UserRepositoryTest.html
│  │        │  ├─ com.team03.monew.user.domain.UserTest.html
│  │        │  └─ com.team03.monew.user.service.UserServiceTest.html
│  │        ├─ css
│  │        │  ├─ base-style.css
│  │        │  └─ style.css
│  │        ├─ index.html
│  │        ├─ js
│  │        │  └─ report.js
│  │        └─ packages
│  │           ├─ com.team03.monew.article.repository.html
│  │           ├─ com.team03.monew.article.service.html
│  │           ├─ com.team03.monew.articleCollect.event.html
│  │           ├─ com.team03.monew.articleCollect.infrastructure.client.html
│  │           ├─ com.team03.monew.articleCollect.infrastructure.parser.html
│  │           ├─ com.team03.monew.articleCollect.service.html
│  │           ├─ com.team03.monew.articleviews.service.html
│  │           ├─ com.team03.monew.html
│  │           ├─ com.team03.monew.interest.controller.html
│  │           ├─ com.team03.monew.interest.repository.html
│  │           ├─ com.team03.monew.interest.service.html
│  │           ├─ com.team03.monew.subscribe.controller.html
│  │           ├─ com.team03.monew.subscribe.service.html
│  │           ├─ com.team03.monew.user.controller.html
│  │           ├─ com.team03.monew.user.domain.html
│  │           └─ com.team03.monew.user.service.html
│  ├─ resolvedMainClassName
│  ├─ resources
│  │  ├─ main
│  │  │  ├─ application-dev.yaml
│  │  │  ├─ application-prod.yaml
│  │  │  ├─ application.yaml
│  │  │  ├─ logback-spring.xml
│  │  │  └─ static
│  │  │     ├─ assets
│  │  │     │  ├─ index-BBLciFoK.js
│  │  │     │  ├─ index-CHX_5t7G.css
│  │  │     │  ├─ landing_comments-BoMt6RvV.svg
│  │  │     │  ├─ landing_interests-CBQzCgwG.svg
│  │  │     │  └─ landing_notifications-BkwzqdfE.svg
│  │  │     ├─ favicon.ico
│  │  │     ├─ fonts
│  │  │     │  └─ pretendard
│  │  │     │     ├─ LICENSE.txt
│  │  │     │     ├─ Pretendard-Bold.woff2
│  │  │     │     ├─ Pretendard-Regular.woff2
│  │  │     │     └─ PretendardVariable.woff2
│  │  │     └─ index.html
│  │  └─ test
│  │     ├─ application-dev.yaml
│  │     ├─ application-prod.yaml
│  │     ├─ application-test.yaml
│  │     ├─ logback-spring.xml
│  │     └─ static
│  │        ├─ assets
│  │        │  ├─ index-BBLciFoK.js
│  │        │  ├─ index-CHX_5t7G.css
│  │        │  ├─ landing_comments-BoMt6RvV.svg
│  │        │  ├─ landing_interests-CBQzCgwG.svg
│  │        │  └─ landing_notifications-BkwzqdfE.svg
│  │        ├─ favicon.ico
│  │        ├─ fonts
│  │        │  └─ pretendard
│  │        │     ├─ LICENSE.txt
│  │        │     ├─ Pretendard-Bold.woff2
│  │        │     ├─ Pretendard-Regular.woff2
│  │        │     └─ PretendardVariable.woff2
│  │        └─ index.html
│  ├─ test-results
│  │  └─ test
│  │     ├─ TEST-com.team03.monew.MonewApplicationTests.xml
│  │     ├─ TEST-com.team03.monew.article.repository.ArticleQueryRepositoryTest.xml
│  │     ├─ TEST-com.team03.monew.article.service.ArticleCreateTest.xml
│  │     ├─ TEST-com.team03.monew.article.service.ArticleDeleteTest.xml
│  │     ├─ TEST-com.team03.monew.article.service.ArticleFindDetailTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.event.ArticlesNotificationBatchAggregatorTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.infrastructure.client.HttpRssClientTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.infrastructure.parser.ChosunRssParserTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.infrastructure.parser.HankyungRssParserTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.infrastructure.parser.YonhapRssParserTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.service.ArticlesCollectServiceTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.service.ArticlesConsumeServiceTest.xml
│  │     ├─ TEST-com.team03.monew.articleCollect.service.KeywordFilterServiceTest.xml
│  │     ├─ TEST-com.team03.monew.articleviews.service.ViewCountTest.xml
│  │     ├─ TEST-com.team03.monew.interest.controller.InterestCreateTest.xml
│  │     ├─ TEST-com.team03.monew.interest.controller.InterestDeleteTest.xml
│  │     ├─ TEST-com.team03.monew.interest.controller.InterestListTest.xml
│  │     ├─ TEST-com.team03.monew.interest.controller.InterestUpdateTest.xml
│  │     ├─ TEST-com.team03.monew.interest.repository.InterestRepositoryTest.xml
│  │     ├─ TEST-com.team03.monew.interest.service.InterestCreateTest.xml
│  │     ├─ TEST-com.team03.monew.interest.service.InterestDeleteTest.xml
│  │     ├─ TEST-com.team03.monew.interest.service.InterestListTest.xml
│  │     ├─ TEST-com.team03.monew.interest.service.InterestUpdateTest.xml
│  │     ├─ TEST-com.team03.monew.subscribe.controller.SubscribeCreateTest.xml
│  │     ├─ TEST-com.team03.monew.subscribe.controller.SubscribeDeleteTest.xml
│  │     ├─ TEST-com.team03.monew.subscribe.service.SubscribeCreateTest.xml
│  │     ├─ TEST-com.team03.monew.subscribe.service.SubscribeDeleteTest.xml
│  │     ├─ TEST-com.team03.monew.user.controller.UserControllerTest.xml
│  │     ├─ TEST-com.team03.monew.user.domain.UserRepositoryTest.xml
│  │     ├─ TEST-com.team03.monew.user.domain.UserTest.xml
│  │     ├─ TEST-com.team03.monew.user.service.UserServiceTest.xml
│  │     └─ binary
│  │        ├─ output.bin
│  │        ├─ output.bin.idx
│  │        └─ results.bin
│  └─ tmp
│     ├─ bootJar
│     │  └─ MANIFEST.MF
│     ├─ compileJava
│     │  └─ previous-compilation-data.bin
│     ├─ compileTestJava
│     │  └─ previous-compilation-data.bin
│     └─ jar
│        └─ MANIFEST.MF
├─ docs
│  └─ presentation
│     ├─ 1.md
│     ├─ 10.md
│     ├─ 11.md
│     ├─ 12.md
│     ├─ 13.md
│     ├─ 16.md
│     ├─ 17.md
│     ├─ 18.md
│     ├─ 2.md
│     ├─ 3.md
│     ├─ 4.md
│     ├─ 5.md
│     ├─ 6.md
│     ├─ 7.md
│     ├─ 8.md
│     ├─ 9.md
│     ├─ hyunwook_1.md
│     └─ personal_code.md
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradlew
├─ gradlew.bat
├─ settings.gradle
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ team03
   │  │        └─ monew
   │  │           ├─ MonewApplication.java
   │  │           ├─ article
   │  │           │  ├─ config
   │  │           │  │  └─ ArticleQuerydslConfig.java
   │  │           │  ├─ domain
   │  │           │  │  ├─ Article.java
   │  │           │  │  ├─ ArticleSourceType.java
   │  │           │  │  └─ package-info.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ ArticleCreateRequest.java
   │  │           │  │  ├─ ArticleDeleteRequest.java
   │  │           │  │  ├─ ArticleDto.java
   │  │           │  │  ├─ ArticleResponseDto.java
   │  │           │  │  └─ CursorPageResponseArticleDto.java
   │  │           │  ├─ exception
   │  │           │  │  └─ ArticleErrorCode.java
   │  │           │  ├─ repository
   │  │           │  │  ├─ ArticleQueryRepository.java
   │  │           │  │  ├─ ArticleQueryRepositoryImpl.java
   │  │           │  │  └─ ArticleRepository.java
   │  │           │  └─ service
   │  │           │     ├─ ArticleService.java
   │  │           │     └─ BasicArticleService.java
   │  │           ├─ articleCollect
   │  │           │  ├─ domain
   │  │           │  │  ├─ ArticlesFeed.java
   │  │           │  │  ├─ FetchedArticles.java
   │  │           │  │  └─ FilteredArticlesTask.java
   │  │           │  ├─ event
   │  │           │  │  ├─ ArticlesCollectedEvent.java
   │  │           │  │  └─ ArticlesNotificationBatchAggregator.java
   │  │           │  ├─ exception
   │  │           │  │  ├─ RssFetchException.java
   │  │           │  │  └─ RssParserNotFoundException.java
   │  │           │  ├─ infrastructure
   │  │           │  │  ├─ client
   │  │           │  │  │  ├─ HttpConfig.java
   │  │           │  │  │  ├─ HttpRssClient.java
   │  │           │  │  │  └─ RssClient.java
   │  │           │  │  ├─ parser
   │  │           │  │  │  ├─ ChosunRssParser.java
   │  │           │  │  │  ├─ HankyungRssParser.java
   │  │           │  │  │  ├─ RssParser.java
   │  │           │  │  │  ├─ StaxRssParser.java
   │  │           │  │  │  └─ YonhapRssParser.java
   │  │           │  │  └─ queue
   │  │           │  │     ├─ ArticlesQueue.java
   │  │           │  │     └─ InMemoryArticlesQueue.java
   │  │           │  ├─ mapper
   │  │           │  │  └─ ArticlesMapper.java
   │  │           │  ├─ scheduler
   │  │           │  │  ├─ ArticleCollectMetricsReporter.java
   │  │           │  │  └─ ArticlesRssScheduler.java
   │  │           │  └─ service
   │  │           │     ├─ ArticlesCollectService.java
   │  │           │     ├─ ArticlesConsumeService.java
   │  │           │     ├─ CollectService.java
   │  │           │     └─ KeywordFilterService.java
   │  │           ├─ articleviews
   │  │           │  ├─ domain
   │  │           │  │  └─ ArticleViews.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ ArticleViewDto.java
   │  │           │  │  └─ ArticleViewsActivityDto.java
   │  │           │  ├─ repository
   │  │           │  │  └─ ArticleViewsRepository.java
   │  │           │  └─ service
   │  │           │     ├─ ArticleViewsService.java
   │  │           │     └─ BasicArticleViewsService.java
   │  │           ├─ comment
   │  │           │  ├─ domain
   │  │           │  │  └─ Comment.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ CommentActivityDto.java
   │  │           │  │  ├─ CommentDto.java
   │  │           │  │  ├─ CommentRegisterRequest.java
   │  │           │  │  ├─ CommentUpdateRequest.java
   │  │           │  │  ├─ CommentUserIdRequest.java
   │  │           │  │  ├─ CursorPageRequestCommentDto.java
   │  │           │  │  └─ CursorPageResponseCommentDto.java
   │  │           │  ├─ repository
   │  │           │  │  ├─ CommentRepository.java
   │  │           │  │  ├─ CommentRepositoryCustom.java
   │  │           │  │  └─ CommentRepositoryCustomImpl.java
   │  │           │  └─ service
   │  │           │     ├─ BasicCommentService.java
   │  │           │     └─ CommentService.java
   │  │           ├─ commentlike
   │  │           │  ├─ domain
   │  │           │  │  └─ CommentLike.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ CommentLikeActivityDto.java
   │  │           │  │  └─ CommentLikeDto.java
   │  │           │  ├─ repository
   │  │           │  │  └─ CommentLikeRepository.java
   │  │           │  └─ service
   │  │           │     ├─ BasicCommentLikeService.java
   │  │           │     └─ CommentLikeService.java
   │  │           ├─ common
   │  │           │  ├─ Common.java
   │  │           │  ├─ customerror
   │  │           │  │  ├─ ErrorCode.java
   │  │           │  │  ├─ ErrorResponse.java
   │  │           │  │  ├─ GlobalExceptionHandler.java
   │  │           │  │  └─ MonewException.java
   │  │           │  └─ logging
   │  │           │     └─ LogFilter.java
   │  │           ├─ interest
   │  │           │  ├─ controller
   │  │           │  │  └─ InterestController.java
   │  │           │  ├─ domain
   │  │           │  │  └─ Interest.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ CursorPageResponseInterestDto.java
   │  │           │  │  ├─ CursorPagingInfo.java
   │  │           │  │  ├─ InterestDto.java
   │  │           │  │  ├─ InterestRegisterRequest.java
   │  │           │  │  ├─ InterestSearchRequest.java
   │  │           │  │  └─ InterestUpdateRequest.java
   │  │           │  ├─ exception
   │  │           │  │  ├─ DuplicateInterestNameException.java
   │  │           │  │  ├─ InterestErrorCode.java
   │  │           │  │  └─ InterestsNotFoundException.java
   │  │           │  ├─ mapper
   │  │           │  │  └─ InterestMapper.java
   │  │           │  ├─ repository
   │  │           │  │  ├─ InterestRepository.java
   │  │           │  │  ├─ InterestRepositoryCustom.java
   │  │           │  │  └─ InterestRepositoryCustomImpl.java
   │  │           │  ├─ service
   │  │           │  │  ├─ BasicInterestService.java
   │  │           │  │  └─ InterestService.java
   │  │           │  └─ util
   │  │           │     └─ SimilarityCheck.java
   │  │           ├─ notification
   │  │           │  ├─ domain
   │  │           │  │  ├─ NoticeResourceType.java
   │  │           │  │  └─ Notification.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ CursorPageResponseNotificationDto.java
   │  │           │  │  ├─ NotificationAllCheckDto.java
   │  │           │  │  ├─ NotificationCheckDto.java
   │  │           │  │  ├─ NotificationCreateDto.java
   │  │           │  │  └─ NotificationDto.java
   │  │           │  ├─ event
   │  │           │  │  └─ NotificationEventHandler.java
   │  │           │  ├─ repository
   │  │           │  │  ├─ NotificationRepository.java
   │  │           │  │  ├─ NotificationRepositoryCustom.java
   │  │           │  │  └─ NotificationRepositoryCustomImpl.java
   │  │           │  ├─ scheduler
   │  │           │  │  └─ NotificationScheduler.java
   │  │           │  └─ service
   │  │           │     ├─ BasicNotificationService.java
   │  │           │     └─ NotificationService.java
   │  │           ├─ subscribe
   │  │           │  ├─ domain
   │  │           │  │  └─ Subscribe.java
   │  │           │  ├─ dto
   │  │           │  │  └─ SubscribeDto.java
   │  │           │  ├─ exception
   │  │           │  │  ├─ SubscribeErrorCode.java
   │  │           │  │  └─ SubscriptionNotFoundException.java
   │  │           │  ├─ mapper
   │  │           │  │  └─ SubscribeMapper.java
   │  │           │  ├─ repository
   │  │           │  │  └─ SubscribeRepository.java
   │  │           │  └─ service
   │  │           │     ├─ BasicSubscribeService.java
   │  │           │     └─ SubscribeService.java
   │  │           ├─ user
   │  │           │  ├─ controller
   │  │           │  │  └─ UserController.java
   │  │           │  ├─ domain
   │  │           │  │  └─ User.java
   │  │           │  ├─ dto
   │  │           │  │  ├─ UserActivityDto.java
   │  │           │  │  ├─ UserDto.java
   │  │           │  │  ├─ UserLoginRequest.java
   │  │           │  │  ├─ UserLoginResponse.java
   │  │           │  │  ├─ UserRegisterRequest.java
   │  │           │  │  └─ UserUpdateRequest.java
   │  │           │  ├─ exception
   │  │           │  │  ├─ BusinessException.java
   │  │           │  │  ├─ DuplicateEmailException.java
   │  │           │  │  ├─ DuplicateNicknameException.java
   │  │           │  │  ├─ InvalidPasswordException.java
   │  │           │  │  ├─ UserErrorCode.java
   │  │           │  │  └─ UserNotFoundException.java
   │  │           │  ├─ filter
   │  │           │  │  └─ AuthenticationFilter.java
   │  │           │  ├─ mapper
   │  │           │  │  └─ UserMapper.java
   │  │           │  ├─ repository
   │  │           │  │  └─ UserRepository.java
   │  │           │  ├─ scheduler
   │  │           │  │  └─ UserDeletionScheduler.java
   │  │           │  └─ service
   │  │           │     ├─ BasicUserService.java
   │  │           │     └─ UserService.java
   │  │           └─ web
   │  │              └─ controller
   │  │                 ├─ ArticleController.java
   │  │                 ├─ ArticleViewController.java
   │  │                 ├─ CommentController.java
   │  │                 ├─ InterestController.java
   │  │                 ├─ NotificationController.java
   │  │                 ├─ UserActivitiesController.java
   │  │                 └─ api
   │  │                    ├─ ArticleApi.java
   │  │                    ├─ ArticleViewApi.java
   │  │                    └─ InterestApi.java
   │  └─ resources
   │     ├─ application-dev.yaml
   │     ├─ application-prod.yaml
   │     ├─ application.yaml
   │     ├─ logback-spring.xml
   │     └─ static
   │        ├─ assets
   │        │  ├─ index-BBLciFoK.js
   │        │  ├─ index-CHX_5t7G.css
   │        │  ├─ landing_comments-BoMt6RvV.svg
   │        │  ├─ landing_interests-CBQzCgwG.svg
   │        │  └─ landing_notifications-BkwzqdfE.svg
   │        ├─ favicon.ico
   │        ├─ fonts
   │        │  └─ pretendard
   │        │     ├─ LICENSE.txt
   │        │     ├─ Pretendard-Bold.woff2
   │        │     ├─ Pretendard-Regular.woff2
   │        │     └─ PretendardVariable.woff2
   │        └─ index.html
   └─ test
      ├─ java
      │  └─ com
      │     └─ team03
      │        └─ monew
      │           ├─ MonewApplicationTests.java
      │           ├─ article
      │           │  ├─ config
      │           │  │  └─ JpaQueryFactoryTestConfig.java
      │           │  ├─ fixture
      │           │  │  └─ ArticleFixture.java
      │           │  ├─ repository
      │           │  │  └─ ArticleQueryRepositoryTest.java
      │           │  └─ service
      │           │     ├─ ArticleCreateTest.java
      │           │     ├─ ArticleDeleteTest.java
      │           │     └─ ArticleFindDetailTest.java
      │           ├─ articleCollect
      │           │  ├─ event
      │           │  │  └─ ArticlesNotificationBatchAggregatorTest.java
      │           │  ├─ infrastructure
      │           │  │  ├─ client
      │           │  │  │  └─ HttpRssClientTest.java
      │           │  │  └─ parser
      │           │  │     ├─ ChosunRssParserTest.java
      │           │  │     ├─ HankyungRssParserTest.java
      │           │  │     └─ YonhapRssParserTest.java
      │           │  └─ service
      │           │     ├─ ArticlesCollectServiceTest.java
      │           │     ├─ ArticlesConsumeServiceTest.java
      │           │     └─ KeywordFilterServiceTest.java
      │           ├─ articleviews
      │           │  └─ service
      │           │     └─ ViewCountTest.java
      │           ├─ interest
      │           │  ├─ Fixture
      │           │  │  └─ InterestFixture.java
      │           │  ├─ controller
      │           │  │  ├─ InterestCreateTest.java
      │           │  │  ├─ InterestDeleteTest.java
      │           │  │  ├─ InterestListTest.java
      │           │  │  └─ InterestUpdateTest.java
      │           │  ├─ repository
      │           │  │  └─ InterestRepositoryTest.java
      │           │  └─ service
      │           │     ├─ InterestCreateTest.java
      │           │     ├─ InterestDeleteTest.java
      │           │     ├─ InterestListTest.java
      │           │     └─ InterestUpdateTest.java
      │           ├─ subscribe
      │           │  ├─ controller
      │           │  │  ├─ SubscribeCreateTest.java
      │           │  │  └─ SubscribeDeleteTest.java
      │           │  ├─ fixture
      │           │  │  └─ SubscribeFixture.java
      │           │  ├─ repository
      │           │  │  └─ SubscribeRepositoryTest.java
      │           │  └─ service
      │           │     ├─ SubscribeCreateTest.java
      │           │     └─ SubscribeDeleteTest.java
      │           └─ user
      │              ├─ controller
      │              │  └─ UserControllerTest.java
      │              ├─ domain
      │              │  ├─ UserRepositoryTest.java
      │              │  └─ UserTest.java
      │              └─ service
      │                 └─ UserServiceTest.java
      └─ resources
         ├─ application-dev.yaml
         ├─ application-prod.yaml
         ├─ application-test.yaml
         ├─ logback-spring.xml
         └─ static
            ├─ assets
            │  ├─ index-BBLciFoK.js
            │  ├─ index-CHX_5t7G.css
            │  ├─ landing_comments-BoMt6RvV.svg
            │  ├─ landing_interests-CBQzCgwG.svg
            │  └─ landing_notifications-BkwzqdfE.svg
            ├─ favicon.ico
            ├─ fonts
            │  └─ pretendard
            │     ├─ LICENSE.txt
            │     ├─ Pretendard-Bold.woff2
            │     ├─ Pretendard-Regular.woff2
            │     └─ PretendardVariable.woff2
            └─ index.html
```
©generated by [Project Tree Generator](https://woochanleee.github.io/project-tree-generator)
