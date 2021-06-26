INSERT INTO member (id, name, nickname) VALUES ('1', '김지나', '노리');
INSERT INTO member (id, name, nickname) VALUES ('2', '성건희', '라임');

INSERT INTO course (course_id, picture_url, title) VALUES ('1', 'https://yt3.ggpht.com/ytc/AAUvwnjrvn97CpfNP72q56YSvLaJJ9kaFtQKpAlBwiHvVg=s900-c-k-c0x00ffffff-no-rj', '자동차 경주 게임');
INSERT INTO course (course_id, picture_url, title) VALUES ('2', 'https://mblogthumb-phinf.pstatic.net/MjAxNzA4MTZfMTAx/MDAxNTAyODQ2ODU0MzM0.aElbyY76L2BRzSfu10Q4nYGekI2GE7Nv5zpGdoYft3Qg.4RoGfGwjzBd1fodXhp5DYrBMe8QXQd7DWDqvGMeIlXEg.GIF.mujinara/00.gif?type=w800', '스프링으로 웹 어플리케이션 구성하기');

INSERT INTO mission (mission_id, title, course_id) VALUES ('1', '1주차 - GIT 다루기', 1);
INSERT INTO mission (mission_id, title, course_id) VALUES ('2', '2주차 - Java 설치', 1);
INSERT INTO mission (mission_id, title, course_id) VALUES ('3', '3주차 - 객체 지향이란', 1);
INSERT INTO mission (mission_id, title, course_id) VALUES ('4', '4주차 - 인터페이스 활용하기', 1);
INSERT INTO mission (mission_id, title, course_id) VALUES ('5', '1주차 - 스프링이 뭐지', 2);

INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('1', '과정 소개 및 일정', '시작~!', '1');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('2', 'GIT 설치', '깃허브에 접속해봅시다.', '1');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('3', 'GIT 명령어', 'git checkout -b 브랜치명', '1');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('4', 'JAVA 장점', '장점은 JVM, 객체지향', '2');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('5', '클래스와 객체', '클래스는 영원하다.', '3');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('6', '확장성을 위해 해야할 것', '인터페이스를 통해 분리해보자.', '4');
INSERT INTO contents (contents_id, title, text, mission_id) VALUES ('7', '봄(스프링)이 온다.', '봄이와~', '5');