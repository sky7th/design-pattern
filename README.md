[@ 디자인 패턴 이미지로 한눈에 보기](./design-pattern-image.md)

---

![gof_types](./gof_types.png)

> GoF(Gang of Four)에서는 23가지 디자인 패턴을 3가지 유형으로 분류합니다.

### Creational Pattern
- 객체를 생성하는데 관련된 패턴들
- 객체가 생성되는 과정의 유연성을 높이고 코드의 유지를 쉽게 함

### Structural Pattern
- 프로그램 구조에 관련된 패턴들
- 프로그램 내의 자료구조나 인터페이스 구조 등 프로그램의 구조를 설계하는데 활용할 수 있는 패턴들

### Behavioral Pattern
- 반복적으로 사용되는 객체들의 상호작용을 패턴화 해놓은 것들

---

## Creational Pattern
### Singleton
전역 변수를 사용하지 않고 객체를 하나만 생성 하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴

#### [예제](.src/java/com/sky7th/designpattern/singleton) 요구사항
- 프린터 객체를 하나만 생성해서 전역에서 공유


## Structural Pattern


## Behavioral Pattern
### Template Method
공통적인 프로세스를 묶어 주기 !

어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴

#### [예제](.src/java/com/sky7th/designpattern/templatemethod) 요구사항
- 엘레베이터 모터 종류마다 고유의 작동 방식이 존재함

### Strategy
행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴

전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다.
> 전략이란, 어떤 목적을 달성하기 위해 일을 수행하는 방식, 비즈니스 규칙, 문제를 해결하는 알고리즘 등

#### [예제](.src/java/com/sky7th/designpattern/strategy) 요구사항
- 새로운 기능의 추가(새로운 이동, 공격 기능)가 기존의 코드에 영향을 미치지 못하게 해야함
