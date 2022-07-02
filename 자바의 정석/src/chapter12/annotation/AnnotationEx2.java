package chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationEx2 {
    public static void main(String[] args) {
        // Class의 정보를 담은 class 객체 얻기
        Class<AnnoUseClass> annoUseClassClass = AnnoUseClass.class;

        // 어노테이션 정보 얻기
        AnnoTest annotation = annoUseClassClass.getAnnotation(AnnoTest.class);

        String testedBy = annotation.testedBy(); //"kim"
        String[] testTools = annotation.testTools();//"JUnit4, JUnit5"
    }
}

@Retention(RetentionPolicy.RUNTIME) // 메타 어노테이션
@interface AnnoTest {
    int Count() default 1;
    String testedBy();
    String[] testTools();
}


@AnnoTest(testedBy = "kim", testTools = "Junit4, Junit5") //default는 안넣어줘도 됨
class AnnoUseClass {
}

@Retention(RetentionPolicy.RUNTIME) // 메타 어노테이션
@interface AnnoTest2 {
    int value() ;
}

@AnnoTest2(5)
class AnnoUseClass2 {
}
