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

# Creational Pattern
## Singleton
전역 변수를 사용하지 않고 객체를 하나만 생성 하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴

[예제](.src/java/com/sky7th/designpattern/singleton) 요구사항
- 프린터 객체를 하나만 생성해서 전역에서 공유

## Factory Method
객체 생성 처리를 서브 클래스로 분리 해 처리하도록 캡슐화하는 패턴

구조와 구현의 분리

[예제](.src/java/com/sky7th/designpattern/factorymethod) 요구사항
- 주어진 기능을 실제로 제공하는 적절한 클래스 생성 작업을 별도의 클래스/메서드로 분리시켜야 한다.
- 2가지 방식으로 구현해보기
  - 전략 패턴 + 싱글톤 패턴
  - 전략 패턴 + 싱글톤 패턴 + 템플릿 메서드 패턴

## Abstract Factory
구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴

객체 생성의 가상화

[예제](.src/java/com/sky7th/designpattern/abstractfactory) 요구사항
- 엘리베이터 부품 업체 변경하기
- 여러 제조 업체의 부품을 사용하더라도 같은 동작을 지원하게 한다.
- 코드의 변경을 최소화 한다.

# Structural Pattern
## Decorator
객체의 결합 을 통해 기능을 동적으로 유연하게 확장 할 수 있게 해주는 패턴

동적으로 책임을 추가

[예제](.src/java/com/sky7th/designpattern/decorator) 요구사항
- 기본 도로 표시 기능에 차선 표시, 교통량 표시의 2가지 추가 기능이 있을 때 추가 기능의 모든 조합은 4가지가 된다.

# Behavioral Pattern

## Template Method
공통적인 프로세스를 묶어 주기 !

어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴

[예제](.src/java/com/sky7th/designpattern/templatemethod) 요구사항
- 엘레베이터 모터 종류마다 고유의 작동 방식이 존재함

## Strategy
행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴

전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다.
> 전략이란, 어떤 목적을 달성하기 위해 일을 수행하는 방식, 비즈니스 규칙, 문제를 해결하는 알고리즘 등

[예제](.src/java/com/sky7th/designpattern/strategy) 요구사항
- 새로운 기능의 추가(새로운 이동, 공격 기능)가 기존의 코드에 영향을 미치지 못하게 해야함
