package com.czc.pat.basiclevel._1To15;

import javafx.beans.binding.ObjectExpression;

import java.util.*;

/**
 * https://pintia.cn/problem-sets/994805260223102976/problems/994805307551629312
 * 1015 德才论 (25分)
 *
 */
public class _1015_TalentAndVirtue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(" ");
        int personCount = Integer.parseInt(info[0]);
        int requestGrade = Integer.parseInt(info[1]);
        int priorityGrade = Integer.parseInt(info[2]);
        ArrayList<String> lists = new ArrayList<>();
        int index2 = 0, index3 = 0;
        for(int i = 0; i < personCount; i++){
            String student = scanner.nextLine();
            int type = passAndSelect(student, requestGrade, priorityGrade);
            switch (type){
                case 1:
                    lists.add(0, student);
                    index2 ++;
                    index3 ++;
                    break;
                case 2:
                    lists.add(index2, student);
                    index3 ++;
                    break;
                case 3:
                    lists.add(index3, student);
                    break;
                case 4:
                    lists.add(lists.size() ,student);
                    break;
                default:
                    break;

            }
        }
        Arrays.sort(lists.toArray(), 0, index2, new Comparator<Object>() {
            @Override
            public int compare(Object s1, Object s2) {
                String[] s1Info = ((String)s1).split(" ");
                String[] s2Info = ((String)s2).split(" ");
                int s1Virtue = Integer.parseInt(s1Info[1]), s1Talent = Integer.parseInt(s1Info[2]);
                int s2Virtue = Integer.parseInt(s2Info[1]), s2Talent = Integer.parseInt(s2Info[2]);
                int sum1 = s1Virtue + s1Talent;
                int sum2 = s2Virtue + s2Talent;
                if (sum1 < sum2) {
                    return 1;
                } else if (sum1 > sum2) {
                    return -1;
                } else {
                    if (s1Virtue < s2Virtue) {
                        return 1;
                    } else if (s1Virtue > s2Virtue) {
                        return -1;
                    } else {
                        return Integer.compare(Integer.parseInt(s1Info[0]), Integer.parseInt(s2Info[0]));
                    }
                }
            }
        });
        lists.get(0);
        System.out.println(lists.size());
    }

//    private static void sort(ArrayList<String> students){
//        students.sort((s1, s2) -> {
//            String[] s1Info = s1.split(" ");
//            String[] s2Info = s2.split(" ");
//            int s1Virtue = Integer.parseInt(s1Info[1]), s1Talent = Integer.parseInt(s1Info[2]);
//            int s2Virtue = Integer.parseInt(s2Info[1]), s2Talent = Integer.parseInt(s2Info[2]);
//            int sum1 = s1Virtue + s1Talent;
//            int sum2 = s2Virtue + s2Talent;
//            if (sum1 < sum2) {
//                return 1;
//            } else if (sum1 > sum2) {
//                return -1;
//            } else {
//                if (s1Virtue < s2Virtue) {
//                    return 1;
//                } else if (s1Virtue > s2Virtue) {
//                    return -1;
//                } else {
//                    return Integer.compare(Integer.parseInt(s1Info[0]), Integer.parseInt(s2Info[0]));
//                }
//            }
//        });
//    }
    private static int passAndSelect(String student, int requestGrade, int priorityGrade){
        String[] stuInfo = student.split(" ");
        int talent = Integer.parseInt(stuInfo[2]);
        int virtue = Integer.parseInt(stuInfo[1]);
        if(virtue < requestGrade || talent <requestGrade){
            return 0;
        }
        if(virtue >= priorityGrade){
            if(talent >= priorityGrade){
                return 1;
            }else{
                return 2;
            }
        }else{
            if(talent > virtue){
                return 4;
            }else{
                return 3;
            }
        }
    }







}
