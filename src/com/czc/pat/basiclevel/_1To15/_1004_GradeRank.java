package com.czc.pat.basiclevel._1To15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @see <a href="https://pintia.cn/problem-sets/994805260223102976/problems/994805321640296448">成绩排名</a>
 * 1004 成绩排名 (20分)
 * 读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 *
 * 输入格式：
 * 每个测试输入包含 1 个测试用例，格式为
 *
 * 第 1 行：正整数 n
 * 第 2 行：第 1 个学生的姓名 学号 成绩
 * 第 3 行：第 2 个学生的姓名 学号 成绩
 *   ... ... ...
 * 第 n+1 行：第 n 个学生的姓名 学号 成绩
 * 其中姓名和学号均为不超过 10 个字符的字符串，成绩为 0 到 100 之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
 *
 * 输出格式：
 * 对每个测试用例输出 2 行，第 1 行是成绩最高学生的姓名和学号，第 2 行是成绩最低学生的姓名和学号，字符串间有 1 空格。
 */
public class _1004_GradeRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>(num);
        for(int i = 0; i < num; i++){
            String[] info = scanner.nextLine().split(" ");
            students.add(new Student(info[0], info[1], Integer.parseInt(info[2])));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getGrade() < s2.getGrade()){
                    return 1;
                }
                if(s1.getGrade() == s2.getGrade()){
                    return 0;
                }
                return -1;
            }
        });
        System.out.println(students.get(0).getName() + " " + students.get(0).getId());
        System.out.println(students.get(students.size()-1).getName() + " " + students.get(students.size()-1).getId());
    }
}

class Student{
    private String name;
    private String id;
    private int grade;

    public Student(String name, String id, int grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
