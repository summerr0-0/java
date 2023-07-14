# validation

> _유효성 검사할때 일일히 if로 하나하나 체크하지말고 간편하게 어노테이션으로 설정하자!_

-   spring boot 2.3 v부터는 **spring-boot-starter-web** 의존성 내부에 있던 **validation 이 없어져서** 따로 의존성을 추가해야함

## 의존성 추가

```java
//gradle

implementation "org.springframework.boot:spring-boot-starter-validation"

//maven
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
			<version>2.5.6</version>
</dependency>
```

## 어노테이션 상세

-   내용에 `message=""` 를 이용해 추가로 오류 메시지를 적을 수 있다

```java
@Null  // null만 혀용합니다.
@NotNull  // null을 허용하지 않습니다. "", " "는 허용합니다.
@NotEmpty  // null, ""을 허용하지 않습니다. " "는 허용합니다.
@NotBlank  // null, "", " " 모두 허용하지 않습니다.

@Email  // 이메일 형식을 검사합니다. 다만 ""의 경우를 통과 시킵니다. @Email 보다 아래 나올 @Patten을 통한 정규식 검사를 더 많이 사용합니다.
@Pattern(regexp = )  // 정규식을 검사할 때 사용됩니다.
@Size(min=, max=)  // 길이를 제한할 때 사용됩니다. (리스트용)

@Max(value = )  // value 이하의 값을 받을 때 사용됩니다.
@Min(value = )  // value 이상의 값을 받을 때 사용됩니다.

@Positive  // 값을 양수로 제한합니다.
@PositiveOrZero  // 값을 양수와 0만 가능하도록 제한합니다.

@Negative  // 값을 음수로 제한합니다.
@NegativeOrZero  // 값을 음수와 0만 가능하도록 제한합니다.

@Future  // 현재보다 미래
@Past  // 현재보다 과거

@AssertFalse  // false 여부, null은 체크하지 않습니다.
@AssertTrue  // true 여부, null은 체크하지 않습니다.
```

## 사용 예제

-   Request Dto에 다음과 같이 설정해주면 된다

```java
		@NotBlank(message = "여기다가 추가로 메시지를 적어도 된다")
    private String adverId;

    @NotBlank
    private String isPc;

    @NotNull
    @Size(min = 1)
    private List<String> pcodeList;

    @Positive
    private int pageNum;

    @Positive
    private int viewCntNum;

```

## 컨트롤러 / validation 오류 예제

Request Dto 앞에 `@Validated` 사용해서 사용하면 된다

```jsx
@RequestMapping(value = "/ctgrPrdtStatus/retrieve", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CtgrPrdtStatusDto ctgrPrdtStatusRetrieveMethodPost(@Parameter @RequestBody @Validated CtgrPrdtStatusReqDto reqBody, BindingResult bindingResult) {
        return prdtAnalysisService.getCtgrPrdtStatusList(reqBody, bindingResult);
    }
```

-   예외사항 만들때 `BindingResult` 사용 (근데 다른 예제에서는`Errors` 사용함..)

```java
// 회원가입
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Validated UserRequestDto.Signup userSignup, Errors errors) {
        // validation check
        if(errors.hasErrors()) {
            return response.invalidFields(common.refineErrors(errors));
        }
        return userService.signUp(userSignup);
    }

```

-   `if(bindingResult.hasErrors())` 를 이용해서 예외사항이 발생했을 때 처리할 내용을 적는다

####  @Valid, @Validated 차이

@Valid는 Java 에서 지원해주는 어노테이션 @Validated는 Spring에서 지원해주는 어노테이션

@Validated는 @Valid의 기능을 포함하기 때문에 @Valid를 적용한 곳이면 @Validated로 변경할 수 있다

@Validated는 유효성을 검토할 그룹을 지정할 수 있는 기능을 추가로 가지고 있다
