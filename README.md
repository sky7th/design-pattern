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

#### [예제](.src/) 요구사항
- 프린터 객체를 하나만 생성해서 전역에서 공유



