# kotlin-minesweeper

요구사항

- [X] 지뢰는 눈에 잘 띄는 것으로 표기한다.
- [X] 지뢰는 랜덤에 가깝게 배치한다.
- 좌표
  - [X] 좌표는 자신을 둘러싸는 8가지 좌표를 제공한다.
  - [X] 둘러싸는 좌표를 구할 때 특정 범위 이내의 좌표들만 구할 수 있다.
- 주변지뢰
  - [X] 지뢰가 아닌경우 주변지뢰를 구한다.
  - [X] 주변지뢰는 자신의 좌표를 둘러싸고있는 8개 좌표 중 지뢰가 존재하는 좌표의 개수이다.
  - [X] 주변지뢰는 0~8 사이의 값이다.
- 지뢰
  - [X] 지뢰는 주변지뢰를 구할 수 없다.

유저 인터페이스
- [X] 높이와 너비, 지뢰 개수를 입력받을 수 있다.
  - [X] 높이, 너비, 지뢰 개수 입력 시 0보다 크지 않은 경우 다시 입력받는다.
  - [X] 지뢰 개수가 지뢰찾기판의 총 블럭 수(높이 X 너비) 보다 많은 경우 다시 입력받는다.
- [X] 지뢰찾기 게임이 시작되면 사용자가 지뢰찾기 좌표를 입력할 수 있다.

게임
- [X] 사용자가 입력한 좌표가 지뢰가 아닌 경우 인접한 8칸의 지뢰의 개수를 알려준다.
  - [X] 인접한 8칸의 지뢰의 개수가 0인 경우 인접한 4칸(동서남북)이 모두 열린다.
- [ ] 승리: 사용자가 지뢰를 제외한 모든 좌표를 찾는 경우 사용자는 승리한다.
- [ ] 패배: 사용자가 입력한 좌표가 지뢰인 경우 사용자는 패배한다.
