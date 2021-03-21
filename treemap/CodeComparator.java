package udemy.collection.treemap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Program showing how to compare two custom objects using .equals method
 */
class Course implements Comparable<Course> {

    private String sectionNo;
    private String lectureNo;

    public Course(String sectionNo, String lectureNo) {
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
    public int compareTo(Course o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();
        return code1.compareTo(code2);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.sectionNo);
        hash = 41 * hash + Objects.hashCode(this.lectureNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.sectionNo, other.sectionNo)) {
            return false;
        }
        if (!Objects.equals(this.lectureNo, other.lectureNo)) {
            return false;
        }
        return true;
    }
    
    
    

}

public class CodeComparator {

    public static void main(String[] args) {
        Map<Course, String> lectures = new TreeMap<Course, String>();
        lectures.put(new Course("S01", "L03"), "Generics");
        lectures.put(new Course("S01", "L01"), "Files Under JAVA");
        lectures.put(new Course("S02", "L03"), "Network Programming");
        lectures.put(new Course("S01", "L07"), "OOPS");
        lectures.put(new Course("S01", "L05"), "Methods");
        lectures.put(new Course("S01", "L03"), "Expressions");

        for (Entry<Course, String> entry : lectures.entrySet()) {
            System.out.println(entry);
        }
        Course course1 = new Course("S01", "L03");
        Course course2 = new Course("S01", "L03");

        System.out.println("Course1 hashCode: " + course1.hashCode() + "  Course2 hashCode: " + course2.hashCode());

        System.out.println(course1.equals(course2));

    }

}
