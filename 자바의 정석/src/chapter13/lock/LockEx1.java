package chapter13.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 학생 1명과 조교 1명이 교수님 1명에게 질문하는 예제
 * 교수님라는 자원을 공유한다.
 * 학생이 질문하면 조교가 그 다음에 질문할 수 있고
 * 조교가 질문하면 그 다음에 학생이 질문할 수 있다.
 */
public class LockEx1 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        new Thread(new Student(professor), "student kim").start();
        new Thread(new JoGyo(professor), "assistant choi").start();

        try{Thread.sleep(20000);}catch (InterruptedException e){}
        System.exit(0);
    }
}

class Student implements Runnable {
    Professor professor; // shared resource

    Student(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void run() {
        while (true) {
            professor.ask();
        }
    }
}
class JoGyo implements Runnable {
    Professor professor; // shared resource

    JoGyo(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void run() {
        while (true) {
            try {Thread.sleep(100);} catch (InterruptedException e) {}//catch
            professor.ask();
        }
    }
}

class Professor {
    private final ReentrantLock lock = new ReentrantLock();

    Condition forJoGyo = lock.newCondition();
    Condition forStudent = lock.newCondition();

    // 교수님께 질문하기
    public void ask() {
        lock.lock(); // sync -- start
        String name = Thread.currentThread().getName();
        System.out.println(name + ": have a question. professor!");
        for (int i = 0; i < 5; i++) {
            try {Thread.sleep(500);} catch (InterruptedException e) {}
            System.out.println("professor: " + "explaining.." + i + " " + name + " listening.." );
        }//for
        System.out.println(name + ": thanks professor");
        if (name.contains("assistant")) {
            forStudent.signal(); // 학생 깨우기
            try{forJoGyo.await();}catch (InterruptedException e){} // 조교 재우기

        }
        else if (name.contains("student")) {
            forJoGyo.signal(); // 조교 깨우기
            try{forStudent.await();}catch (InterruptedException e){} // 학생 재우기

        }
        lock.unlock(); // sync -- end
    }//ask
}
