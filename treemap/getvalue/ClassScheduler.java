package udemy.collection.treemap.getvalue;

import java.util.Map;
import java.util.TreeMap;

/**
 * Program to show how we can perform search in maps. How to find the value
 * using key.
 */
class Code implements Comparable<Code> {

    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        super();
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" + "sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();
        return code1.compareTo(code2);
    }

}

public class ClassScheduler {

    public static void main(String[] args) {
        Map<Code, String> lectures = new TreeMap<Code, String>();
        lectures.put(new Code("S01", "L03"), "Generics");
        lectures.put(new Code("S01", "L01"), "Files Under JAVA");
        lectures.put(new Code("S02", "L03"), "Network Programming");
        lectures.put(new Code("S01", "L07"), "OOPS");
        lectures.put(new Code("S01", "L05"), "Methods");
        lectures.put(new Code("S01", "L03"), "Expressions");

        for (Map.Entry<Code, String> entry : lectures.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("");

        //to get the value at a key
        System.out.println("The lecture at Code(\"S01\", \"L03\"): " + lectures.get(new Code("S01", "L03")));

    }

}
